// Program using Runnable interface
class practical32B implements Runnable {
    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new practical32B());
        thread.start(); // Start the thread
    }
}

