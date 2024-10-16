import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class practical41 {
    // HashSet to store all Java keywords
    private static final HashSet<String> keywords = new HashSet<>();

    static {
        // Add all Java keywords to the HashSet
        String[] keywordArray = {
                "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue", 
                "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "goto", "if", 
                "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "package", "private", 
                "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this", 
                "throw", "throws", "transient", "try", "void", "volatile", "while"
        };

        // Add all keywords to the set
        for (String keyword : keywordArray) {
            keywords.add(keyword);
        }
    }

    // Method to count keywords in a Java source file
    public static int countKeywords(File file) throws FileNotFoundException {
        int keywordCount = 0;

        // Create a scanner to read the file
        Scanner scanner = new Scanner(file);

        // Read the file word by word
        while (scanner.hasNext()) {
            String word = scanner.next();

            // Check if the word is a Java keyword
            if (keywords.contains(word)) {
                keywordCount++;
            }
        }

        scanner.close(); // Close the scanner
        return keywordCount;
    }

    public static void main(String[] args) {
        // Example usage
        try {
            // Specify the path to the Java source file
            File file = new File("Path_to_Java_File.java");

            // Count the number of keywords in the file
            int count = countKeywords(file);

            // Print the keyword count
            System.out.println("Number of Java keywords in the file: " + count);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
