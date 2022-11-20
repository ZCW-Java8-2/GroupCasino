package com.github.zipcodewilmington.casino.games.Craps;

import com.github.zipcodewilmington.casino.GamblingInterface;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.gameobjects.RNG_ITEM;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

public class CrapsGame implements GameInterface, GamblingInterface {

    private  final IOConsole console = new IOConsole(AnsiColor.AUTO);
    RNG_ITEM dice = new RNG_ITEM(6);

    RNG_ITEM dice2 = new RNG_ITEM(6);
    public void announceGame() {console.println("Welcome to Craps!");
    }





    public String promptRoll() {
        return console.getStringInput("[ roll-dice ]");
    }


    public Integer rollNew( String yesRoll) {
        int sum = 0;
        if (yesRoll.equals("roll-dice")) {
            sum = dice.runRNG() + dice2.runRNG();
        }
        return sum;
    }


    public boolean doesItMatch(int firstRoll, int rollResult) {
        return firstRoll == rollResult;
    }
    public boolean isSeven( int rollResult) {
        return rollResult == 7;
    }
//    public String resultMessage (int firstRoll, int rollResult) {
//        if (doesItMatch(firstRoll, rollResult)) {
//            return "Congrats! You Win!";
//        } else if (firstRoll != rollResult) {
//            return "Try Again";
//        } else if (isSeven(rollResult)) {
//            return "You Lose!";
//        }
//    }
public String resultMessage (int firstRoll, int rollResult) {
        if (doesItMatch(firstRoll,rollResult)) {
            return "You Win!";
        } else if (isSeven(rollResult)) {
            return "Game Over";
        }else {
            return "Try Again";
        }
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
