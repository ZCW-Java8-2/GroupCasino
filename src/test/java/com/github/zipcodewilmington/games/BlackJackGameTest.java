package com.github.zipcodewilmington.games;

import com.github.zipcodewilmington.casino.games.BlackJack.BlackJackGame;
import org.junit.Assert;
import org.junit.Test;

public class BlackJackGameTest {

    @Test
    public void isGreater21Test(){

        BlackJackGame bj = new BlackJackGame();

        int test = 21;
        boolean actual = false;

        boolean expected = bj.isGreaterThan21(test);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isGreater21Test1(){

        BlackJackGame bj = new BlackJackGame();

        int test = 0;
        boolean actual = false;

        boolean expected = bj.isGreaterThan21(test);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isGreater21Test2(){

        BlackJackGame bj = new BlackJackGame();

        int test = 22;
        boolean actual = true;

        boolean expected = bj.isGreaterThan21(test);

        Assert.assertEquals(expected, actual);
    }

    @Test


}