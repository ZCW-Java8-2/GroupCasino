package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.GamblingInterface;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.gameobjects.CardDeckSuitEnum;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

import java.util.Random;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsGame implements GameInterface, GamblingInterface {

    private final IOConsole console = new IOConsole(AnsiColor.GREEN);

    boolean continuePlaying = true;

    boolean winner = false;

    boolean endRound = false;

    private CardDeckSuitEnum slot1;
    private CardDeckSuitEnum slot2;
    private CardDeckSuitEnum slot3;


    public void getSlots(){
        slot1 = CardDeckSuitEnum.values()[new Random().nextInt(4)];
        slot2 = CardDeckSuitEnum.values()[new Random().nextInt(4)];
        slot3 = CardDeckSuitEnum.values()[new Random().nextInt(4)];
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

    public boolean evaluateTurn(){
        if (slot1.equals(slot2) && slot2.equals(slot3)){
            this.winner = true;
            return true;
        }
        return false;
    }

    @Override
    public void playAgain() {

    }

    @Override
    public void exitCasino() {

    }

    public void checkIfWinner(){
        if (this.winner){
            console.println("HHHHOOOOLY CRAP! YOU WON!");
            console.println("... Want to play again???");
            endRound = true;
        } else {
            console.println("Meh... Better luck next time!");
            endRound = true;
        }
    }

    public void slotsASCII(){

    }

    public void displaySlots(){
        console.println("");
        console.println(slot1.toString() + " " + slot2.toString() + " " + slot3.toString());
        console.println("");
    }

    public void resetRound(){
        this.winner = false;
        this.endRound = false;
    }

    public void runSlotsGame (String input) {
        if (input.equals("PULL LEVER")) {
            getSlots();
            displaySlots();
        } else if (input.equals("EXIT")) {
            exitGame();
        }
        }

    public String getUserInput () {
        return console.getStringInput("[ PULL LEVER ] [ EXIT ]\n");
    }

    public void announceGame(){
        console.println("Welcome to Slots!");
    }

    public void exitGame(){
        continuePlaying = false;
    }

    @Override
    public void getBetAmount() {

    }

    @Override
    public double winBet(double bet, double balance) {


        return balance + bet;
    }

    @Override
    public double loseBet(double bet, double balance) {


        return balance - bet;
    }

    @Override
    public void addToBalance() {

    }

    @Override
    public void subFromBalance() {

    }
}
