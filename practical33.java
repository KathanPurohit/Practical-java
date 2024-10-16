import java.util.Scanner;

// Class to perform partial summation using Runnable interface
class PartialSum implements Runnable {
    private int start;
    private int end;
    private long sum;

    public PartialSum(int start, int end) {
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    public long getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }
}

public class practical33
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input N (the range of numbers) and number of threads
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        System.out.print("Enter the number of threads: ");
        int numThreads = sc.nextInt();

        // Create an array to hold thread objects
        Thread[] threads = new Thread[numThreads];
        PartialSum[] tasks = new PartialSum[numThreads];

        // Calculate how many numbers each thread will sum
        int chunkSize = N / numThreads;
        int start = 1;
        int end;

        // Distribute the task among threads
        for (int i = 0; i < numThreads; i++) {
            if (i == numThreads - 1) {
                end = N; // Last thread gets any leftover numbers
            } else {
                end = start + chunkSize - 1;
            }

            tasks[i] = new PartialSum(start, end);
            threads[i] = new Thread(tasks[i]);
            threads[i].start(); // Start the thread
            start = end + 1;
        }

        // Wait for all threads to finish
        long finalSum = 0;
        try {
            for (int i = 0; i < numThreads; i++) {
                threads[i].join(); // Wait for each thread to complete
                finalSum += tasks[i].getSum(); // Add the partial sum from each thread
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display the final result
        System.out.println("The sum of numbers from 1 to " + N + " is: " + finalSum);
    }
}
