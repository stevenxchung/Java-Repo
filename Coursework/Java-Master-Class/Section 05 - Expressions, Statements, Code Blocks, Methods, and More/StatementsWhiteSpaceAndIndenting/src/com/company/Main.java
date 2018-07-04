package com.company;

public class Main {

    public static void main(String[] args) {

        int myVar = 50;
        if (myVar == 50) {
            System.out.println("The value of myVar is: " + myVar);
        }

        myVar++;
        myVar--;
        System.out.println("This is a test");

        System.out.println("Another one!" +
                " Another one! " +
                " Another one!");

        int anotherVar = 50;
        myVar--;
        System.out.println("Another one!");
    }
}
