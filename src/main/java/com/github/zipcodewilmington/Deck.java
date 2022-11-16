package com.github.zipcodewilmington;

import java.util.Random;

public class Deck {

    private Cards[] deck;
    private static int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final Random randomNumbers = new Random();
    public static Cards[] temp;
    public static Cards faceDown;

    public Deck() {
        currentCard = 0;
        String[] value = {"ACE","TWO","THREE","FOUR","FIVE","SIX","SEVEN",
        "EIGHT","NINE","TEN","JACK","QUEEN","KING"};
        String[] suits = {"HEARTS","SPADES","DIAMONDS","CLUBS"};

        deck = new Cards[NUMBER_OF_CARDS];

        temp = new Cards[NUMBER_OF_CARDS];

        faceDown = new Cards("Face","Down");

        for(int i = 0; i < deck.length; i++) {
            deck[i] = new Cards(value[i % 13], suits[i/13]);
        }
    }
    public void shuffle() {
        currentCard = 0;
        for(int i = 0; i < deck.length; i++) {
            int j = randomNumbers.nextInt(NUMBER_OF_CARDS); //random from 0 - 52;
            temp[0] = deck[i]; //temp is empty, deck[i] has ace of spades, right now temp also has ace of spades
            deck[i] = deck[j]; //deck[i] has ace of spades, deck[j] has king of clubs, deck[i] also has king of clubs
            deck[j] = temp[0]; //temp has ace of spades, deck[j] has king of clubs, deck[j] also has ace of spades
        }
    }
    public Cards[] dealCard(int cardDealt) {
        Cards[] dealt = new Cards[cardDealt];
        for (int i = 0; i < cardDealt; i++) {
            if (currentCard < deck.length) {
                dealt[i] = deck[i];
                currentCard++;

            } else {
                return null;
            }
        }
        return dealt;
    }
    public Cards[] dealCardFaceDown(int cardDealt) {
        Cards[] result = dealCard(cardDealt);
        Cards[] dealt = new Cards[cardDealt];
        for(int i = 0; i < result.length; i++) {
            dealt[i] = result[i];
        }
        for(int i = 0; i < dealt.length; i++) {
            temp[i] = dealt[i];
            dealt[i] = faceDown;
        }
        return dealt;
    }
    public Cards reveal(int cardIndex, boolean flip) {
        if(flip = true) {
            return temp[cardIndex];
        } else {
            return faceDown;
        }
    }
}
