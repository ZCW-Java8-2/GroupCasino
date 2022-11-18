package com.github.zipcodewilmington.casino.games.Craps;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;

public class CrapsEngine implements GameInterface {

    CrapsPlayer player = new CrapsPlayer();

    @Override
    public void run() {
        CrapsGame craps = new CrapsGame();

        craps.announceGame();

        System.out.println("Roll the Dice");

        player.placeBet();

        craps.WelcomeToCraps();

        int rollResult = craps.rollDice();
 //       int RollDice2 = craps.rollDice2();

        int firstRoll = craps.getFirstRoll();

        String resultMessage = craps.resultMessage(firstRoll, rollResult);

        System.out.println(resultMessage);
    }

    @Override
    public void gameName() {

    }

    @Override
    public void gameRules() {

    }

    @Override
    public void add(PlayerInterface player) {
        this.player = (CrapsPlayer) player;

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
