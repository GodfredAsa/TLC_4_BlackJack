package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {

    @Test
    public void getSuit() {
        Card card = new Card(Suit.Diamonds, Rank.JACK, 10);
        assertEquals(Suit.Diamonds, card.getSuit());
    }

    @Test
    public void setSuit() {
        Card card = new Card(Suit.Diamonds, Rank.JACK, 10);
        card.setSuit(Suit.Clubs);
        assertEquals(card.getSuit(), Suit.Clubs);
    }


    @Test
    public void getSuitvalue() {
        Card card = new Card(Suit.Diamonds, Rank.JACK, 10);
        assertTrue(card.getSuit()==Suit.Diamonds);
    }

    @Test
    public void getCardValue() {
        Card card = new Card(Suit.Diamonds, Rank.JACK, 10);
        assertTrue(card.getCardValue() == 10);
    }

    @Test
    public void setCardValue(){
        Card card = new Card(Suit.Diamonds, Rank.JACK, 10);
        card.setCardValue(11);
        assertTrue(card.getCardValue()==11);
    }
}