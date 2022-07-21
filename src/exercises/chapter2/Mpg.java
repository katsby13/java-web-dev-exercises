package exercises.chapter2;

import java.util.Scanner;

public class Mpg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have been driven: ");
        Double miles = input.nextDouble();

        System.out.println("How many gallons of gas have been consumed: ");
        Double gallons = input.nextDouble();

        Double mpg = (miles / gallons);
        System.out.println("Your miles per gallon: " + mpg);
    }
}
