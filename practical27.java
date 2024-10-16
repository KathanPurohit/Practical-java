import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class practical27 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java LineCounts file1.txt file2.txt ...");
            return;
        }

        for (String filename : args) {
            countLines(filename);
        }
    }

    private static void countLines(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int lineCount = 0;
            while (reader.readLine() != null) {
                lineCount++;
            }
            System.out.println(filename + ": " + lineCount + " lines");
        } catch (IOException e) {
            System.err.println("Error reading " + filename + ": " + e.getMessage());
        }
    }
}