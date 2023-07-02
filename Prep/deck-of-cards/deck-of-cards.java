import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
Given an array of 52 cards, write a program that provides the following functionalities:
- Shuffling the deck
- Dealing one card at a time until there are no more cards
Bonus:
- Add interactive option when dealing a card:
    - Allow user to specify how many cards they want (1-52)
    - Return "All cards dealt!" when empty
 */
class DeckOfCards {

    private static final List<String> houseDeck = new ArrayList<>(Arrays.asList(
            "Ace of Hearts", "Ace of Diamonds", "Ace of Clubs", "Ace of Spades",
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
            "King of Hearts", "King of Diamonds", "King of Clubs", "King of Spades"
    ));
    private static final List<String> playerDeck = new ArrayList<>();

    private static void addCardsToPlayerDeck(int numberOfCardsToAdd) {
        System.out.printf("Dealing %s cards to player's deck...%n", numberOfCardsToAdd);
        for (int i = 0; i < numberOfCardsToAdd; i++) {
            String card = houseDeck.get(i);
            playerDeck.add(card);
            System.out.println(card);
        }
        // Remove the transferred elements from houseDeck
        houseDeck.subList(0, numberOfCardsToAdd).clear();
        System.out.printf("Added %s cards to player's deck!%n", numberOfCardsToAdd);
    }

    private static void printInvalidMessage() {
        System.out.printf("Invalid input! Please enter an integer between 1 and %d.%n", houseDeck.size());
    }

    public static void main(String[] args) {
        // Shuffle deck
        Collections.shuffle(houseDeck);

        // Loop until cards are all out
        Scanner scanner = new Scanner(System.in);
        while (houseDeck.size() > 0) {
            System.out.printf("How many cards do would you like (choose 1-%d)?%n", houseDeck.size());
            while (!scanner.hasNextInt()) {
                printInvalidMessage();
                scanner.next();
            }
            int number = scanner.nextInt();

            if (number >= 1 && number <= houseDeck.size()) {
                addCardsToPlayerDeck(number);
            } else {
                printInvalidMessage();
            }
        }

        System.out.println("All cards dealt!");
        System.out.println(playerDeck);
        scanner.close();
    }
}