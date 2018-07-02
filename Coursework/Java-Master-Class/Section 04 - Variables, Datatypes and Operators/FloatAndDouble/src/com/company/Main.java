package com.company;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes)
        int myIntValue = 5 / 3;
        // width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        // width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // ##### Practice #####
        double pounds = 200d;
        double lb2kg = 0.45359237d;

        double result = pounds * lb2kg;

        System.out.println("Result = " + result);
    }
}
