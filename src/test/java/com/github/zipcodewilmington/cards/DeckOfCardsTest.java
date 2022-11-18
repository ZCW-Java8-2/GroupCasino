package com.github.zipcodewilmington.cards;

import com.github.zipcodewilmington.casino.gameobjects.CardDeckFaceEnum;
import com.github.zipcodewilmington.casino.gameobjects.CardDeckSuitEnum;
import com.github.zipcodewilmington.casino.gameobjects.DeckOfCards;
import com.github.zipcodewilmington.casino.gameobjects.SingleCard;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeckOfCardsTest {

    @Test
    public void cardDeckTest(){
//        DeckOfCards deck = new DeckOfCards();
//
//        String deckOfCards;
//
//        for (SingleCard card : deck){
//            System.out.println(card.getFace() + " of " + card.getSuit());
//        }
    }

    @Test
    public void drawRandomCardTest(){
        //RNG test of random card. This test produces a printout of a random card.
        // Manually check to ensure the card is a logical card.
        // Run this test 100 times.
     DeckOfCards deck = new DeckOfCards();

     SingleCard singleCard = deck.drawRandomCard();

     System.out.println(singleCard.getFace() + " of " + singleCard.getSuit());
    }

}