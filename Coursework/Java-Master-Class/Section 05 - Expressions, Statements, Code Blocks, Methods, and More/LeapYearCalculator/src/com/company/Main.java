package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));  // False
        System.out.println(isLeapYear(1600));   // True
        System.out.println(isLeapYear(2017));   // False
        System.out.println(isLeapYear(2000));   // True
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                return true;
            }
        }
        return false;
    }
}
