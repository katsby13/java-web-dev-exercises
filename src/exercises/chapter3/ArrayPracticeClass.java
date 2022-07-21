package exercises.chapter3;

import java.util.Arrays;

public class ArrayPracticeClass {
    public static void main(String[] args) {

// Part 5:

        String sentence = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        String[] sentenceArray = sentence.split("\\.");
        System.out.println(Arrays.toString(sentenceArray));

// Parts 3 & 4:

//        String sentence = "I would not, could not, in a box. I would not, could not with a fox. " +
//                "I will not eat them in a house. I will not eat them with a mouse.";
//
//        String[] sentenceArray = sentence.split(" ");
//        System.out.println(Arrays.toString(sentenceArray));

// Part 2:

//        int[] numArray = { 1, 1, 2, 3, 5, 8 };
//
//        for (int i : numArray) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }

// Part 1:

//        int[] numArray = { 1, 1, 2, 3, 5, 8 };
//
//        for (int i : numArray) {
//                System.out.println(i);
//            }
//        }

    }
}
