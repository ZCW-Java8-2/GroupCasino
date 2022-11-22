package com.github.zipcodewilmington.casino.games.CoinToss;

import com.github.zipcodewilmington.Casino;
import com.github.zipcodewilmington.casino.casinoaccount.CasinoAccount;

import java.io.IOException;

import static com.github.zipcodewilmington.casino.casinoaccount.CasinoAccountManager.database;

public class CoinTossEngine {

    public void run(CasinoAccount activeAccount) throws IOException {

        CoinTossGame coinToss = new CoinTossGame();
        CoinTossPlayer coinTossPlayer = new CoinTossPlayer();
        Casino casino = new Casino();

        double balance = activeAccount.getBalance();
        System.out.println("Balance is: " + balance);
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
            balance = (coinToss.loseBet(bet, balance)); }

        activeAccount.setBalance(balance);

        System.out.println("Your new balance is: " + activeAccount.getBalance());
        casino.writeAllAccsToFile(database);
        casino.checkSelectionEnterGame(activeAccount);
    }
}
