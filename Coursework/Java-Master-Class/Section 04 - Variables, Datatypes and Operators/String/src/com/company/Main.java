package com.company;

public class Main {

    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println("myString is Equal to " + myString);
        myString = myString + " and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2015";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);
        double doubleNumber = 120.45;
        lastString = lastString + doubleNumber;
        System.out.println("lastString value: " + lastString);
    }
}
