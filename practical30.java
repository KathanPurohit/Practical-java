import java.io.*;
import java.nio.file.*;

public class practcal30 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java FileCopy <source_file> <destination_file>");
            return;
        }

        String sourceFile = args[0];
        String destinationFile = args[1];

        try {
            copyFile(sourceFile, destinationFile);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }
    }

    private static void copyFile(String sourceFile, String destinationFile) throws IOException {
        // Check if source file exists
        if (!Files.exists(Paths.get(sourceFile))) {
            throw new FileNotFoundException("Source file not found: " + sourceFile);
        }

        // Create destination file if it doesn't exist
        Files.createDirectories(Paths.get(destinationFile).getParent());

        // Copy file contents
        try (InputStream in = new FileInputStream(sourceFile);
             OutputStream out = new FileOutputStream(destinationFile)) {
            
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
        }
    }
}