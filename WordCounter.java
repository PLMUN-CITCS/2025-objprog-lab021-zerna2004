import java.util.Scanner;

public class WordCounter {

    // Method to get a sentence input from the user
    public static String getSentenceInput() {
        try (Scanner scanner = new Scanner(System.in)) {  // Try-with-resources ensures the scanner is closed
            System.out.print("Enter a sentence: ");
            return scanner.nextLine(); // Return the entered sentence
        } // The scanner is automatically closed here
    }

    // Method to count the number of words in a given sentence
    public static int countWords(String sentence) {
        // Split the sentence by spaces and filter out any empty strings
        String[] words = sentence.trim().split("\\s+");
        return words.length; // Return the number of words
    }

    public static void main(String[] args) {
        // Call getSentenceInput() to get the sentence from the user
        String sentence = getSentenceInput();
        
        // Call countWords() to calculate the word count
        int wordCount = countWords(sentence);
        
        // Display the word count to the user
        System.out.println("The sentence has " + wordCount + " words.");
    }
}
