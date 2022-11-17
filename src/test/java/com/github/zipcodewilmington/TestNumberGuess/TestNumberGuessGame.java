package com.github.zipcodewilmington.TestNumberGuess;
import com.github.zipcodewilmington.casino.games.numberguess.NumberGuessGame;
import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class TestNumberGuessGame {
    @Test
public void TestNumberGuessGame(){
    Boolean expect =true;
    NumberGuessGame n = new NumberGuessGame(1);
    Boolean actual = n.numberCompare();
    //Assert.assertEquals(expect, autual);



    }
}
