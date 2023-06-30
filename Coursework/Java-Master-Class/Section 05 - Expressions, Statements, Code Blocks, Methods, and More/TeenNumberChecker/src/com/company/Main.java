package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));     // True
        System.out.println(hasTeen(23, 15, 42));    // True
        System.out.println(hasTeen(22, 23, 34));    // False
    }

    public static boolean hasTeen(int first, int second, int third) {
        return (first >= 13 && first <= 19) || (second >= 13 && second <= 19) || (third >= 13 && third <= 19);
    }
}
