import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class practical29 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java WordSearcher <filename> <word>");
            return;
        }

        String filename = args[0];
        String searchWord = args[1].toLowerCase();

        try {
            List<SearchResult> results = searchWordInFile(filename, searchWord);
            
            if (results.isEmpty()) {
                System.out.println("The word '" + searchWord + "' was not found in the file.");
            } else {
                System.out.println("The word '" + searchWord + "' was found " + results.size() + " times:");
                for (SearchResult result : results) {
                    System.out.println("Line " + result.getLineNumber() + ": " + result.getLine());
                }
                
                // Demonstrating use of Integer wrapper class
                Integer totalOccurrences = results.size();
                System.out.println("\nTotal occurrences (using Integer wrapper): " + totalOccurrences);
                System.out.println("Is total occurrences greater than 5? " + totalOccurrences.compareTo(5));
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    private static List<SearchResult> searchWordInFile(String filename, String searchWord) throws IOException {
        List<SearchResult> results = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNumber = 0;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (line.toLowerCase().contains(searchWord)) {
                    results.add(new SearchResult(lineNumber, line));
                }
            }
        }
        return results;
    }
}

// Wrapper class to store search results
class SearchResult {
    private final Integer lineNumber;  // Using Integer wrapper class
    private final String line;

    public SearchResult(int lineNumber, String line) {
        this.lineNumber = lineNumber;  // Auto-boxing
        this.line = line;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    public String getLine() {
        return line;
    }
}