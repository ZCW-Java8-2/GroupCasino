package com.github.zipcodewilmington.games;

import com.github.zipcodewilmington.casino.games.slots.SlotsGame;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SlotsGameTest {

    @Test
    public void getSlotsTest(){
        //RNG TEST Run this test 100 times. Manually check for unique cards.
        SlotsGame slots = new SlotsGame();

        slots.getSlots();

        slots.displaySlots();

    }

    @Test
    public void runSlotsGameTest(){
        //RNG TEST Run this test 100 times. Manually check for unique cards and display.
        SlotsGame slots = new SlotsGame();
        String input = "PULL LEVER";

        slots.runSlotsGame(input);
    }

    @Test
    public void winBetTest(){
        SlotsGame slots = new SlotsGame();

        double bet = 100;
        double balance = 1000;

        double expected = 1100;
        double actual = slots.winBet(bet, balance);

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void loseBetTest(){
        SlotsGame slots = new SlotsGame();

        double bet = 100;
        double balance = 1000;

        double expected = 900;
        double actual = slots.loseBet(bet, balance);

        Assert.assertEquals(expected, actual, 0);

    }
}