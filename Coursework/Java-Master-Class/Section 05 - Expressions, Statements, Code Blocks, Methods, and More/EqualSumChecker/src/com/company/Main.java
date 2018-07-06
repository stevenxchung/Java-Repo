package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));   // False
        System.out.println(hasEqualSum(1, 1, 2));   // True
        System.out.println(hasEqualSum(1, -1, 0));  // True
    }

    public static boolean hasEqualSum(int first, int second, int sum) {
        int result = first + second;
        if (result == sum) {
            return true;
        }
        return false;
    }
}
