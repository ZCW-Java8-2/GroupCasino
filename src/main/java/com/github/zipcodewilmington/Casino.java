package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.casinoaccount.CasinoAccount;
import com.github.zipcodewilmington.casino.casinoaccount.CasinoAccountManager;
import com.github.zipcodewilmington.casino.games.Baccarat.BaccaratEngine;
import com.github.zipcodewilmington.casino.games.BlackJack.BlackJackEngine;
import com.github.zipcodewilmington.casino.games.CoinToss.CoinTossEngine;
import com.github.zipcodewilmington.casino.games.Craps.CrapsEngine;
import com.github.zipcodewilmington.casino.games.StuckInTheMud.StuckInMudEngine;
import com.github.zipcodewilmington.casino.games.WordGuess.WordGuessEngine;
import com.github.zipcodewilmington.casino.games.slots.SlotsEngine;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

public class
Casino implements Runnable {
    private final IOConsole console = new IOConsole(AnsiColor.BLUE);
    CasinoAccount activeAccount;

    private String promptInitialMenuGetInput() {
        return console.getStringInput(new StringBuilder()
                .append("Welcome to CASINO ROYAL")
                .append("\nFrom here, you can select any of the following options:")
                .append("\n\t[ create-account ], [ select-game ], [ exit-casino ] ")
                .toString());
    }

    @Override
    public void run() { // CalculateInitialMenuInput
        casinoRoyalText();
        String casinoDashBoardInput;
        CasinoAccountManager casinoAccountManager = new CasinoAccountManager();
        do {
            casinoDashBoardInput = promptInitialMenuGetInput();
            if ("select-game".equals(casinoDashBoardInput)) {
                validateLoginShowGameList(casinoAccountManager);
            } else if ("create-account".equals(casinoDashBoardInput)) {
                newAccountInput(casinoAccountManager);
            }
        } while (!"exit-casino".equals(casinoDashBoardInput));
    }

    public void validateLoginShowGameList(CasinoAccountManager casinoAccountManager){
        String accountName = console.getStringInput("Enter your account name:");
        String accountPassword = console.getStringInput("Enter your account password:");
        CasinoAccount casinoAccount = casinoAccountManager.getAccount(accountName, accountPassword);
        boolean isValidLogin = casinoAccount != null;
        if (isValidLogin) {
            activeAccount = casinoAccount;
            checkSelectionEnterGame();
        } else {
            // TODO - implement better exception handling
            String errorMessage = "No account found with name of [ %s ] and password of [ %s ]";
            throw new RuntimeException(String.format(errorMessage, accountPassword, accountName));
        }
    }

    public void newAccountInput(CasinoAccountManager casinoAccountManager){
        //TODO Gets New Account Input & Call Account Creation Method
        console.println("Welcome to the account-creation screen.");
        String username = console.getStringInput("Enter your account name:");
        String password = console.getStringInput("Enter your account password:");
        Double balance = console.getDoubleInput("Enter your initial balance:");
        //TODO stores new account into variable
        CasinoAccount newAccount = casinoAccountManager.createAccount(username, password, balance);
        //activeAccount = newAccount;
        System.out.println("Account has been created!");
        casinoAccountManager.addToDatabase(newAccount);
    }

    private String promptGameMenuGetInput() {
        return console.getStringInput(new StringBuilder()
                .append("Welcome to the Game Selection Dashboard!")
                .append("\nFrom here, you can select any of the following options:")
                .append("\n\t[ SLOTS ], [ CRAPS ], [ BACCARAT ], [ BLACKJACK ], [ COIN TOSS ], [ STUCK IN THE MUD ], [ WORD GUESS ]")
                .toString());
    }

    public void checkSelectionEnterGame(){
        String gameSelectionInput = promptGameMenuGetInput().toUpperCase();

        if (gameSelectionInput.equals("SLOTS")) {
            SlotsEngine slotsEngine = new SlotsEngine();
            slotsEngine.run(activeAccount);

        } else if (gameSelectionInput.equals("CRAPS")){
            CrapsEngine crapsEngine = new CrapsEngine();
            //crapsEngine.run();

        } else if (gameSelectionInput.equals("BACCARAT")){
            BaccaratEngine baccaratEngine = new BaccaratEngine();
            //baccaratEngine.run();

        } else if (gameSelectionInput.equals("BLACKJACK")){
            BlackJackEngine blackJackEngine = new BlackJackEngine();
            //blackJackEngine.run();

        } else if (gameSelectionInput.equals("COIN TOSS")){
            CoinTossEngine coinTossEngine = new CoinTossEngine();
            coinTossEngine.run(activeAccount);

        } else if (gameSelectionInput.equals("STUCK IN THE MUD")) {
            StuckInMudEngine stuckInMudEngine = new StuckInMudEngine();
            //stuckInMudEngine.run();

        } else if (gameSelectionInput.equals("WORD GUESS")) {
            WordGuessEngine wordGuessEngine = new WordGuessEngine();
            wordGuessEngine.run();

        } else {
            // TODO - implement better exception handling
            String errorMessage = "[ %s ] is an invalid game selection";
            throw new RuntimeException(String.format(errorMessage, gameSelectionInput));
        }
    }

//    private void play(Object gameObject, Object playerObject) { //TODO MAKE SURE THIS IS CORRECT
//        GameInterface game = (GameInterface)gameObject; // GameInterface is used on GameEngine
//        PlayerInterface player = (PlayerInterface)playerObject;
//        game.add(player);
//        game.run();
//    }

    private void casinoRoyalText(){
        console.println(  "   ______           _                ____                    __" +
                            "\n  / ____/___ ______(_)___  ____     / __ \\____  __  ______ _/ /" +
                            "\n / /   / __ `/ ___/ / __ \\/ __ \\   / /_/ / __ \\/ / / / __ `/ / " +
                            "\n/ /___/ /_/ (__  ) / / / / /_/ /  / _, _/ /_/ / /_/ / /_/ / /  " +
                            "\n\\____/\\__,_/____/_/_/ /_/\\____/  /_/ |_|\\____/\\__, /\\__,_/_/   " +
                                 "\n                                             /____/            ");
    }

}
