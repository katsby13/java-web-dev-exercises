package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        HouseCat zelenia = new HouseCat("Zelenia", 8);
        zelenia.eat();
        System.out.println(zelenia.isTired());

        HouseCat ham = new HouseCat("Ham");
        System.out.println(ham.getWeight());
    }
}