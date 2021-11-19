package com.company;

public class Card {
    private Suit suit;
    private Rank suitvalue;
    private int cardValue;

    public Card(Suit suit, Rank suitvalue, int cardValue) {
        this.suit = suit;
        this.suitvalue = suitvalue;
        this.cardValue = cardValue;
    }

//    public Suit getSuit() {
//        return suit;
//    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getSuitvalue() {
        return suitvalue;
    }



    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    @Override
    public String toString() {
        return  "\n" + suit + "- " + suitvalue+ " [" +cardValue+ "]" ;
    }
}
