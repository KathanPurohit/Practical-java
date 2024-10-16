// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class practical261 {
    
    // Method using 'throws' keyword
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // Throwing the user-defined exception
            throw new InvalidAgeException("Age is not valid for voting.");
        } else {
            System.out.println("Welcome to vote!");
        }
    }

    public static void main(String[] args) {
        int age = 19; // Simulate user input for age

        try {
            // Calling method that throws custom exception
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Caught the exception: " + e.getMessage());
        }
    }
}
