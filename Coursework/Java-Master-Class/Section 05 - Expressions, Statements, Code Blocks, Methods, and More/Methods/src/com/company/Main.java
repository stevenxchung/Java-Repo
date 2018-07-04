package com.company;

public class Main {

    public static void main(String[] args) {
        int highScore = calculatedScore(true, 800, 5, 10);
        System.out.println("Your final score was " + highScore);

        highScore = calculatedScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        // ##### Practice #####
        String[] players = {"Steven", "Kevin", "Austin", "Larry", "Bob", "Cathy", "Hippo"};
        int[] scores = {1500, 900, 400, 50, 1000, 500, 100};

        int playerOnePosition = calculateHighScorePosition(scores[0]);
        displayHighScorePosition(players[0], playerOnePosition);

        int playerTwoPosition = calculateHighScorePosition(scores[1]);
        displayHighScorePosition(players[1], playerTwoPosition);

        int playerThreePosition = calculateHighScorePosition(scores[2]);
        displayHighScorePosition(players[2], playerThreePosition);

        int playerFourPosition = calculateHighScorePosition(scores[3]);
        displayHighScorePosition(players[3], playerFourPosition);

        int playerFivePosition = calculateHighScorePosition(scores[4]);
        displayHighScorePosition(players[4], playerFivePosition);

        int playerSixPosition = calculateHighScorePosition(scores[5]);
        displayHighScorePosition(players[5], playerSixPosition);

        int playerSevenPosition = calculateHighScorePosition(scores[6]);
        displayHighScorePosition(players[6], playerSevenPosition);

    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " is in position " + playerPosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
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
