package com.mgm.blackjack;

public class Card {
    private String suit;
    private String value;
    private boolean isFaceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }

    public String getSuit(){
        // only return the suit if the card is face up
        if(isFaceUp){
            return suit;
        } else {
            return "#";
        }
    }

    public String getValue(){
        if(isFaceUp){

            return value;
        } else {
            return "#";
        }
    }


    public int getPointValue() {
        if (isFaceUp) {
            if (value.equals("A")) {
                return 11;
            } else if (value.equals("K") || value.equals("Q") || value.equals("J")) {
                return 10;
            } else {
                return Integer.parseInt(value); // for 2-10
            }
        } else {
            return 0;
        }
    }



    public boolean isFaceUp(){
        return isFaceUp;
    }

    public void flip(){
        isFaceUp = !isFaceUp;
    }
}