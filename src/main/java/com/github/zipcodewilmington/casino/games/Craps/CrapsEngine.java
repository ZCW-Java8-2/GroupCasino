package com.github.zipcodewilmington.casino.games.Craps;

import com.github.zipcodewilmington.Casino;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.casinoaccount.CasinoAccount;

import java.io.IOException;

import static com.github.zipcodewilmington.casino.casinoaccount.CasinoAccountManager.database;

public class CrapsEngine {

//    public void run(CasinoAccount activeAccount) {


    public void run(CasinoAccount activeAccount) throws IOException {
        Casino casino = new Casino();
        //CrapsPlayer player = new CrapsPlayer();
        CrapsGame craps = new CrapsGame();

        craps.announceGame();

        String yesRoll = craps.promptRoll();

        boolean isSeven = true;
        int firstRoll;
        while (isSeven) {

            // get first roll from player
            firstRoll = craps.rollNew(yesRoll);
            // if firstRoll equals 7, prompt promptRoll again
//  if second firstRoll equals 7 reprompt promptRoll
            // isSeven is true means firstRoll equals 7
            // isSeven is false when not equals to 7
            if (firstRoll != 7) {
                isSeven = false;
            }
        }

        firstRoll = craps.rollNew(yesRoll);
        System.out.println(firstRoll);
// keep rolling to match first roll
        boolean stillPlaying = true;
        while (stillPlaying) {
            yesRoll = craps.promptRoll();
            int rollResult = craps.rollNew(yesRoll);
            System.out.println(rollResult);
            //loop until firstRoll = rollResult
            String result = craps.resultMessage(firstRoll, rollResult);
            // if a 7 game over
            System.out.println(result);
            // if firstRoll does  equal rollResult
            //if rollResult equals 7
            if (firstRoll == rollResult || rollResult == 7) {
                stillPlaying = false;
            }
        }

        //   player.placeBet();

        //int rollResult = craps.rollDice();
        //       int RollDice2 = craps.rollDice2();

        //int firstRoll = craps.getFirstRoll();

//    String resultMessage = craps.resultMessage(firstRoll, rollResult);
//
//        System.out.println(resultMessage);
        casino.writeAllAccsToFile(database);
        casino.checkSelectionEnterGame(activeAccount);
    }

}
