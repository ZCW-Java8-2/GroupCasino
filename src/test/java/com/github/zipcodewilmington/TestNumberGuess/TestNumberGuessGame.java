package com.github.zipcodewilmington.TestNumberGuess;
import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.games.numberguess.NumberGuessGame;
import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class TestNumberGuessGame {
    @Test
public void TestNumberGuessGetRandomNumber(){

        int expect =10;
        NumberGuessGame number = new NumberGuessGame();
        Assert.assertEquals(expect, number.userNumber(new Scanner(String.valueOf(10))));

    }
    @Test
    public void TestNumberGuessUserNumber(){


        NumberGuessGame number = new NumberGuessGame();

        boolean expect =true;
        Scanner sn = new Scanner(System.in);
       // Assert.assertEquals(expect, number.numberCompare(10,10));
    }

}
