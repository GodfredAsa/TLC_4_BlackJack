package com.company;

public class Card {
    private Suit suit;
    private Rank rankValue;
    private int cardValue;

    public Card(Suit suit, Rank rankValue, int cardValue) {
        this.suit = suit;
        this.rankValue = rankValue;
        this.cardValue = cardValue;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRankValue() {
        return rankValue;
    }



    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    @Override
    public String toString() {
        return  "\n" + suit + "- " + rankValue + " [" +cardValue+ "]" ;
    }
}
