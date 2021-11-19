package com.company;

import java.util.List;

public interface Strategy {
    public List<Card> hit(Card card);

    public int stick();

    public void goBust();
}
