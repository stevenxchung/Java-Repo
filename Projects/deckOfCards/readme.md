# Deck of Cards attempt in Java by Steven Chung

This program follows the same implementation concept as in the [python deckOfCards](https://github.com/stevenxchung/Python-Repo/tree/master/Projects/deckOfCards). For more information on this project visit the python link mentioned previously.

```java
import java.util.*;

public class deckOfCards {
    // Swaps a card with another random generated card denoted by randomCard
    // which is within the range of deckOfCards
    public String shuffle(String[] deck, int totalCards) {
        Random r = new Random();
        // Fisher-Yates shuffle, starting from the last card and decreasing
        // until there are no cards left
        for (int i = totalCards - 1; i > 0; i--) {
            int j = r.nextInt(i);

            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

        return deck;
    }
    // Function to deal one card at a time as long as the deck is not empty
    public String deal_one_card(String[] deck, int totalCards) {
        if (totalCards != 0) {
            System.out.println(deck[0]);
            for (int k = 1; k < totalCards - 1; k++) {
                deck = deck[k];
            }
            totalCards -= 1;
        } else {
            System.out.println("Sorry, there are no cards left in the deck.");
        }

        return deck;
    }

    // Main function
    public void main(String[] args) {
        // Array of all 52 cards
        String[] deck = {"Ace of Hearts", "Ace of Diamonds", "Ace of Clubs", "Ace of Spades",
                        "2 of Hearts", "2 of Diamonds", "2 of Clubs", "2 of Spades",
                        "3 of Hearts", "3 of Diamonds", "3 of Clubs", "3 of Spades",
                        "4 of Hearts", "4 of Diamonds", "4 of Clubs", "4 of Spades",
                        "5 of Hearts", "5 of Diamonds", "5 of Clubs", "5 of Spades",
                        "6 of Hearts", "6 of Diamonds", "6 of Clubs", "6 of Spades",
                        "7 of Hearts", "7 of Diamonds", "7 of Clubs", "7 of Spades",
                        "8 of Hearts", "8 of Diamonds", "8 of Clubs", "8 of Spades",
                        "9 of Hearts", "9 of Diamonds", "9 of Clubs", "9 of Spades",
                        "10 of Hearts", "10 of Diamonds", "10 of Clubs", "10 of Spades",
                        "Jack of Hearts", "Jack of Diamonds", "Jack of Clubs", "Jack of Spades",
                        "Queen of Hearts", "Queen of Diamonds", "Queen of Clubs", "Queen of Spades",
                        "King of Hearts", "King of Diamonds", "King of Clubs", "King of Spades"};

        int totalCards = deck.length;

        // The idea here is the same as in Python but still working out some kinks
        while (true) {
            System.out.println("How many cards would you like? ");
            Scanner callCards = new Scanner(System.in);
            int n = callCards.nextInt();

            if (n > 0 && n < 53) {
                for (int call = 0; call < totalCards - 1; call++) {
                    shuffle(deck, totalCards);
                    deal_one_card(deck, totalCards);
                }
                if (totalCards == 0) {
                    System.out.println("Sorry, there are no cards left in the deck.");
                    break;
                }
            } else if (n >= 53) {
                System.out.println("Sorry, please enter a value less than 53");
            } else {
                System.out.println("Sorry, please enter a valid input (non-zero, positive integer).");
            }
            // If there are no more cards in the deck, end the program
            if (totalCards == 0) {
                break;
            }
        }

        /*
        for (int call = 0; call < 52; call++) {
            shuffle(deck, totalCards);
            deal_one_card(deck, totalCards);
        }
        */
    }
}
```
