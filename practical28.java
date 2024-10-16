import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class practical28 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java CharacterCounter <character> [filename]");
            System.out.println("If filename is not provided, xanadu.txt will be used.");
            return;
        }

        char targetChar = args[0].charAt(0);
        String filename = (args.length > 1) ? args[1] : "xanadu.txt";

        try {
            int count = countCharacterOccurrences(filename, targetChar);
            System.out.println("The character '" + targetChar + "' appears " + count + " times in " + filename);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    private static int countCharacterOccurrences(String filename, char targetChar) throws IOException {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int c;
            while ((c = reader.read()) != -1) {
                if (Character.toLowerCase((char) c) == Character.toLowerCase(targetChar)) {
                    count++;
                }
            }
        }
        return count;
    }
}
