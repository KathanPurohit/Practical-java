public class practical262 {
    
    // Method that throws checked exception (IOException)
    public static void readFile() throws java.io.IOException {
        throw new java.io.IOException("File not found exception (Checked)");
    }

    // Method that throws unchecked exception (ArithmeticException)
    public static void divideByZero() {
        int result = 10 / 0; // Will cause ArithmeticException
    }

    public static void main(String[] args) {
        // Checked Exception Example (IOException)
        try {
            readFile();
        } catch (java.io.IOException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        // Unchecked Exception Example (ArithmeticException)
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }

        // Checked Exception Example (ClassNotFoundException)
        try {
            Class.forName("SomeNonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        // Unchecked Exception Example (NullPointerException)
        try {
            String str = null;
            System.out.println(str.length()); // Will cause NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }
    }
}

