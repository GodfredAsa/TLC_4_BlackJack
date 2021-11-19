package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private boolean status;
    private List<Card> dealtHand;

    public Player(String name, List<Card> dealtHand) {
        this.name = name;
        this.status = true;
        this.dealtHand = dealtHand;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getHandTotal(){
        return this.dealtHand.stream()
                .map(Card::getCardValue)
                .reduce(0, Integer::sum);
    }


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Card> getDealtHand() {
        return dealtHand;
    }

    public void setDealtHand(List<Card> dealtHand) {
        this.dealtHand = dealtHand;
    }












}
