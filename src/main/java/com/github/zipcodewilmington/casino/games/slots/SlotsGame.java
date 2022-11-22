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

    private CardDeckSuitEnum slot1 = CardDeckSuitEnum.HEARTS;
    private CardDeckSuitEnum slot2 = CardDeckSuitEnum.CLUBS;
    private CardDeckSuitEnum slot3 = CardDeckSuitEnum.CLUBS;

    public void announceGame(){
        console.println("  ______   _____       ___    _________   ______   \n"
                + ".' ____ \\ |_   _|    .'   `. |  _   _  |.' ____ \\  \n"
                + "| (___ \\_|  | |     /  .-.  \\|_/ | | \\_|| (___ \\_| \n"
                + " _.____`.   | |   _ | |   | |    | |     _.____`.  \n"
                + "| \\____) | _| |__/ |\\  `-'  /   _| |_   | \\____) | \n"
                + " \\______.'|________| `.___.'   |_____|   \\______.' \n"
                +"\n"
                +"WELCOME TO SUIT SLOTS\n");
    }

    public String getUserInput () {
        return console.getStringInput("[ 1. INSERT BILLS ] [ 2. EXIT ]\n");
    }

    public void runSlotsGame (String input) {
        if (input.equals("1")) { // INSERT BILLS
            getSlots();
            displaySlots();
        } else if (input.equals("2")) { // EXIT
            exitGame();
        }
    }

    public boolean evaluateTurn(){
        if (slot1.equals(slot2) && slot2.equals(slot3)){
            this.winner = true;
            return true;
        }
        return false;
    }

    public void checkIfWinner(){
        if (winner){
            console.println("HHHHOOOOLY CRAP! YOU WON!");
            console.println("... Want to play again???");
        } else {
            console.println("Meh... Better luck next time!");
        }
        endRound = true;
    }

    public void getSlots(){
        slot1 = CardDeckSuitEnum.values()[new Random().nextInt(4)];
        slot2 = CardDeckSuitEnum.values()[new Random().nextInt(4)];
        slot3 = CardDeckSuitEnum.values()[new Random().nextInt(4)];
    }

    public void displaySlots(){
        console.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
        console.println("\t\t\t"+ slot1.toString() + " " + slot2.toString() + " " + slot3.toString());
        console.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    public void exitGame(){
        continuePlaying = false;
    }
    public void resetRound(){
        this.winner = false;
        this.endRound = false;
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
    public void playAgain() {

    }

    @Override
    public void exitCasino() {

    }

    public void slotsASCII(){ }

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
}
