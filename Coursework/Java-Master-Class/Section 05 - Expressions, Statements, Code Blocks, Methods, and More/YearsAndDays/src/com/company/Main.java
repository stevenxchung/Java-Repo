package com.company;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(0);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes >= 0) {
            long yearsFromMins = minutes / 60 / 24 / 365;
            long remainingDays = minutes / 60 / 24 % 365;
            System.out.println(minutes + " min = " + yearsFromMins + " y and " + remainingDays + " d");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
