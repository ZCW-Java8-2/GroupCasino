package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.casinoaccount.CasinoAccount;
import com.github.zipcodewilmington.casino.games.CoinToss.CoinTossPlayer;

public class SlotsEngine {

    public void run(CasinoAccount activeAccount) {

        SlotsGame slots = new SlotsGame();
        SlotsPlayer slotsPlayer = new SlotsPlayer();

        slots.announceGame();

        while(slots.continuePlaying){
            slots.resetRound();
            while(!slots.endRound) {

                double balance = activeAccount.getBalance();
                System.out.println("Balance is: " + balance);
                double bet = slotsPlayer.placeBet();

                slots.runSlotsGame(slots.getUserInput());
                boolean didIWin = slots.evaluateTurn();
                slots.checkIfWinner();

                if (didIWin) {
                    balance = slots.winBet(bet, balance); }
                else {
                    balance = (slots.loseBet(bet, balance)); }
                activeAccount.setBalance(balance);
                System.out.println("Your new balance is: " + activeAccount.getBalance());

                if (slots.endRound){
                    break;
                }
            }
        }
    }

}
