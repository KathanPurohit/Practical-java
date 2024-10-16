class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running with priority " + Thread.currentThread().getPriority());
    }
}

public class practical36 {
    public static void main(String[] args) {
        // Creating three threads with names
        MyThread firstThread = new MyThread("FIRST");
        MyThread secondThread = new MyThread("SECOND");
        MyThread thirdThread = new MyThread("THIRD");

        // Setting priorities
        firstThread.setPriority(3);
        // secondThread priority remains 5 (default)
        thirdThread.setPriority(7);

        // Starting the threads
        firstThread.start();
        secondThread.start();
        thirdThread.start();
    }
}
