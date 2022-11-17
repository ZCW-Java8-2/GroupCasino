package com.github.zipcodewilmington.casino.gameobjects;

import java.util.Random;

public class DeckOfCards {

    public SingleCard[][] deck;
    public static final int numSuits = CardDeckSuitEnum.values().length;
    public static final int numFaces = CardDeckFaceEnum.values().length;

    public DeckOfCards(){
        deck = new SingleCard[numSuits][numFaces];

        CardDeckSuitEnum[] suits = CardDeckSuitEnum.values();
        CardDeckFaceEnum[] faces = CardDeckFaceEnum.values();

        for (int i = 0 ; i < numSuits ; i++){
            CardDeckSuitEnum suit = suits[i];
            for (int j = 0 ; j < numFaces ; j++){
                CardDeckFaceEnum face = faces[j];
                deck[i][j] = new SingleCard(suit, face);
            }
        }
    }

    public SingleCard drawRandomCard(){
        Random random = new Random();

        int ranSuitIndex = random.nextInt(numSuits);
        int ranFaceIndex = random.nextInt(numFaces);

        return deck[ranSuitIndex][ranFaceIndex];
    }

//    public SingleCard drawAndReduce() {
//
//    }
}
