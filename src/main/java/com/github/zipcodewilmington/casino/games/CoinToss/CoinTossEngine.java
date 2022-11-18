package com.github.zipcodewilmington.casino.games.CoinToss;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;

public class CoinTossEngine {

    public  void run() {

        CoinTossGame coinToss = new CoinTossGame();

        CoinTossPlayer coinTossPlayer = new CoinTossPlayer();

        double balance = coinTossPlayer.getBalance();

        System.out.println("Balance is: " + coinTossPlayer.getBalance());

        double bet = coinTossPlayer.placeBet();

        coinToss.welcomeToCoinToss();

        int playerGuess = coinToss.getPlayerGuess();

        int flipResult = coinToss.flipCoin();

        boolean didYouWin = coinToss.doesItMatch(playerGuess, flipResult);

        String resultMessage = coinToss.resultMessage(didYouWin);

        System.out.println(resultMessage);

        if (didYouWin) {
            balance = coinToss.winBet(bet, balance); }
        else {
            balance = coinToss.loseBet(bet, balance); }

        coinTossPlayer.setBalance(balance);

        System.out.println("Your new balance is: " + coinTossPlayer.getBalance());

    }
}
