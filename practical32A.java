// Program using Thread class
public class practical32A extends Thread {
    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        practical32A thread = new practical32A();
        thread.start(); // Start the thread
    }
}
