package com.mgm.blackjack;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        card.flip(); // turn the card face up
        cards.add(card);
    }

    public int getTotalPoints() {
        int total = 0;
        int aceCount = 0;

        for (Card card : cards) {
            int value = card.getPointValue();
            total += value;
            if (card.getValue().equals("A")) {
                aceCount++;
            }
        }

        // Adjust for Aces if total is over 21
        while (total > 21 && aceCount > 0) {
            total -= 10; // count Ace as 1 instead of 11
            aceCount--;
        }

        return total;
    }

    public void showHand() {
        for (Card card : cards) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }
    }

    public int getCardCount() {
        return cards.size();
    }

    public boolean isBust() {
        return getTotalPoints() > 21;
    }
}
