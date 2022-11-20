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

public class Casino implements Runnable {
    private final IOConsole console = new IOConsole(AnsiColor.BLUE);
    CasinoAccount activeAccount;

    private String promptInitialMenuGetInput() {
        return console.getStringInput("Welcome to CASINO ROYAL" +
                "\nFrom here, you can select any of the following options:" +
                "\n\t[ 1. create-account ], [ 2. login ], [ 3. exit-casino ] ");
    }

    @Override
    public void run() { // CalculateInitialMenuInput
        casinoRoyalText();
        String casinoDashBoardInput;
        CasinoAccountManager casinoAccountManager = new CasinoAccountManager();
        do {
            casinoDashBoardInput = promptInitialMenuGetInput();
            if ("2".equals(casinoDashBoardInput)) {
                validateLoginShowGameList(casinoAccountManager);
            } else if ("1".equals(casinoDashBoardInput)) {
                newAccountInput(casinoAccountManager);
            }
        } while (!"3".equals(casinoDashBoardInput));
    }

    public void validateLoginShowGameList(CasinoAccountManager casinoAccountManager){
        String accountName = console.getStringInput("Enter your account name:");
        String accountPassword = console.getStringInput("Enter your account password:");
        CasinoAccount casinoAccount = casinoAccountManager.getAccount(accountName, accountPassword);
        boolean isValidLogin = casinoAccount != null;
        if (isValidLogin) {
            activeAccount = casinoAccount;
            checkSelectionEnterGame(activeAccount);
        } else {
            // TODO - implement better exception handling
            String errorMessage = "No account found with name of [ %s ] and password of [ %s ]";
            throw new RuntimeException(String.format(errorMessage, accountPassword, accountName));
        }
    }

    public void newAccountInput(CasinoAccountManager casinoAccountManager){
        console.println("Welcome to the account-creation screen.");
        String username = console.getStringInput("Enter your account name:");
        String password = console.getStringInput("Enter your account password:");
        Double balance = console.getDoubleInput("Enter your initial balance:");
        CasinoAccount newAccount = casinoAccountManager.createAccount(username, password, balance);
        System.out.println("Account has been created!");
        casinoAccountManager.addToDatabase(newAccount);
    }

    private String promptGameMenuGetInput() {
        return console.getStringInput("Welcome to the Game Selection Dashboard!" +
                "\nFrom here, you can select any of the following options:" +
                "\n\t[ 1. SLOTS ] [ 2. COIN TOSS ] [ 3. STUCK IN THE MUD ] [ 4. WORD GUESS ] [ 5. CRAPS ] [ 6. BLACKJACK ] ");
                //"\n\t[ SLOTS ], [ CRAPS ], [ BACCARAT ], [ BLACKJACK ], [ COIN TOSS ], [ STUCK IN THE MUD ], [ WORD GUESS ]");
    }

    public void checkSelectionEnterGame(CasinoAccount activeAccount){
        String gameSelectionInput = promptGameMenuGetInput().toUpperCase();

        if (gameSelectionInput.equals("1")) { // SLOTS
            SlotsEngine slotsEngine = new SlotsEngine();
            slotsEngine.run(activeAccount);

        } else if (gameSelectionInput.equals("2")){ // COIN TOSS
            CoinTossEngine coinTossEngine = new CoinTossEngine();
            coinTossEngine.run(activeAccount);

        } else if (gameSelectionInput.equals("3")) { // STUCK IN THE MUD
            StuckInMudEngine stuckInMudEngine = new StuckInMudEngine();
            stuckInMudEngine.run();

        } else if (gameSelectionInput.equals("4")) { // WORD GUESS
            WordGuessEngine wordGuessEngine = new WordGuessEngine();
            wordGuessEngine.run();

        } else if (gameSelectionInput.equals("5")){ // CRAPS
            CrapsEngine crapsEngine = new CrapsEngine();
            crapsEngine.run();

//        } else if (gameSelectionInput.equals("6")){ // BLACKJACK
//            BlackJackEngine blackJackEngine = new BlackJackEngine();
//            blackJackEngine.run();

//        } else if (gameSelectionInput.equals("BACCARAT")){ // BACCARAT
//            BaccaratEngine baccaratEngine = new BaccaratEngine();
//            baccaratEngine.run();

        } else {
            // TODO - implement better exception handling
            String errorMessage = "[ %s ] is an invalid game selection";
            throw new RuntimeException(String.format(errorMessage, gameSelectionInput));
        }
    }

    private void casinoRoyalText(){
        console.println(  "   ______           _                ____                    __   " +
                            "\n  / ____/___ ______(_)___  ____     / __ \\____  __  ______ _/ /__ " +
                            "\n / /   / __ `/ ___/ / __ \\/ __ \\   / /_/ / __ \\/ / / / __ `/ / _ \\" +
                            "\n/ /___/ /_/ (__  ) / / / / /_/ /  / _, _/ /_/ / /_/ / /_/ / /  __/" +
                            "\n\\____/\\__,_/____/_/_/ /_/\\____/  /_/ |_|\\____/\\__, /\\__,_/_/\\___/ " +
                                 "\n                                             /____/               ");
    }

}
