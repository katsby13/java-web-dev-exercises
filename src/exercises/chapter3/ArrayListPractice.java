package exercises.chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 );
        ArrayList<Integer> numSet = new ArrayList<>();
        numSet.addAll(nums);

        List<String> sentence = Arrays.asList("dog", "snake", "kitten", "bunny", "otter", "deer");

        System.out.println(ArrayListPractice.sumOfEvens(numSet));
        System.out.println(ArrayListPractice.fiveLetters(sentence));
        System.out.println(ArrayListPractice.chooseChars(sentence));
    }

// Part 1:
    public static int sumOfEvens(ArrayList<Integer> arr) {
        int evenSum = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        return evenSum;
    }


// Part 2:

    public static ArrayList<String> fiveLetters(List<String> words) {
        ArrayList<String> fiveLetterWords = new ArrayList<>();
        for (String i : words) {
            if (i.length() == 5) {
                fiveLetterWords.add(i);
            }
        }
        return fiveLetterWords;

    }

// Part 3:

    public static ArrayList<String> chooseChars(List<String> words) {
        ArrayList<String> charWords = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number of characters to search: ");
        int chars = input.nextInt();
        input.close();

        for (String i : words) {
            if (i.length() == chars) {
                charWords.add(i);
            }
        }
        return charWords;

    }
}