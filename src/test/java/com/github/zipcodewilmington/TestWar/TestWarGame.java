package com.github.zipcodewilmington.TestWar;

import com.github.zipcodewilmington.casino.games.Card.Card;
import com.github.zipcodewilmington.casino.games.Card.CardDeck;
import com.github.zipcodewilmington.casino.games.Card.PrintedValues;
import com.github.zipcodewilmington.casino.games.Card.Suits;
import com.github.zipcodewilmington.casino.games.War.WarGame;
import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class TestWarGame {
    @Test
    public void TestSplitDeck(){
        //given
        CardDeck deck = new CardDeck(1);
        WarGame game = new WarGame(deck);

        //when
        game.splitDeck();
        //then
        Assert.assertEquals(game.getDealerDeck().size(),26);
        Assert.assertEquals(game.getPlayerDeck().size(),26);
        Assert.assertNotEquals(game.getPlayerDeck(), game.getDealerDeck());
    }
    @Test
    public void TestFillHalfDeck(){
        //given
        Card card = new Card(Suits.CLUBS, PrintedValues.ACE,true);
        CardDeck deck = new CardDeck(1);
        WarGame game = new WarGame(deck);
        Stack<Card> halfDeck = new Stack<>();
        for(int i = 0; i < 26; i++){
            halfDeck.add(card);
        }
        //when
        Stack<Card> actual = game.fillHalfDeck(deck);
        //then
        Assert.assertEquals(actual.size(), halfDeck.size());
    }
    @Test
    public void TestPlayerCardBetter_False(){
        //given
        Card lowerCard = new Card(Suits.CLUBS, PrintedValues.EIGHT,true);
        Card higherCard = new Card(Suits.CLUBS, PrintedValues.ACE,true);
        WarGame game = new WarGame(new CardDeck(1));
        //when
        game.playerCardBetter(lowerCard,higherCard);
        //then
        Assert.assertFalse(game.playerCardBetter(lowerCard,higherCard));
    }
    @Test
    public void TestPlayerCardBetter_True(){
        //given
        Card lowerCard = new Card(Suits.CLUBS, PrintedValues.EIGHT,true);
        Card higherCard = new Card(Suits.CLUBS, PrintedValues.ACE,true);
        WarGame game = new WarGame(new CardDeck(1));
        //when
        game.playerCardBetter(higherCard,lowerCard);
        //then
        Assert.assertTrue(game.playerCardBetter(higherCard,lowerCard));
    }
    @Test
    public void TestIsTie_False(){
        //given
        Card lowerCard = new Card(Suits.CLUBS, PrintedValues.EIGHT,true);
        Card higherCard = new Card(Suits.CLUBS, PrintedValues.ACE,true);
        WarGame game = new WarGame(new CardDeck(1));
        //when
        game.isTie(higherCard,lowerCard);
        //then
        Assert.assertFalse(game.isTie(higherCard,lowerCard));
    }
    @Test
    public void TestIsTie_True(){
        //given
        Card lowerCard = new Card(Suits.CLUBS, PrintedValues.EIGHT,true);
        Card higherCard = new Card(Suits.SPADES, PrintedValues.EIGHT,true);
        WarGame game = new WarGame(new CardDeck(1));
        //when
        game.isTie(higherCard,lowerCard);
        //then
        Assert.assertTrue(game.isTie(higherCard,lowerCard));
    }

    @Test
    public void TestDrawThreeThenFlipFourth(){
        //given
        WarGame game = new WarGame(new CardDeck(1));
        Stack<Card> deck = new Stack<>();
        Card cards = new Card(Suits.CLUBS, PrintedValues.EIGHT,true);
        Card moneyCard = new Card(Suits.SPADES, PrintedValues.ACE,true);
        deck.push(moneyCard);
        deck.push(cards);
        deck.push(cards);
        deck.push(cards);
        //when
        Card actual = game.drawThreeThenFlipUpFourth(deck);
        //then
        Assert.assertEquals(moneyCard,actual);
    }

}
