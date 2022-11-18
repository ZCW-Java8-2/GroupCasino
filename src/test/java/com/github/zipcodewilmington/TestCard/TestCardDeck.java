package com.github.zipcodewilmington.TestCard;

import com.github.zipcodewilmington.casino.games.Card.Card;
import com.github.zipcodewilmington.casino.games.Card.CardDeck;
import com.github.zipcodewilmington.casino.games.Card.PrintedValues;
import com.github.zipcodewilmington.casino.games.Card.Suits;
import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class TestCardDeck {

    @Test
    public void TestGetDeck(){
        //given
        CardDeck deck = new CardDeck(1);
        //when
        String actual = deck.getDeck().toString();
        String expected = "[TWO of SPADES, TWO of CLUBS, TWO of DIAMONDS, TWO of HEARTS, THREE of SPADES, THREE of CLUBS, THREE of DIAMONDS, THREE of HEARTS, FOUR of SPADES, FOUR of CLUBS, FOUR of DIAMONDS, FOUR of HEARTS, FIVE of SPADES, FIVE of CLUBS, FIVE of DIAMONDS, FIVE of HEARTS, SIX of SPADES, SIX of CLUBS, SIX of DIAMONDS, SIX of HEARTS, SEVEN of SPADES, SEVEN of CLUBS, SEVEN of DIAMONDS, SEVEN of HEARTS, EIGHT of SPADES, EIGHT of CLUBS, EIGHT of DIAMONDS, EIGHT of HEARTS, NINE of SPADES, NINE of CLUBS, NINE of DIAMONDS, NINE of HEARTS, TEN of SPADES, TEN of CLUBS, TEN of DIAMONDS, TEN of HEARTS, JACK of SPADES, JACK of CLUBS, JACK of DIAMONDS, JACK of HEARTS, QUEEN of SPADES, QUEEN of CLUBS, QUEEN of DIAMONDS, QUEEN of HEARTS, KING of SPADES, KING of CLUBS, KING of DIAMONDS, KING of HEARTS, ACE of SPADES, ACE of CLUBS, ACE of DIAMONDS, ACE of HEARTS]";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestDrawNextCard() {
        //given
        CardDeck deck = new CardDeck(1);
        //when
        Card card = deck.drawNextCard();
        Suits expectedSuit = Suits.HEARTS;
        PrintedValues expectedValue = PrintedValues.ACE;
        //then
        Assert.assertEquals(expectedValue, card.getPrintedValues());
        Assert.assertEquals(expectedSuit, card.getSuit());
    }

    @Test
    public void TestToString(){
        //given
        CardDeck deck = new CardDeck(1);
        //when
        String expected = "TWO of SPADES |TWO of CLUBS |TWO of DIAMONDS |TWO of HEARTS |THREE of SPADES |THREE of CLUBS |THREE of DIAMONDS |THREE of HEARTS |FOUR of SPADES |FOUR of CLUBS |FOUR of DIAMONDS |FOUR of HEARTS |FIVE of SPADES |FIVE of CLUBS |FIVE of DIAMONDS |FIVE of HEARTS |SIX of SPADES |SIX of CLUBS |SIX of DIAMONDS |SIX of HEARTS |SEVEN of SPADES |SEVEN of CLUBS |SEVEN of DIAMONDS |SEVEN of HEARTS |EIGHT of SPADES |EIGHT of CLUBS |EIGHT of DIAMONDS |EIGHT of HEARTS |NINE of SPADES |NINE of CLUBS |NINE of DIAMONDS |NINE of HEARTS |TEN of SPADES |TEN of CLUBS |TEN of DIAMONDS |TEN of HEARTS |JACK of SPADES |JACK of CLUBS |JACK of DIAMONDS |JACK of HEARTS |QUEEN of SPADES |QUEEN of CLUBS |QUEEN of DIAMONDS |QUEEN of HEARTS |KING of SPADES |KING of CLUBS |KING of DIAMONDS |KING of HEARTS |ACE of SPADES |ACE of CLUBS |ACE of DIAMONDS |ACE of HEARTS |";
        String actual = deck.toString();
        //then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void TestToString_MultipleDecks(){
        //given
        CardDeck deck = new CardDeck(2);
        //when
        String expected = "TWO of SPADES |TWO of CLUBS |TWO of DIAMONDS |TWO of HEARTS |THREE of SPADES |THREE of CLUBS |THREE of DIAMONDS |THREE of HEARTS |FOUR of SPADES |FOUR of CLUBS |FOUR of DIAMONDS |FOUR of HEARTS |FIVE of SPADES |FIVE of CLUBS |FIVE of DIAMONDS |FIVE of HEARTS |SIX of SPADES |SIX of CLUBS |SIX of DIAMONDS |SIX of HEARTS |SEVEN of SPADES |SEVEN of CLUBS |SEVEN of DIAMONDS |SEVEN of HEARTS |EIGHT of SPADES |EIGHT of CLUBS |EIGHT of DIAMONDS |EIGHT of HEARTS |NINE of SPADES |NINE of CLUBS |NINE of DIAMONDS |NINE of HEARTS |TEN of SPADES |TEN of CLUBS |TEN of DIAMONDS |TEN of HEARTS |JACK of SPADES |JACK of CLUBS |JACK of DIAMONDS |JACK of HEARTS |QUEEN of SPADES |QUEEN of CLUBS |QUEEN of DIAMONDS |QUEEN of HEARTS |KING of SPADES |KING of CLUBS |KING of DIAMONDS |KING of HEARTS |ACE of SPADES |ACE of CLUBS |ACE of DIAMONDS |ACE of HEARTS |TWO of SPADES |TWO of CLUBS |TWO of DIAMONDS |TWO of HEARTS |THREE of SPADES |THREE of CLUBS |THREE of DIAMONDS |THREE of HEARTS |FOUR of SPADES |FOUR of CLUBS |FOUR of DIAMONDS |FOUR of HEARTS |FIVE of SPADES |FIVE of CLUBS |FIVE of DIAMONDS |FIVE of HEARTS |SIX of SPADES |SIX of CLUBS |SIX of DIAMONDS |SIX of HEARTS |SEVEN of SPADES |SEVEN of CLUBS |SEVEN of DIAMONDS |SEVEN of HEARTS |EIGHT of SPADES |EIGHT of CLUBS |EIGHT of DIAMONDS |EIGHT of HEARTS |NINE of SPADES |NINE of CLUBS |NINE of DIAMONDS |NINE of HEARTS |TEN of SPADES |TEN of CLUBS |TEN of DIAMONDS |TEN of HEARTS |JACK of SPADES |JACK of CLUBS |JACK of DIAMONDS |JACK of HEARTS |QUEEN of SPADES |QUEEN of CLUBS |QUEEN of DIAMONDS |QUEEN of HEARTS |KING of SPADES |KING of CLUBS |KING of DIAMONDS |KING of HEARTS |ACE of SPADES |ACE of CLUBS |ACE of DIAMONDS |ACE of HEARTS |";
        String actual = deck.toString();
        //then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void TestSetDeck(){
        //given
        CardDeck deck = new CardDeck(1);
        Stack<Card> expected = new Stack<>();
        //when
        deck.setDeck(expected);
        //then
        Assert.assertEquals(expected,deck.getDeck());
    }
    @Test
    public void TestGetNumberOfDeck(){
        //given
        CardDeck deck = new CardDeck(5);
        //when
        int expected = 5;
        //then
        Assert.assertEquals(expected,deck.getNumberOfDeck());
    }

    @Test
    public void TestSetNumberOfDeck(){
        //given
        CardDeck deck = new CardDeck(10);
        int expected = 4;
        //when
        deck.setNumberOfDeck(expected);
        //then
        Assert.assertEquals(expected,deck.getNumberOfDeck());
    }

    @Test
    public void TestShuffle(){
        //given
        CardDeck deck = new CardDeck(1);
        Card card1 = deck.getDeck().get(0);
        //when
        deck.shuffle();
        Card card2 = deck.getDeck().get(0);
        //then
        Assert.assertNotEquals(card1,card2);

    }
}
