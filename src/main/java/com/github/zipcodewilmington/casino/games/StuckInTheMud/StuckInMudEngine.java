package com.github.zipcodewilmington.casino.games.StuckInTheMud;

import com.github.zipcodewilmington.Casino;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.casinoaccount.CasinoAccount;

import java.io.IOException;

import static com.github.zipcodewilmington.casino.casinoaccount.CasinoAccountManager.database;

public class StuckInMudEngine {

    public void run(CasinoAccount activeAccount) throws IOException {

        Casino casino = new Casino();

        int numberOfDice = 5;
        int score = 0;

        StuckInTheMudGame game = new StuckInTheMudGame(numberOfDice, score);
        game.welcome();
        game.printRules();

        while (numberOfDice > 0 && score < 50) { //End game if score is 50
            String yesRoll = game.promptRoll();
            game.currentRoll(yesRoll);
            game.currentRollOutput();
            game.currentMudBox();
            numberOfDice = game.getNumberOfDice();
            game.currentMudBoxOutput();
            game.score();
            score = game.getScore();
            game.currentScore();
            game.clear();
        }
        game.finalMessageCheck();
        game.finalMessage();
        casino.writeAllAccsToFile(database);
        casino.checkSelectionEnterGame(activeAccount);
    }
}
