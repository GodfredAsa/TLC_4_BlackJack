package com.company;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PlayerTest {

    @Before
    public void setUp() throws Exception {

        Player player = new Player("test", List.of(
                new Card(Suit.Clubs, Rank.JACK, 10),
                new Card(Suit.Diamonds, Rank.TEN, 10),
                new Card(Suit.Diamonds, Rank.ACE, 11),
                new Card(Suit.Clubs, Rank.JACK, 10),
                new Card(Suit.Hearts, Rank.JACK, 10),
                new Card(Suit.Spades, Rank.THREE, 3))
                );
    }

    @Test
    public void totalPlayerCardPoints() {
        Player player = new Player("test", List.of(
                new Card(Suit.Clubs, Rank.JACK, 10),
                new Card(Suit.Diamonds, Rank.TEN, 10),
                new Card(Suit.Diamonds, Rank.ACE, 11),
                new Card(Suit.Spades, Rank.THREE, 3))
        );
        assertTrue(player.totalPlayerCardPoints()==34);
    }

    @Test
    public void getName() {
        Player player = new Player("test", List.of(
                new Card(Suit.Clubs, Rank.JACK, 10),
                new Card(Suit.Diamonds, Rank.TEN, 10),
                new Card(Suit.Diamonds, Rank.ACE, 11),
                new Card(Suit.Clubs, Rank.JACK, 10),
                new Card(Suit.Hearts, Rank.JACK, 10),
                new Card(Suit.Spades, Rank.THREE, 3))
        );

        assertFalse(player.getName() != "test");
    }

    @Test
    public void getHandTotal() {
        Player player = new Player("test", List.of(
                new Card(Suit.Clubs, Rank.JACK, 10),
                new Card(Suit.Diamonds, Rank.TEN, 10),
                new Card(Suit.Diamonds, Rank.ACE, 11),
                new Card(Suit.Clubs, Rank.JACK, 10),
                new Card(Suit.Hearts, Rank.JACK, 10),
                new Card(Suit.Spades, Rank.THREE, 3))
        );

        assertEquals(player.getHandTotal(), 54);
    }

    @Test
    public void isStatus() {
        Player player = new Player("test", List.of(
                new Card(Suit.Clubs, Rank.JACK, 10),
                new Card(Suit.Diamonds, Rank.TEN, 10),
                new Card(Suit.Diamonds, Rank.ACE, 11),
                new Card(Suit.Clubs, Rank.JACK, 10),
                new Card(Suit.Hearts, Rank.JACK, 10),
                new Card(Suit.Spades, Rank.THREE, 3))
        );

        assertTrue(player.isStatus() == true);

    }

    @Test
    public void setStatus() {
        Player player = new Player("test", List.of(
                new Card(Suit.Clubs, Rank.JACK, 10),
                new Card(Suit.Diamonds, Rank.TEN, 10),
                new Card(Suit.Diamonds, Rank.ACE, 11))
        );

//        setting the status of player to false and testing with true to make the test fail
        player.setStatus(false);
        assertTrue(player.isStatus());

    }

    @Test
    public void getDealtHand() {
        Player player = new Player("test", List.of(
                new Card(Suit.Clubs, Rank.JACK, 10),
                new Card(Suit.Hearts, Rank.JACK, 10),
                new Card(Suit.Spades, Rank.THREE, 3))
        );
        assertEquals(
                player.getDealtHand().get(0).getRankValue(),
                Rank.JACK
        );
    }


    @Test
    public void setDealtHand() {
        Player player = new Player("test", List.of(
                new Card(Suit.Clubs, Rank.JACK, 10),
                new Card(Suit.Hearts, Rank.JACK, 10),
                new Card(Suit.Spades, Rank.THREE, 3))
        );

        player.setDealtHand(List.of(
                new Card(Suit.Spades, Rank.THREE, 3)
        ));

//        test only works when I access the suit and ranks values
       assertEquals(player.getDealtHand().get(0).getSuit(),
               List.of(new Card(Suit.Spades, Rank.THREE, 3)).get(0).getSuit());
    }

    @Test
    public void getStrategyStatus() {
    }


//    Strategy test cases unimplemented
    @Test
    public void hit() {
        fail("Wrong implementation");
//        Having Difficulty with this test case
        Player player = new Player("test", List.of(
                new Card(Suit.Clubs, Rank.TWO, 2),
                new Card(Suit.Hearts, Rank.JACK, 10),
                new Card(Suit.Spades, Rank.THREE, 3))
        );
        System.out.println(player.getDealtHand());
        System.out.println("-----------------------");
        player.hit( new Card(Suit.Spades, Rank.TWO, 2));

        assertTrue(player.getDealtHand().size() ==1);
    }

    @Test
    public void stick() {
        fail("This test not implemented");
    }

    @Test
    public void goBust() {
        fail("This test not implemented");
    }
}