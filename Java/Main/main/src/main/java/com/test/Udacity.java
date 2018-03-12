package com.test;
import java.util.*;

public class Udacity {

    public static void main(String[] args) {
       System.out.println(monopolyRoll());
    }

    public static int diceRoll(int sides) {
        //This expression generates a random double in the interval
        //[0, sides).
        double randomNumber = Math.random() * sides;
        //Our random number is now in the interval [1, sides + 1)
        randomNumber = randomNumber + 1;
        //Casting the random number to an integer will round it down
        //to an integer in the 1 to sides range.
        return (int) randomNumber;
        }

    public static int monopolyRoll() {
        int roll1 = diceRoll(6);
        int roll2 = diceRoll(6);
        int total = roll1 + roll2;
        int numRolls = 0;
     
        while (roll1 == roll2) {
            roll1 = diceRoll(6);
            roll2 = diceRoll(6);
            total = total + roll1 + roll2;
            numRolls += 1;
            if (numRolls == 3) {
                return -1;
            }
        }

        System.out.println("Number of Rolls: " + numRolls);
        System.out.println("Total Sum: " + total);

        return total;
    }
}

