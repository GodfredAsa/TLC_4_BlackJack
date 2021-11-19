package com.company;



import java.util.List;

public class Player implements Strategy {
    private String name;
    private boolean status;
    private List<Card> dealtHand;
    private String strategyStatus;

        public Player(String name, List<Card> dealtHand) {
        this.name = name;
        this.status = true;
        this.dealtHand = dealtHand;
    }


    public int totalPlayerCardPoints(){
        return dealtHand.stream()
                .mapToInt(Card::getCardValue)
                .sum();
    }

    public String getName() {
        return name;
    }


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

    public String getStrategyStatus() {
        return strategyStatus;
    }

    @Override
    public List<Card> hit(Card card) {
       this.dealtHand.add(card);
        return this.dealtHand;
    }

    @Override
    public int stick(){
            return getHandTotal();
    }

    @Override
    public void goBust() {
            if(getHandTotal()>21){
                setStatus(false);
//                System.out.println(status + "You Loose");
            }else {
                setStatus(true);
            }
        System.out.println(status);
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", status=" + status +
                ", dealtHand=" + dealtHand +
                '}';
    }
}
