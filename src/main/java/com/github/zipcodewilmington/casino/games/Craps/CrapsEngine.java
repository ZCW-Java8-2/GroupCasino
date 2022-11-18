package com.github.zipcodewilmington.casino.games.Craps;

import com.github.zipcodewilmington.Casino;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.casinoaccount.CasinoAccount;

public class CrapsEngine {

    public void run(CasinoAccount activeAccount) {

    CrapsPlayer player = new CrapsPlayer();

    CrapsGame craps = new CrapsGame();

        craps.announceGame();



    String message = craps.promptRoll();
    int firstRoll = craps.rollNew(message);



     //   player.placeBet();

    //int rollResult = craps.rollDice();
    //       int RollDice2 = craps.rollDice2();

    //int firstRoll = craps.getFirstRoll();

//    String resultMessage = craps.resultMessage(firstRoll, rollResult);
//
//        System.out.println(resultMessage);
    }

}
