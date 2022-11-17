package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.casinoaccount.CasinoAccount;
import com.github.zipcodewilmington.casino.casinoaccount.CasinoAccountManager;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.games.Baccarat.BaccaratEngine;
import com.github.zipcodewilmington.casino.games.Baccarat.BaccaratPlayer;
import com.github.zipcodewilmington.casino.games.BlackJack.BlackJackEngine;
import com.github.zipcodewilmington.casino.games.BlackJack.BlackJackPlayer;
import com.github.zipcodewilmington.casino.games.CoinToss.CoinTossEngine;
import com.github.zipcodewilmington.casino.games.CoinToss.CoinTossPlayer;
import com.github.zipcodewilmington.casino.games.Craps.CrapsEngine;
import com.github.zipcodewilmington.casino.games.Craps.CrapsPlayer;
import com.github.zipcodewilmington.casino.games.StuckInTheMud.StuckInMudEngine;
import com.github.zipcodewilmington.casino.games.StuckInTheMud.StuckInTheMudPlayer;
import com.github.zipcodewilmington.casino.games.slots.SlotsEngine;
import com.github.zipcodewilmington.casino.games.slots.SlotsPlayer;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

/**
 * Created by leon on 7/21/2020.
 */
public class Casino implements Runnable {
    private final IOConsole console = new IOConsole(AnsiColor.BLUE); //creates IO console obj

    @Override
    public void run() {
        String casinoDashBoardInput;
        CasinoAccountManager casinoAccountManager = new CasinoAccountManager();
        do {
            casinoDashBoardInput = getCasinoDashboardInput();
            if ("select-game".equals(casinoDashBoardInput)) {
                selectGame(casinoAccountManager);
            } else if ("create-account".equals(casinoDashBoardInput)) {
                createAccount(casinoAccountManager);
            }
        } while (!"exit-casino".equals(casinoDashBoardInput));
    }

    private String getCasinoDashboardInput() {
        return console.getStringInput(new StringBuilder()
                .append("Welcome to CASINO ROYAL") //TODO CREATE A BETTER SPLASH SCREEN - COLORS PICTURES?
                .append("\nFrom here, you can select any of the following options:")
                .append("\n\t[ create-account ], [ select-game ], [ exit-casino ] ")
                .toString());
    }

    private String getGameSelectionInput() {
        return console.getStringInput(new StringBuilder()
                .append("Welcome to the Game Selection Dashboard!") // TODO CREATE A BETTER SPLASH SCREEN - COLORS PICTURES?
                .append("\nFrom here, you can select any of the following options:")
                .append("\n\t[ SLOTS ], [ CRAPS ], [ BACCARAT ], [ BLACKJACK ], [ COIN TOSS ], [ STUCK IN THE MUD ]")
                .toString());
    }

    private void play(Object gameObject, Object playerObject) {
        GameInterface game = (GameInterface)gameObject;
        PlayerInterface player = (PlayerInterface)playerObject;
        game.add(player);
        game.run();
    }

    public void selectGame(CasinoAccountManager casinoAccountManager){
        String accountName = console.getStringInput("Enter your account name:");
        String accountPassword = console.getStringInput("Enter your account password:");
        CasinoAccount casinoAccount = casinoAccountManager.getAccount(accountName, accountPassword);
        boolean isValidLogin = casinoAccount != null;
        if (isValidLogin) {
            gamesList();
        } else {
            // TODO - implement better exception handling
            String errorMessage = "No account found with name of [ %s ] and password of [ %s ]";
            throw new RuntimeException(String.format(errorMessage, accountPassword, accountName));
        }
    }

    public void gamesList(){
        String gameSelectionInput = getGameSelectionInput().toUpperCase();

        if (gameSelectionInput.equals("SLOTS")) {
            play(new SlotsEngine(), new SlotsPlayer());

        } else if (gameSelectionInput.equals("CRAPS")){
            play(new CrapsEngine(), new CrapsPlayer());

        } else if (gameSelectionInput.equals("BACCARAT")){
            play(new BaccaratEngine(), new BaccaratPlayer());

        } else if (gameSelectionInput.equals("BLACKJACK")){
            play(new BlackJackEngine(), new BlackJackPlayer());

        } else if (gameSelectionInput.equals("COIN TOSS")){
            play(new CoinTossEngine(), new CoinTossPlayer());

        } else if (gameSelectionInput.equals("STUCK IN THE MUD")) {
            play(new StuckInMudEngine(), new StuckInTheMudPlayer());

        } else {
            // TODO - implement better exception handling
            String errorMessage = "[ %s ] is an invalid game selection";
            throw new RuntimeException(String.format(errorMessage, gameSelectionInput));
        }
    }

    public void createAccount(CasinoAccountManager casinoAccountManager){
        console.println("Welcome to the account-creation screen.");
        String accountName = console.getStringInput("Enter your account name:");
        String accountPassword = console.getStringInput("Enter your account password:");
        CasinoAccount newAccount = casinoAccountManager.createAccount(accountName, accountPassword);
        casinoAccountManager.registerAccount(newAccount);
    }

}
