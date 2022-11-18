package com.github.zipcodewilmington.casino.games.Craps;

import com.github.zipcodewilmington.casino.GamblingInterface;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.gameobjects.RNG_ITEM;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

public class CrapsGame implements GameInterface, GamblingInterface {

    private  final IOConsole console = new IOConsole(AnsiColor.AUTO);
    RNG_ITEM dice = new RNG_ITEM(12);

    // RNG_ITEM dice2 = new RNG_ITEM(6);
    public void announceGame() {console.println("Welcome to Craps!");
    }

    public void WelcomeToCraps() {
    }

    public Integer getFirstRoll(){
        return console.getIntegerInput("Throw the Dice!" +
                "\n1. Throw"
        );
    }


    public String promptRoll() {
        return console.getStringInput("[ roll-dice ]");
    }


    public void rollNew( String yesRoll) {
        if (yesRoll.equals("roll-dice")) {
            dice.runRNG();
        }
    }

    public int rollDice() {return dice.runRNG();
    }
    //public int rollDice2() {return dice2.runRNG();
    //}

    public boolean doesItMatch(int firstRoll, int rollResult) {
        return firstRoll == rollResult;
    }
    public boolean isSeven( int rollResult) {
        return rollResult == 7;
    }
    public String resultMessage (int firstRoll, int rollResult) {
        if (doesItMatch(firstRoll, rollResult)) {
            return "Congrats! You Win!";
        } else if (firstRoll != rollResult) {
            return "Try Again";
        } else if (isSeven(rollResult)) {

        }return "You Lose!";
    }


    @Override
    public void getBetAmount() {

    }

    @Override
    public double winBet(double bet, double balance) {
        return 0;
    }

    @Override
    public double loseBet(double bet, double balance) {
        return 0;
    }

    @Override
    public void addToBalance() {

    }

    @Override
    public void subFromBalance() {

    }

    @Override
    public void run() {

    }

    @Override
    public void gameName() {

    }

    @Override
    public void gameRules() {

    }

    @Override
    public void add(PlayerInterface player) {

    }

    @Override
    public void remove(PlayerInterface player) {

    }

    @Override
    public void isGameOver() {

    }

    @Override
    public boolean evaluateTurn() {
        return false;
    }

    @Override
    public void playAgain() {

    }

    @Override
    public void exitCasino() {

    }
}
