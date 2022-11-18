package com.github.zipcodewilmington.casino.games.WordGuess;

import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

import java.util.Arrays;
import java.util.Random;

public class WordGuessGame {

    private final IOConsole console = new IOConsole(AnsiColor.CYAN);
    String[] wordArray = { "cat", "dog", "bird", "tiger", "godzilla", "mothra"};
    String currentWord = "";
    char currentGuess = ' ';

    int cGI = 0; // Current Guesses Integer
    boolean continuePlaying = true;
    char[] cGA; // Current Guesses Array
    char[] aWA; // Actual Word Array


    public String getRandomWord (){
        Random rand = new Random();
        int randIndex = rand.nextInt(this.wordArray.length);
        this.currentWord = this.wordArray[randIndex];
        return this.currentWord;
    }

    public void display (){
        console.println("Current Guesses:");
        console.println(String.valueOf(this.cGA));
        console.println("You have " + this.cGI + " tries left.");
    }

    public void announceGame(){
        console.println("Let's Play Word Guess!");
    }

    public void initializeGameState (){
        gameOver();
        getRandomWord();
        wordToArray();
        wordToCurrentGuessArray();
        guessSetter();
    }
    public void wordToArray(){
        this.aWA = this.currentWord.toCharArray();
    }

    public void wordToCurrentGuessArray(){
        this.cGA = new char[this.aWA.length];
        for (int i = 0; i < this.aWA.length; i++) {
            this.cGA[i] = '_';
        }
    }

    public void getNextGuess(){
        String input = console.getStringInput("Enter a single Character:");
        this.currentGuess = input.charAt(0);
    }

    public void process(){
        for (int i = 0; i < this.cGA.length; i++){
            if ( this.aWA[i] == this.currentGuess ){
                this.cGA[i] = this.currentGuess;
            }
        }
        this.cGI -= 1;
    }

    public boolean checkIfOver(){
        if (Arrays.equals(this.aWA, this.cGA)){
            winningGame();
            return true;
        }
        if (this.cGI == 0) {
            losingGame();
            return true;
        }
        return false;
    }

    public void guessSetter(){
        this.cGI = this.aWA.length;
    }

    public void gameOver(){
        getRandomWord();
        wordToArray();
        wordToCurrentGuessArray();
    }

    public void winningGame(){
        console.println("**************************");
        console.println(String.valueOf(this.cGA));
        console.println("Congratulations, You Won!");
        askToPlayAgain();
    }

    public void losingGame(){
        System.out.println("You lost! You ran out of guesses.");
        askToPlayAgain();
    }
    public void askToPlayAgain() {
        String answer = console.getStringInput("Would you like to play again? (y/n)");
        if (answer.equals("y")) this.continuePlaying = true;
        if (answer.equals("n")) this.continuePlaying = false;
    }
}
