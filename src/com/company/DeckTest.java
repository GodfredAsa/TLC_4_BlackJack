package com.company;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DeckTest {


//Working
    @org.junit.Test
    public void createDeckTest() {
        Deck deck  = new Deck();
        deck.createDeck();
        assertEquals(52,deck.nOfCards());
    }




}