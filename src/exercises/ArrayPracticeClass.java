package exercises;

import java.util.Arrays;

public class ArrayPracticeClass {
    public static void main(String[] args) {
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] sentenceArray = sentence.split("\\.");

        System.out.println(Arrays.toString(sentenceArray));

//        int[] numArray = { 1, 1, 2, 3, 5, 8 };
//
//        for (int i : numArray) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
    }
}
