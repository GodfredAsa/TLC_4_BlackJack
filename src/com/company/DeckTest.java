package com.company;

import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class DeckTest {

    @Test
    public void isEmptyDeck() throws Exception {
        Deck deck  = new Deck();
        assertTrue(deck.nCards()==0);
    }

    @Test
    public void createDeckTest() {
        Deck deck  = new Deck();

//        creating cards in the deck and testing the size is 52
        deck.createDeck();
        assertTrue(deck.nCards() == 52);
    }

    @Test
    public void singleCardTest() {
        Deck deck  = new Deck();
        deck.createDeck();
        deck.singleCard();
        assertFalse(deck.nCards() ==1);
    }

    @Test
    public void sendCardsTest() {
        Deck deck  = new Deck();
        deck.createDeck();
        deck.sendCards();
        assertEquals(deck.sendCards().size(), 2);
    }

    @Test
    public void nCardsTest() {
        Deck deck  = new Deck();
        assertTrue(deck.nCards()==0);
    }

//    Unable to test shuffle method of the deck
    @Test
    public void shuffledDeckOfCardsTest() {
        Deck deck  = new Deck();
        deck.createDeck();
        deck.shuffledDeckOfCards();

        List<Card> cardList = List.of(
                new Card(Suit.Clubs, Rank.JACK, 10),
                new Card(Suit.Hearts, Rank.JACK, 10),
                new Card(Suit.Hearts, Rank.TWO, 2)
        );

        assertEquals(deck,cardList);

    }
}