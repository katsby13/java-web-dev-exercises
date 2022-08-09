package org.launchcode.java.quiz;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        TrueFalse q1 = new TrueFalse("T/F? A dog is a cat","false");
        MultipleChoice qm1 = new MultipleChoice("Which words start with A?", "A. apple", "B. dog", "C. animal", "D. cat", "ac");

//      vvv HOW TO ASK THE QUESTIONS IN QUIZRUNNER!!! vvv

//        Scanner input;
//        input = new Scanner(System.in);
//        System.out.println(qm1.getaQuestion());
//        System.out.println(qm1.getAnswer1());
//        System.out.println(qm1.getAnswer2());
//        System.out.println(qm1.getAnswer3());
//        System.out.println(qm1.getAnswer4());
//        String userAnswer = input.next().toLowerCase();
//        if (userAnswer.equals(qm1.getCorrectAnswer())) {
//            System.out.println("Correct");
//        } else {
//            System.out.println("Incorrect");
//        }
//
//
//        input = new Scanner(System.in);
//        System.out.println(q1.getaQuestion());
//        String userAnswer2 = input.next().toLowerCase();
//        if (userAnswer2.equals(q1.getCorrectAnswer())) {
//            System.out.println("Correct");
//        } else {
//            System.out.println("Incorrect");
//        }

    }
}
