package com.github.zipcodewilmington.TestCard;

import com.github.zipcodewilmington.casino.games.Card.Card;
import com.github.zipcodewilmington.casino.games.Card.PrintedValues;
import com.github.zipcodewilmington.casino.games.Card.Suits;
import org.junit.Assert;
import org.junit.Test;

public class TestCard {

    @Test
    public void testConstructor(){
        //given
        Suits suit = Suits.CLUBS;
        PrintedValues value = PrintedValues.ACE;
        boolean faceDirection = true;

        //when
        Card card = new Card(suit, value,faceDirection);

        //then
        Assert.assertEquals(suit,card.getSuit());
        Assert.assertEquals(value,card.getPrintedValues());
        Assert.assertEquals(faceDirection, card.getIsFaceUp());
    }

    @Test
    public void testGetSuit(){
        //given
        Suits suit = Suits.CLUBS;

        //when
        Card card = new Card(suit,null,true);

        //then
        Assert.assertEquals(card.getSuit(),suit);
    }
    @Test
    public void testGetIsfaceUp(){
        //given
        boolean faceDirection = true;
        //when
        Card card = new Card(null,null,faceDirection);
        //then
        Assert.assertEquals(faceDirection,card.getIsFaceUp());
    }

    @Test
    public void testGetPrintedValue(){
        //given
        PrintedValues expected = PrintedValues.ACE;
        //when
        Card card = new Card(null,expected,true);
        //then
        Assert.assertEquals(expected,card.getPrintedValues());
    }
    @Test
    public void TestSetFaceUp(){
        //given
        boolean expected = true;
        Card card = new Card(null,null,false);
        //when
        card.setFaceUp(true);
        //then
        Assert.assertEquals(expected, card.getIsFaceUp());
    }
    @Test
    public void TestSetPrintedValues(){
        //given
        PrintedValues expected = PrintedValues.ACE;
        Card card = new Card(null,null,false);
        //when
        card.setPrintedValues(expected);
        //then
        Assert.assertEquals(expected, card.getPrintedValues());
    }
    @Test
    public void TestSetSuit(){
        //given
        Suits expected = Suits.SPADES;
        Card card = new Card(null,null,true);
        //when
        card.setSuit(expected);
        //then
        Assert.assertEquals(expected,card.getSuit());
    }

    @Test
    public void testFlipCard(){
        //given
        Card card = new Card(null,null,true);
        //when
        card.flipCard();
        //then
        Assert.assertFalse(card.getIsFaceUp());
    }
    @Test
    public void testFlipCard_falseToTrue(){
        //given
        Card card = new Card(null,null,false);
        //when
        card.flipCard();
        //then
        Assert.assertTrue(card.getIsFaceUp());
    }

}
