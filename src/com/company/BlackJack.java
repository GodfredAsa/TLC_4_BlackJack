package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackJack {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Deck deck = new Deck();

        deck.createDeck();


        deck.shuffledDeckOfCards();
        System.out.println("----------------");
        System.out.println(deck);
        System.out.println("----------------");

        System.out.println("**********************");
        deck.sendCards();

        System.out.println("**********************");


        System.out.println(deck);



//        List<Card> playerCard = new ArrayList<>();

//        System.out.println(deck);






//        Player p1 = new Player("A", List.of(c)); //10
//        Player p2 = new Player("B", List.of(c,f, c)); //21


//        check status with the score of cards he has

//        compare player scores



//        System.out.println("status: " + p2.isStatus());


//        if(p2.playerCardScore()>21){
//            p2.setStatus(false);
//            System.out.println("Burn Out");
//        }
//
//        if(p1.playerCardScore()<p2.playerCardScore()){
//            System.out.println(p2.getName() + " -WINNER");
//        }else{
//            System.out.println(p1.getName() + "WINNER");
//        }
//        System.out.println(p1.playerCardScore() - p2.playerCardScore());

//        System.out.println(p1.playerCardScore());


//        createPlayer();
    }





//    public static void createPlayer(){
//        int n;
//        System.out.print("Enter the number of Players: ");
//        n = scanner.nextInt();
//        Card c  = new Card(Suit.Diamonds, Rank.JACK);
//        Card f  = new Card(Suit.Diamonds, Rank.ACE);
//        for(int i=0; i<n; i++){
//            Player pi = new Player("A1", List.of(f,c));
//            System.out.println(i);
//        }
//
//
//    }



}
