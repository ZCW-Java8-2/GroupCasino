package com.github.zipcodewilmington.casino.games.StuckInTheMud;

import com.fasterxml.jackson.databind.util.ISO8601Utils;
import com.github.zipcodewilmington.casino.gameobjects.RNG_ITEM;

import java.lang.reflect.Array;

/**
 * Created by leon on 7/21/2020.
 */
public class StuckInTheMudGame {

    RNG_ITEM dice = new RNG_ITEM(6);

    int numberOfDice = 5;
    int[] diceBox = new int[numberOfDice]; //array list?

    public void stuckInTheMudGame() {
        for (int i = 0; i < diceBox.length; i++) {
            diceBox[i] = dice.runRNG();
            System.out.println(diceBox[i]);
        }

        System.out.println("STUCK-IN-THE-MUD-RULES:\n" +
                "Roll five dice cubes and get the sum of your dice until you get 100.\n" +
                "If you roll a 2 or 5 that dice cube is \"suck in the mud\" and cannot be rolled again");


    }
}