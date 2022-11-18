package com.github.zipcodewilmington.casino.gameobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DeckOfNums {

    public static ArrayList<Integer> numDeck = new ArrayList<Integer>();

    public DeckOfNums() {

        for( int i = 0 ; i < 4 ; i++ ) {
            for( int j = 1 ; j <= 13 ; j++ ) {
                numDeck.add(j);
            }
        }
    }

    public int drawCardReduceDeck() {

        Random random = new Random();

        Collections.shuffle(numDeck);

        int randomIndex = random.nextInt(numDeck.size()) + 1;

        int holder = numDeck.get(randomIndex);

        numDeck.remove(randomIndex);

        return holder;
    }
}
