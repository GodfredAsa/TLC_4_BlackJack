package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Deck {
    private ArrayList<Card> deckOfCards;


    public Deck() {
        this.deckOfCards = new ArrayList<>();
    }

    public void createDeck(){
        for(Suit suit: Suit.values() ){
            for (Rank rank: Rank.values()){
                int cardsValue;
                switch(rank){
                    case ACE -> cardsValue = 11;
                    case KING, QUEEN, JACK  -> cardsValue =  10;
                    default -> cardsValue = Integer.parseInt(rank.getDisplayName());
                }deckOfCards.add(new Card(suit, rank, cardsValue));
            }
        }
    }

    public int  nOfCards(){
        return deckOfCards.size();
    }


    public void sendCards(){
        List<Card> givenCards =  new ArrayList<>();
        for(int i=0; i<2; i++){
           givenCards.add( deckOfCards.get(i));
           deckOfCards.remove(i);
        }
        System.out.println(givenCards);
    }




    public void shuffledDeckOfCards(){
        shuffleDeck();
    }

    private void shuffleDeck(){
        Collections.shuffle(this.deckOfCards);

    }

    @Override
    public String toString() {
        return "Deck{" +
                "deckOfCards=" + deckOfCards +
                '}';
    }
}
