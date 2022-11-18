package com.github.zipcodewilmington.casino.games.Craps;

import com.github.zipcodewilmington.Casino;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.casinoaccount.CasinoAccount;

public class CrapsEngine {

    CrapsPlayer player = new CrapsPlayer();

        CrapsGame craps = new CrapsGame();
       // craps.welcome();

     //  double balance = activeAccount.getBalance();
        craps.announceGame();

        System.out.println("Roll the Dice");


        craps.WelcomeToCraps();

        player.placeBet();

        int rollResult = craps.rollDice();
        //       int RollDice2 = craps.rollDice2();

        int firstRoll = craps.getFirstRoll();

        String resultMessage = craps.resultMessage(firstRoll, rollResult);

        System.out.println(resultMessage);
    }

//    @Override
//    public void gameName() {
//
//    }
//
//    @Override
//    public void gameRules() {
//
//    }
//
//    @Override
//    public void add(PlayerInterface player) {
//        this.player = (CrapsPlayer) player;
//
//    }
//
//    @Override
//    public void remove(PlayerInterface player) {
//
//    }
//
//    @Override
//    public void isGameOver() {
//
//    }
//
//    @Override
//    public boolean evaluateTurn() {
//        return false;
//    }
//
//    @Override
//    public void playAgain() {
//
//    }
//
//    @Override
//    public void exitCasino() {
//
//    }
}
