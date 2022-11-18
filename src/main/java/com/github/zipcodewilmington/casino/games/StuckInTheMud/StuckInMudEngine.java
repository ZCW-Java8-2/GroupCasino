package com.github.zipcodewilmington.casino.games.StuckInTheMud;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;

public class StuckInMudEngine implements GameInterface {

    @Override
    public void run() {

    int numberOfDice = 5;
    int score = 0;

    StuckInTheMudGame game = new StuckInTheMudGame(numberOfDice, score);
        game.welcome();
        game.printRules();

    while(numberOfDice > 0 && score < 50) { //End game if score is 50
        String yesRoll = game.promptRoll();
        game.currentRoll(yesRoll);
        game.currentRollOutput();
        game.currentMudBox();
        numberOfDice = game.getNumberOfDice();
        game.currentMudBoxOutput();
        game.score();
        score = game.getScore();
        game.currentScore();
        game.clear();
    }
        game.finalMessageCheck();
        game.finalMessage();
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
