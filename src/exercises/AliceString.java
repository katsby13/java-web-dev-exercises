package exercises;

import java.util.Locale;
import java.util.Scanner;

public class AliceString {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister" +
                " was reading, but it had no pictures or conversations in it, 'and what is the use" +
                " of a book,' thought Alice 'without pictures or conversation?";
        String aliceLC = alice.toLowerCase();
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a term to search for: ");
        String term = input.nextLine().toLowerCase();

        boolean search = aliceLC.contains(term);
        System.out.println("Term found in sentence: " + search);
    }
}
