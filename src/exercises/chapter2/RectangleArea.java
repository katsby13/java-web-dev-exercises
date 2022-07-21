package exercises.chapter2;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter length of rectangle: ");
        int length = input.nextInt();
        System.out.println("Length = " + length);

        System.out.println("Please enter width of rectangle: ");
        int width = input.nextInt();
        System.out.println("Width = " + width);

        int area = (length * width);
        System.out.println("Area of rectangle = " + area);
    }
}
