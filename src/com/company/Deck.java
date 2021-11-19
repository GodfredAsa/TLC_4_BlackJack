package com.company;

import java.util.*;
import java.util.stream.Collectors;


public class Deck {
    private final ArrayList<Card> deckOfCards;


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
                    default -> cardsValue = Integer
                            .parseInt(rank.getDisplayName());
                }deckOfCards.add(new Card(suit, rank, cardsValue));
            }
        }
    }


//    Calculate Card Points
    public int totalCardPoint(List<Card> playerCards){
        return playerCards.stream()
                .mapToInt(Card::getCardValue)
                .sum();
    }

    //Sends single card
    public Card sendSingleCards(){
   return  deckOfCards.remove(0);

    }

// Sending Cards
    public List<Card> sendCards(){
        return List.of(sendSingleCards(),sendSingleCards());
    }


    public int nCards(){
        return deckOfCards.size();
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

