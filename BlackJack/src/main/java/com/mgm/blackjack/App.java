package com.mgm.blackjack;

import com.mgm.blackjack.Card;
import com.mgm.blackjack.Deck;
import com.mgm.blackjack.Hand;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask for player names
        System.out.print("Enter Player 1 name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter Player 2 name: ");
        String name2 = scanner.nextLine();

        // Create deck and shuffle
        Deck deck = new Deck();
        deck.shuffle();

        // Create hands for each player
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();

        // Deal 2 cards to each player
        hand1.addCard(deck.deal());
        hand1.addCard(deck.deal());

        hand2.addCard(deck.deal());
        hand2.addCard(deck.deal());

        // Show each player's hand
        System.out.println("\n" + name1 + "'s Hand:");
        hand1.showHand();
        System.out.println("Total Points: " + hand1.getTotalPoints());

        System.out.println("\n" + name2 + "'s Hand:");
        hand2.showHand();
        System.out.println("Total Points: " + hand2.getTotalPoints());

        // Determine the winner
        int score1 = hand1.getTotalPoints();
        int score2 = hand2.getTotalPoints();

        System.out.println("\nResult:");
        if (score1 > 21 && score2 > 21) {
            System.out.println("Both players busted!");
        } else if (score1 > 21) {
            System.out.println(name2 + " wins!");
        } else if (score2 > 21) {
            System.out.println(name1 + " wins!");
        } else if (score1 > score2) {
            System.out.println(name1 + " wins!");
        } else if (score2 > score1) {
            System.out.println(name2 + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
