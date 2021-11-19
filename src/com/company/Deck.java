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

// lists of card Scores
    public List<Integer> cardScore(){
       return deckOfCards.stream()
               .map(Card::getCardValue)
               .collect(Collectors.toList());
    }

//    Calculate Card Points
    public int totalCardPoint(List<Card> playerCards){
        return playerCards.stream()
                .mapToInt(Card::getCardValue)
                .sum();
    }

    //Sends single card
    public List<Card> sendSingleCards(){
        List<Card> singleCard =  new ArrayList<>();
        for(int i=0; i<1; i++){
            singleCard.add(deckOfCards.get(i));
            deckOfCards.remove(deckOfCards.get(i));
        }
        return singleCard;
    }

// Sending Cards
    public List<Card> sendCards(){
        List<Card> givenCards =  new ArrayList<>();
        for(int i=0; i<2; i++){
           givenCards.add(deckOfCards.get(i));
           deckOfCards.remove(deckOfCards.get(i));
        }
        return givenCards;
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

