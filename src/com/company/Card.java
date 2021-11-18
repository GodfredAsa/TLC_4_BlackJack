package com.company;

public class Card {
    private Suit suit;
    private Rank suitvalue;

    public Card(Suit suit, Rank suitvalue) {
        this.suit = suit;
        this.suitvalue = suitvalue;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getSuitvalue() {
        return suitvalue;
    }

    public void setSuitvalue(Rank suitvalue) {
        this.suitvalue = suitvalue;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", suitvalue=" + suitvalue +
                '}' + "\n";
    }
}
