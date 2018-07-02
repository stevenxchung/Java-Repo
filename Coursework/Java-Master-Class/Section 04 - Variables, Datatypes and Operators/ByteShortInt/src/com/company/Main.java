package com.company;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue = -2_147_483_648;
	    int myMaxValue = 2_147_483_647;
	    int myTotal = (myMinValue/2);
	    System.out.println("myTotal = " + myTotal);

	    // byte has a width of 8
	    byte myByteValue = -128;
	    byte myNewByteValue = (byte) (myByteValue/2);
	    System.out.println("myNewByteValue = " + myNewByteValue);

	    // short has a width of 16
	    short myShortValue = 32767;

	    // long has a width of 64
	    long myLongValue = 9_223_372_036_854_775_807L;

	    // ##### Practice #####
        byte ex1 = 10;
        short ex2 = 20;
        int ex3 = 50;
        long ex4 = 50000L + 10L * (ex1 + ex2 + ex3);
        short ex5 = (short) (1000 + 10 * (ex1 + ex2 + ex3));

        System.out.println("Result (long) = " + ex4);
        System.out.println("Result (short) = " + ex5);
    }
}
