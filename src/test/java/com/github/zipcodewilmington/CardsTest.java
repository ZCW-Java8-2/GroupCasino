package com.github.zipcodewilmington;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class CardsTest {

    @Test
    void getCardTest() {
        Cards deck = new Cards(); //Class of Cards
        String[] newDeck = deck.getCard(); //Class of String[]

        List<String> expected = List.of(deck.getCard());
        List<String> actual = List.of(newDeck);

        assertEquals(expected, actual);
    }
    @Test
    void takeCardFromDeckTest() {
        Cards deck = new Cards();
        String[] hand = deck.takeCardFromDeck(13);
        String[] hand2 = deck.takeCardFromDeck(13);
        String[] hand3 = deck.takeCardFromDeck(13);
        String[] hand4 = deck.takeCardFromDeck(13);
        System.out.println(List.of(hand) + "\n");
        System.out.println(List.of(hand2) + "\n");
        System.out.println(List.of(hand3) + "\n");
        System.out.println(List.of(hand4));
//        int i = 0;
//        while (i < 26) {
//            Random ran = new Random();
//            int random = ran.nextInt(deck.cardList.size());
//            dealtCard = deck.cardList.get(random);
//            deck.cardList.remove(random);
//            i++;
//            System.out.println(dealtCard);
    }
}
//        return shuffledCard;
//        String card = deck.takeCardFromDeck();
//        System.out.println(card);

