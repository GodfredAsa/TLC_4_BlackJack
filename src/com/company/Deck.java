package com.company;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> deckOfCards;


    public Deck() {
        this.deckOfCards = new ArrayList<>();
    }

    public void createDeck(){
        for(Suit suit: Suit.values() ){
            for (Rank rank: Rank.values()){
                deckOfCards.add(new Card(suit, rank));
            }
        }

    }

}
