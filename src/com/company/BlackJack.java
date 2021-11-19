package com.company;

//import org.w3c.dom.ls.LSOutput;
//
//import java.util.ArrayList;
//import java.util.List;
import java.util.List;

public class BlackJack {
//    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.createDeck();
        deck.shuffledDeckOfCards();


        List<Player> playerList = List.of(
                new Player("Ama", deck.sendCards()),
                new Player("Bina", deck.sendCards()),
                new Player("Cici", deck.sendCards())
        );

        for(Player p: playerList){
            if(p.getHandTotal()<17){
                System.out.println(p.getName() + " --> " + p.getHandTotal());
                p.hit(deck.singleCard());

                System.out.println(p.getName() + " --> " + p.getHandTotal());
//
            }else if(p.getHandTotal()>21){
                System.out.println(p.getName() + "--> " + p.getHandTotal());
               p.goBust();
            }else if(p.getHandTotal()>17 && p.getHandTotal()<21){
                System.out.println(p.getName() + "--> " + p.getHandTotal() + "  Winner");
//                p.getName();
            }

//            System.out.println(p.getName());
        }

        System.out.println(playerList.get(0));


        System.out.println("------------------******----------------");
        playerList.stream().map(s->s.getName() +"->"+ s.getHandTotal()).forEach(System.out::println);
        System.out.println("---------------******---------------------");

        playerList.stream().map(s->s.getName() + s.getHandTotal()).forEach(System.out::println);


        System.out.println("---------------******---------------------");

        Player p1 = new Player("A", deck.sendCards());
//        System.out.println("Dealt Hand Cards: "+ p1.getDealtHand());
//
////        p1.hit(deck.singleCard());
//        System.out.println("----------------------------------");
//        System.out.println( p1.hit(deck.singleCard()));
//        System.out.println("------------------------------------");

        if(p1.totalPlayerCardPoints()<17){

            System.out.println(p1.getDealtHand());
            System.out.println("----------------------------------");
            System.out.println( p1.hit(deck.singleCard()));
            System.out.println("------------------------------------");

            System.out.println( p1.totalPlayerCardPoints());
            System.out.println("------------------------------------");
        }else{
            System.out.println("*************************************");
            System.out.println(p1.getDealtHand());
            System.out.println(p1.totalPlayerCardPoints());
            System.out.println("*************************************");
        }


       p1.goBust();



    }



}
