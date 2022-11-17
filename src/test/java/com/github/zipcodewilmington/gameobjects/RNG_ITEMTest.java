package com.github.zipcodewilmington.gameobjects;

import com.github.zipcodewilmington.casino.gameobjects.RNG_ITEM;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RNG_ITEMTest {

    @Test
    public void RNG_ITEMTest_dice() {

        int diceSides = 6;
        RNG_ITEM dice = new RNG_ITEM(diceSides);

        int result = dice.runRNG();

        System.out.println(result + " ");

        Assert.assertTrue((result >= 1) && (result <= diceSides));
    }

    @Test
    public void RNG_ITEMTest_coin() {

        int coinSides = 2;

        RNG_ITEM coin = new RNG_ITEM(coinSides);

        int result = coin.runRNG();

        System.out.print(result + " ");

        Assert.assertTrue((result >= 1) && (result <= coinSides));
    }
}