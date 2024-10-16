import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer {
    private final int capacity;
    private final Queue<Integer> buffer = new LinkedList<>();

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }

    // Producer method
    public synchronized void produce(int value) throws InterruptedException {
        while (buffer.size() == capacity) {
            System.out.println("Buffer is full. Producer is waiting...");
            wait(); // Wait if the buffer is full
        }
        buffer.add(value);
        System.out.println("Produced: " + value);
        notify(); // Notify the consumer
    }

    // Consumer method
    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("Buffer is empty. Consumer is waiting...");
            wait(); // Wait if the buffer is empty
        }
        int value = buffer.poll();
        System.out.println("Consumed: " + value);
        notify(); // Notify the producer
        return value;
    }
}

class Producer extends Thread {
    private final SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int value = 0;
        while (true) {
            try {
                buffer.produce(++value);
                Thread.sleep(500); // Simulate time taken to produce an item
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private final SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                buffer.consume();
                Thread.sleep(1000); // Simulate time taken to consume an item
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class practical37 {
    public static void main(String[] args) {
        // Create a shared buffer with a capacity of 5
        SharedBuffer buffer = new SharedBuffer(5);

        // Create producer and consumer threads
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        // Start the threads
        producer.start();
        consumer.start();
    }
}
