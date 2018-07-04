package com.company;

public class Main {

    public static void main(String[] args) {
        int highScore = calculatedScore(true, 800, 5, 10);
        System.out.println("Your final score was " + highScore);

        highScore = calculatedScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);
    }

    public static int calculatedScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }

}
