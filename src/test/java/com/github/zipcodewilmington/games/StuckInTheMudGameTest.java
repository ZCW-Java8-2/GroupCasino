package com.github.zipcodewilmington.games;

import com.github.zipcodewilmington.casino.gameobjects.RNG_ITEM;
import com.github.zipcodewilmington.casino.games.StuckInTheMud.StuckInTheMudGame;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StuckInTheMudGameTest {
    @Test
    public void getNumberOfDiceTest_Nullery(){
        StuckInTheMudGame game = new StuckInTheMudGame();
        int expected = 5;
        int actual = game.getNumberOfDice();

        assertEquals(expected, actual);
    }
    @Test
    public void getScoreTest_Nullery(){
        StuckInTheMudGame game = new StuckInTheMudGame();
        int expected = 0;
        int actual = game.getScore();

        assertEquals(expected, actual);
    }

    @Test
    public void finalMessageCheckTest() {
        StuckInTheMudGame game = new StuckInTheMudGame(5,50);
        String expected = "\n" + "Congrats! You reached 50!" + "\n";
        String actual = game.finalMessageCheck();

        assertEquals(expected, actual);
    }

    @Test
    public void rollDiceTest() {
        StuckInTheMudGame game = new StuckInTheMudGame();

        int result = game.rollDice();

        System.out.println(result + " ");

        Assert.assertTrue((result >= 1) && (result <= 6));
    }


}
