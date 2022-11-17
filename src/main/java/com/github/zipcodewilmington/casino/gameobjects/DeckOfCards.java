package com.github.zipcodewilmington.casino.gameobjects;

import java.util.Random;

public class DeckOfCards {

    public Card[][] deck;
    public static final int numSuits = CardDeckSuitEnum.values().length;
    public static final int numFaces = CardDeckFaceEnum.values().length;

    public DeckOfCards(){
        deck = new Card[numSuits][numFaces];

        CardDeckSuitEnum[] suits = CardDeckSuitEnum.values();
        CardDeckFaceEnum[] faces = CardDeckFaceEnum.values();

        for (int i = 0 ; i < numSuits ; i++){
            CardDeckSuitEnum suit = suits[i];
            for (int j = 0 ; i < numFaces ; i++){
                CardDeckFaceEnum face = faces[j];
                deck[i][j] = new Card(suit, face);
            }
        }
    }

    public Card drawRandomCard(){
        Random random = new Random();

        int ranSuitIndex = random.nextInt(numSuits);
        int ranFaceIndex = random.nextInt(numFaces);

        return deck[ranSuitIndex][ranFaceIndex];
    }

}
