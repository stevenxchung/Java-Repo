package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(bark(true, 1));  // True
        System.out.println(bark(false, 2)); // False
	    System.out.println(bark(true, 8));  // False
	    System.out.println(bark(true, -1)); // False
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if (barking && (hourOfDay >= 0 && hourOfDay < 8) || hourOfDay == 23) {
            return true;
        }
        return false;
    }
}
