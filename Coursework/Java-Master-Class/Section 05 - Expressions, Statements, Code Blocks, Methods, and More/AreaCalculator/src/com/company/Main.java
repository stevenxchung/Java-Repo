package com.company;

public class Main {

    public static void main(String[] args) {
        area(5.0);
        area(-1);
        area(5.0, 4.0);
        area(-1.0, 4.0);
    }

    public static double area(double radius) {
        if (radius >= 0) {
            double areaCircle = Math.PI * (radius * radius);
            System.out.println("A circle with radius = " + radius + " has an area of " + areaCircle);
            return areaCircle;
        }
        System.out.println("Invalid");
        return -1;
    }

    public static double area(double x, double y) {
        if (x >= 0 && y >= 0) {
            double areaSquare = x * y;
            System.out.println("A square with dimensions = " + x + " x units and " + y + " y units has an area of " + areaSquare);
            return areaSquare;
        }
        System.out.println("Invalid");
        return -1;
    }
}
