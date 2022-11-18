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
    public void findWinnerTest(){
        BlackJackGame bj = new BlackJackGame();

        int playerScore = 21;
        int dealerScore = 20;

        String expected = "Player Wins!";
        String actual = bj.findWinner(playerScore, dealerScore);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findWinnerTest2(){
        BlackJackGame bj = new BlackJackGame();

        int playerScore = 18;
        int dealerScore = 22;

        String expected = "Player Wins!";
        String actual = bj.findWinner(playerScore, dealerScore);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findWinnerTest3(){
        BlackJackGame bj = new BlackJackGame();

        int playerScore = 18;
        int dealerScore = 17;

        String expected = "Player Wins!";
        String actual = bj.findWinner(playerScore, dealerScore);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findWinnerTest4(){
        BlackJackGame bj = new BlackJackGame();

        int playerScore = 18;
        int dealerScore = 21;

        String expected = "Dealer Wins!";
        String actual = bj.findWinner(playerScore, dealerScore);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findWinnerTest5(){
        BlackJackGame bj = new BlackJackGame();

        int playerScore = 22;
        int dealerScore = 5;

        String expected = "Dealer Wins!";
        String actual = bj.findWinner(playerScore, dealerScore);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findWinnerTest6(){
        BlackJackGame bj = new BlackJackGame();

        int playerScore = 18;
        int dealerScore = 18;

        String expected = "Tie!";
        String actual = bj.findWinner(playerScore, dealerScore);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findWinnerTest7(){
        BlackJackGame bj = new BlackJackGame();

        int playerScore = 22;
        int dealerScore = 22;

        String expected = "Both Lose!";
        String actual = bj.findWinner(playerScore, dealerScore);

        Assert.assertEquals(expected, actual);
    }
}