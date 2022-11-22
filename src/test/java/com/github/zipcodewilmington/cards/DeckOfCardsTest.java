package com.github.zipcodewilmington.cards;

import com.github.zipcodewilmington.casino.gameobjects.CardDeckFaceEnum;
import com.github.zipcodewilmington.casino.gameobjects.CardDeckSuitEnum;
import com.github.zipcodewilmington.casino.gameobjects.DeckOfCards;
import com.github.zipcodewilmington.casino.gameobjects.SingleCard;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

import static com.github.zipcodewilmington.casino.gameobjects.CardDeckFaceEnum.TWO;
import static com.github.zipcodewilmington.casino.gameobjects.CardDeckSuitEnum.HEARTS;
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

    @Test
    public void listDeck(){
        DeckOfCards deck = new DeckOfCards();

        ArrayList<SingleCard> list = deck.getArrayListDeck();

        list.forEach(t -> System.out.println(t.cardValue()));

        Predicate<SingleCard> condition = singleCard -> (singleCard.getFace().equals(TWO) && singleCard.getSuit().equals(HEARTS));
        list.removeIf(condition);
        System.out.println("\n");
        list.forEach(t -> System.out.println(t.cardValue()));

        Collections.shuffle(list);
        System.out.println("\n");
        list.forEach(t -> System.out.println(t.cardValue()));

    }

}