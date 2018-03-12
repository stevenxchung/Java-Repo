// Java Program to shuffle a given array
package com.test;
import java.util.Random;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Shuffle
{
    // A Function to generate a random permutation of arr[]
    static String shuffleRand(int deck[], int totalcards, String stack)
    {
        // Creating a object for Random class
        Random r = new Random();
         
        // Fisher-Yates shuffle, starting from the last card and decreasing
        // until there are no cards left
        for (int i = totalcards - 1; i > 0; i--) {
             
            // Pick a random index from 0 to i
            int j = r.nextInt(i);
             
            // Swap deck[i] with the element at random index
            int temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
        // Returns the random array
        stack = Arrays.toString(deck);
        return stack;
    }

    // Main function
    public static void main(String[] args) 
    {
        int[] deck = IntStream.range(1, 53).toArray();
        int totalcards = deck.length;
        String stack = "";
        System.out.println(shuffleRand(deck, totalcards, stack));
    }
}