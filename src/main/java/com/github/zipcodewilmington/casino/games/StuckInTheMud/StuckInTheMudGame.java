package com.github.zipcodewilmington.casino.games.StuckInTheMud;

import com.github.zipcodewilmington.casino.gameobjects.RNG_ITEM;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

import java.util.ArrayList;

/**
 * Created by leon on 7/21/2020.
 */
public class StuckInTheMudGame {

    private IOConsole console = new IOConsole(AnsiColor.YELLOW);

    RNG_ITEM dice = new RNG_ITEM(6);

    private int numberOfDice;
    private int score;

    private ArrayList<Integer> diceBox = new ArrayList<>();
    private ArrayList<Integer> mudDiceBox = new ArrayList<>();

    public StuckInTheMudGame(int numberOfDice, int score) {
        this.numberOfDice = numberOfDice;
        this.score = score;
    }

    public StuckInTheMudGame() {
        this.numberOfDice = 5;
        this.score = 0;
    }


    public void welcome() {
        console.println("\n" +
        "  ___ _           _     ___        __  __         _ " + "\n" +
        " / __| |_ _  _ __| |__ |_ _|_ _   |  \\/  |_  _ __| |" + "\n" +
        " \\__ \\  _| || / _| / /  | || ' \\  | |\\/| | || / _` |" + "\n" +
        " |___/\\__|\\_,_\\__|_\\_\\ |___|_||_| |_|  |_|\\_,_\\__,_|" + "\n");
    }

    public void printRules() {
        console.println("STUCK-IN-THE-MUD-RULES:\n" +
                "Roll five dice cubes and get the sum of your dice. You win if you get a sum of 50.\n" +
                "If you roll a 2 or 5 that dice cube is \"stuck in the mud\" and cannot be rolled again");
    }

    public String promptRoll() { //TODO: Have to add to flow
        return console.getStringInput("[ roll-dice ]" );
    }

    public int rollDice() { //for test purposes
        return dice.runRNG();
    }

    public void currentRoll(String yesRoll) {
        if (yesRoll.equals("roll-dice")) {
            for (int i = 0; i < numberOfDice; i++) {
                diceBox.add(dice.runRNG());
            }
        }
    }

    public void currentRollOutput() {
        console.println("Current roll: " + diceBox.toString());

    }

    public void currentMudBox() {

        for (int i = 0; i < diceBox.size(); i++) {
            if (diceBox.get(i) == 5 || diceBox.get(i) == 2) {
                mudDiceBox.add(diceBox.get(i));
                diceBox.remove(i);
                i--;
                numberOfDice--;
            }
        }
    }

    public int getNumberOfDice() {
        return numberOfDice;
    }

    public void currentMudBoxOutput() {
        console.println("Dice stuck in mud: " + mudDiceBox.toString());
    }

    public void score() {
        for (Integer box : diceBox) {
            score += box;
        }
    }

    public int getScore() {
        return score;
    }

    public void currentScore() {
        console.println("Score: " + String.valueOf(score));
    }

    public void clear() {
        diceBox.clear();
    }

    public String finalMessageCheck() {
        if (score >= 50) {
           return "\n" + "Congrats! You reached 50!" + "\n";

        }
           return "\n" + "All your dice got stuck in mud!" + "\n";
    }
    public void finalMessage() {
        console.println(finalMessageCheck());
    }

    //    public void stuckInTheMudGame() {
//        System.out.println("STUCK-IN-THE-MUD-RULES:\n" +
//                "\tRoll five dice cubes and get the sum of your dice. You win if you get a sum of 50.\n" +
//                "\tIf you roll a 2 or 5 that dice cube is \"stuck in the mud\" and cannot be rolled again");
//        System.out.println("----------------------------------------");
//
//    while(numberOfDice > 0 && score < 50) {
//
//
//            for (int i = 0; i < numberOfDice; i++) {
//                diceBox.add(dice.runRNG());
//            }
//            System.out.println("Current roll: " + diceBox.toString());
//
//            for (int i = 0; i < diceBox.size(); i++) {
//                if (diceBox.get(i) == 5 || diceBox.get(i) == 2) {
//                    mudDiceBox.add(diceBox.get(i));
//                    diceBox.remove(i);
//                    i--;
//                    numberOfDice--;
//                }
//            }
//
//            System.out.println("Stuck in the mud: " + mudDiceBox.toString());
//
//            System.out.println("----------------------------------------");
//            System.out.println("Current roll: " + diceBox.toString());
//
//        for (Integer box : diceBox) {
//            score += box;
//        }
//
//        System.out.println("Score:" + score);
//        diceBox.clear();
//
//        }
//
//    }

}