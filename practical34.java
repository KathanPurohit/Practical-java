import java.util.Random;

// Thread that generates a random number every second
class NumberGenerator extends Thread {
    public void run() {
        Random rand = new Random();
        while (true) {
            int num = rand.nextInt(100); // Generate a random number between 0 and 99
            System.out.println("Generated Number: " + num);

            if (num % 2 == 0) {
                new SquareCalculator(num).start(); // Even number -> Calculate square
            } else {
                new CubeCalculator(num).start(); // Odd number -> Calculate cube
            }

            try {
                Thread.sleep(1000); // Pause for 1 second before generating the next number
            } catch (InterruptedException e) {
                System.out.println("Number Generator interrupted.");
            }
        }
    }
}

// Thread that calculates the square of an even number
class SquareCalculator extends Thread {
    private int number;

    public SquareCalculator(int number) {
        this.number = number;
    }

    public void run() {
        int square = number * number;
        System.out.println("Square of " + number + " is: " + square);
    }
}

// Thread that calculates the cube of an odd number
class CubeCalculator extends Thread {
    private int number;

    public CubeCalculator(int number) {
        this.number = number;
    }

    public void run() {
        int cube = number * number * number;
        System.out.println("Cube of " + number + " is: " + cube);
    }
}

public class practical34 {
    public static void main(String[] args) {
        // Start the number generator thread
        NumberGenerator generator = new NumberGenerator();
        generator.start();
    }
}
