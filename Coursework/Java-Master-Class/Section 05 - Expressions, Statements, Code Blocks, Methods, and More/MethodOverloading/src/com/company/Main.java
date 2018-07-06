package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Steven", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        // ##### Practice #####
        calcFeetAndInchesToCentimeters(5, 5);
        calcFeetAndInchesToCentimeters(5);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    // ##### Practice #####
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            double feetToCenti = feet * 12 * 2.54;
            double inchesToCenti = inches * 2.54;
            double total = feetToCenti + inchesToCenti;
            System.out.println(feet + " ft and " + inches + " in is equal to " + total + " cm");
            return total;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feet = (int) inches / 12;
            double result = calcFeetAndInchesToCentimeters(feet, inches);
            return result;
        }
        return -1;
    }

}
