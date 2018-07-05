package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));  // True
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));     // False
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));         // True

        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.1757));   // True
        System.out.println(areEqualByThreeDecimalPlaces(4.0, 5.0));         // False
    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        String firstString = Double.toString(first);
        String secondString = Double.toString(second);
        int decimalPosition = firstString.indexOf('.');
        for (int i = 0; i < firstString.length() - decimalPosition + 1; i++) {
            if (firstString.charAt(i) != secondString.charAt(i)) {
                return false;
            } else if (i > 3) {
                return true;
            }
        }
        return true;
    }
}
