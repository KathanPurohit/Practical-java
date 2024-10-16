import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.Set;

public class practical40 {
    public static void main(String[] args) {
        // Create a TreeMap to store word frequencies in alphabetical order
        Map<String, Integer> wordMap = new TreeMap<>();

        // Read input text from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = scanner.nextLine();

        // Split the text into words (assume words are separated by whitespace or punctuation)
        String[] words = text.toLowerCase().split("\\W+");

        // Count occurrences of each word
        for (String word : words) {
            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1); // Increment count if word already exists
            } else {
                wordMap.put(word, 1); // Add new word with count 1
            }
        }

        // Get the entry set from the map (which contains words in alphabetical order)
        Set<Map.Entry<String, Integer>> entrySet = wordMap.entrySet();

        // Display the words and their occurrences
        System.out.println("\nWord occurrences in alphabetical order:");
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
