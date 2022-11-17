package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;

public class SlotsEngine implements GameInterface {

    @Override
    public void run() {

        SlotsGame slots = new SlotsGame();

        slots.announceGame();

        while(slots.continuePlaying){
            slots.resetRound();
            while(!slots.endRound) {
                slots.runSlotsGame(slots.getUserInput());
                slots.evaluateTurn();
                slots.checkIfWinner();
                if (slots.endRound){
                    break;
                }
            }
        }
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
    public void evaluateTurn() {

    }

    @Override
    public void playAgain() {

    }

    @Override
    public void exitCasino() {

    }
}
