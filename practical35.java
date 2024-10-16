class practical35 extends Thread {
    private int value;

    // Constructor to initialize value
    public practical35(int value) {
        this.value = value;
    }

    @Override
    public void run() {
        try {
            // Pause the thread for 1 second (1000 milliseconds)
            Thread.sleep(1000);
            // Increment the value by 1
            value += 1;
            // Display the incremented value
            System.out.println("Value after 1 second: " + value);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create a thread object with initial value of 0
        practical35 thread = new practical35(0);
        // Start the thread
        thread.start();
    }
}
