package com.github.zipcodewilmington.casino.games.CoinToss;

import com.github.zipcodewilmington.casino.GamblingInterface;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.gameobjects.RNG_ITEM;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

public class CoinTossGame implements GameInterface, GamblingInterface {
    private final IOConsole console = new IOConsole(AnsiColor.YELLOW);
    private final RNG_ITEM coin = new RNG_ITEM(2);

    public void welcomeToCoinToss(){
        console.println("\n" +
                " ,-----.       ,--.            ,--------.                     " + "\n" +
                "'  .--./ ,---. `--',--,--,     '--.  .--',---.  ,---.  ,---.  " + "\n" +
                "|  |    | .-. |,--.|      \\       |  |  | .-. |(  .-' (  .-'  " + "\n" +
                "'  '--'\\' '-' '|  ||  ||  |       |  |  ' '-' '.-'  `).-'  `) " + "\n" +
                " `-----' `---' `--'`--''--'       `--'   `---' `----' `----'  " + "\n");
    }
    public int getPlayerGuess() {
        return console.getIntegerInput("Welcome to Coin Toss!" +
                "\n1. Heads" +
                "\n2. Tails" +
                "\nEnter a number:");
    }

    public int flipCoin() {
        return coin.runRNG();
    }

    public boolean doesItMatch(int playerGuess, int flipResult) {
        return playerGuess == flipResult;
    }

    public String resultMessage(boolean didYouWin) {
        if (didYouWin) {
            return "Congrats! You won the coin toss!";
        }
        else {
            return "Game over! You lost the coin toss!";
        }
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
