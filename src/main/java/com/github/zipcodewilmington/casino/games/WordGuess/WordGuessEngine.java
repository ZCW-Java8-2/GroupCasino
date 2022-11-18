package com.github.zipcodewilmington.casino.games.WordGuess;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;

public class WordGuessEngine implements GameInterface {
    @Override
    public void run() {

        WordGuessGame wordGuess = new WordGuessGame();

        while(wordGuess.continuePlaying){
            wordGuess.announceGame();
            wordGuess.initializeGameState();
            while(!wordGuess.checkIfOver()){
                wordGuess.display();
                wordGuess.getNextGuess();
                wordGuess.process();
                if (wordGuess.checkIfOver()){
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
