package com.github.zipcodewilmington.casino.games.StuckInTheMud;

import com.fasterxml.jackson.databind.util.ISO8601Utils;
import com.github.zipcodewilmington.casino.Player;
import com.github.zipcodewilmington.casino.gameobjects.RNG_ITEM;
import com.github.zipcodewilmington.utils.IOConsole;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by leon on 7/21/2020.
 */
public class StuckInTheMudGame {

    private IOConsole console = new IOConsole();

    RNG_ITEM dice = new RNG_ITEM(6);

    private int numberOfDice = 5;

    private ArrayList<Integer> diceBox = new ArrayList<>(numberOfDice);
    private ArrayList<Integer> mudDiceBox = new ArrayList<>(numberOfDice);

    public void stuckInTheMudGame() {



        for (int i = 0; i < numberOfDice; i++) {
            diceBox.add(dice.runRNG());
        }
        System.out.println("Current roll: " + diceBox.toString());

        for (int i = 0; i < diceBox.size(); i++) {
            if (diceBox.get(i) == 5 || diceBox.get(i) == 2) {
                mudDiceBox.add(diceBox.get(i));
                diceBox.remove(i);
            }
        }

        System.out.println("Stuck in the mud: " + mudDiceBox.toString());
        System.out.println("Current roll: " + diceBox.toString());

    }

    public void printRules() {
        System.out.println("STUCK-IN-THE-MUD-RULES:\n" +
                "Roll five dice cubes and get the sum of your dice. You win if you get a sum of 50.\n" +
                "If you roll a 2 or 5 that dice cube is \"stuck in the mud\" and cannot be rolled again");
    }

    public String currentRoll() {
        String currentRoll = "Current roll ";
        for (int i = 0; i < diceBox.size(); i++) {
            diceBox.add(dice.runRNG());
        }
        return currentRoll + diceBox.toString();
    }







}