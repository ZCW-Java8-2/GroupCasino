package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.casinoaccount.AccountDatabase;
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

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Casino implements Runnable {
    private static final IOConsole console = new IOConsole(AnsiColor.BLUE);

    CasinoAccount activeAccount;

    private String promptInitialMenuGetInput() {
        casinoRoyaleText();
        return console.getStringInput("\nWelcome to CASINO ROYALE" +
                "\nFrom here, you can select any of the following options:" +
                "\n\t[ 1. CREATE ACCOUNT ], [ 2. LOGIN ], [ 3. EXIT CASINO ] ");
    }

    @Override
    public void run() { // CalculateInitialMenuInput
        String casinoDashBoardInput;
        CasinoAccountManager casinoAccountManager = new CasinoAccountManager();
        try {
            readFileAndStore(casinoAccountManager); //TODO WORKS (single acc)
            //calvinReadAccFromFile(casinoAccountManager); //TODO WORKS (single acc)
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        do {
            casinoDashBoardInput = promptInitialMenuGetInput();
            if ("2".equals(casinoDashBoardInput)) {
                validateLoginShowGameList(casinoAccountManager);
            } else if ("1".equals(casinoDashBoardInput)) {
                try {
                    newAccountInput(casinoAccountManager);
                } catch (IOException e) {
                    promptGameMenuGetInput();
                }
            }
        } while (!"3".equals(casinoDashBoardInput));
    }

    public void validateLoginShowGameList(CasinoAccountManager casinoAccountManager) {
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

    public void newAccountInput(CasinoAccountManager casinoAccountManager) throws IOException {
        console.println("\nWelcome to the account-creation screen.");
        String username = console.getStringInput("Enter your account name:");
        String password = console.getStringInput("Enter your account password:");
        Double balance = console.getDoubleInput("Enter your initial balance:");
        CasinoAccount newAccount = casinoAccountManager.createAccount(username, password, balance);
        writeToFile(newAccount);
        //calvinAccWriteToFile(newAccount); //TODO WORKS
        System.out.println("Account has been created!");
        casinoAccountManager.addToDatabase(newAccount);
    }

    private String promptGameMenuGetInput() {
        gameDashboard();
        return console.getStringInput("\nWelcome to the Game Selection Dashboard!" + // TODO ASCII ART????
                "\nFrom here, you can select any of the following options:" +
                "\n\t[ 1. SLOTS ] [ 2. COIN TOSS ] [ 3. STUCK IN THE MUD ] [ 4. WORD GUESS ] [ 5. CRAPS ] [ 6. BLACKJACK ] [ 7. CASINO MAIN MENU ]");
        //"\n\t[ SLOTS ], [ CRAPS ], [ BACCARAT ], [ BLACKJACK ], [ COIN TOSS ], [ STUCK IN THE MUD ], [ WORD GUESS ]");
    }

    public void checkSelectionEnterGame(CasinoAccount activeAccount) {
        boolean end = false;
        while (!end) {
            try {
                String gameSelectionInput = promptGameMenuGetInput().toUpperCase();

                switch (gameSelectionInput) {
                    case "1":  // SLOTS
                        SlotsEngine slotsEngine = new SlotsEngine();
                        slotsEngine.run(activeAccount);
                        break;

                    case "2":  // COIN TOSS
                        new CoinTossEngine().run(activeAccount);
                        break;

                    case "3":  // STUCK IN THE MUD
                        StuckInMudEngine stuckInMudEngine = new StuckInMudEngine();
                        stuckInMudEngine.run(activeAccount);
                        break;

                    case "4":  // WORD GUESS
                        WordGuessEngine wordGuessEngine = new WordGuessEngine();
                        wordGuessEngine.run(activeAccount);
                        break;

                    case "5":  // CRAPS
                        CrapsEngine crapsEngine = new CrapsEngine();
                        crapsEngine.run(activeAccount);
                        break;

//        } else if (gameSelectionInput.equals("6")){ // BLACKJACK
//            BlackJackEngine blackJackEngine = new BlackJackEngine();
//            blackJackEngine.run();

//        } else if (gameSelectionInput.equals("BACCARAT")){ // BACCARAT
//            BaccaratEngine baccaratEngine = new BaccaratEngine();
//            baccaratEngine.run();
                    case "7":
                        end = true;
                        break;
                    default:
                        // TODO - implement better exception handling
                        String errorMessage = "[ %s ] is an invalid game selection";
//                    throw new RuntimeException(String.format(errorMessage, gameSelectionInput));
                }
            } catch (InputMismatchException e) {
                console.println("Invalid Choice.");
                promptGameMenuGetInput().toUpperCase();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    private void casinoRoyaleText() {
        console.println("\n   ______           _                ____                    __   " +
                "\n  / ____/___ ______(_)___  ____     / __ \\____  __  ______ _/ /__ " +
                "\n / /   / __ `/ ___/ / __ \\/ __ \\   / /_/ / __ \\/ / / / __ `/ / _ \\" +
                "\n/ /___/ /_/ (__  ) / / / / /_/ /  / _, _/ /_/ / /_/ / /_/ / /  __/" +
                "\n\\____/\\__,_/____/_/_/ /_/\\____/  /_/ |_|\\____/\\__, /\\__,_/_/\\___/ " +
                "\n                                             /____/               ");
    }

    private void gameDashboard(){
        console.println("\n   ____    _    ____ ___ _   _  ___      ____    _    ____  _   _ ____   ___    _    ____  ____  " +
                "\n  / ___|  / \\  / ___|_ _| \\ | |/ _ \\    |  _ \\  / \\  / ___|| | | | __ ) / _ \\  / \\  |  _ \\|  _ \\ " +
                "\n | |     / _ \\ \\___ \\| ||  \\| | | | |   | | | |/ _ \\ \\___ \\| |_| |  _ \\| | | |/ _ \\ | |_) | | | |" +
                "\n | |___ / ___ \\ ___) | || |\\  | |_| |   | |_| / ___ \\ ___) |  _  | |_) | |_| / ___ \\|  _ <| |_| |"+
                "\n  \\____/_/   \\_\\____/___|_| \\_|\\___/    |____/_/   \\_\\____/|_| |_|____/ \\___/_/   \\_\\_| \\_\\____/ ");
    }

    public void calvinAccWriteToFile(CasinoAccount account) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("CasinoAccountLog.txt", true));

        String accountName = String.valueOf(account.getAccountName());
        String password = String.valueOf(account.getPassword());
        String balance = String.valueOf(account.getBalance());

        writer.write(accountName);
        writer.write("\n" + password);
        writer.write("\n" + balance);
        writer.close();

        console.println("[NOTICE] Account has been written to file");
    }

    public void calvinReadAccFromFile(CasinoAccountManager casinoAccountManager) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("CasinoAccountLog.txt"));
        String holdsLine;
        String[] holdsValue = {"1", "2", "3"};
        int i = 0;
        while ((holdsLine = reader.readLine()) != null) {
            holdsValue[i] = holdsLine;
            i++;
        }
        reader.close();
        String accountName = holdsValue[0];
        String password = holdsValue[1];
        double balance = Double.parseDouble(holdsValue[2]);
        casinoAccountManager.addToDatabase(new CasinoAccount(accountName, password, balance));
    }

    public void calvinAccWriteNewBalance(CasinoAccount account) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("CasinoAccountLog.txt"));

        String accountName = String.valueOf(account.getAccountName());
        String password = String.valueOf(account.getPassword());
        String balance = String.valueOf(account.getBalance());

        writer.write(accountName);
        writer.write("\n" + password);
        writer.write("\n" + balance);
        writer.close();

        console.println("[NOTICE] Updated FILE with new balance");

    }

    public void writeToFile(CasinoAccount account) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("CasinoAccountLog.txt", true));
        String accountName = String.valueOf(account.getAccountName());
        String password = String.valueOf(account.getPassword());
        String balance = String.valueOf(account.getBalance());
        writer.write(String.format("%s,%s,%s\n", accountName, password, balance));
        console.println("Account has been written to file");
        writer.close();
    }

    public void writeToFileTest(CasinoAccount account) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("CasinoAccountLog.txt"));
        String accountName = String.valueOf(account.getAccountName());
        String password = String.valueOf(account.getPassword());
        String balance = String.valueOf(account.getBalance());
        writer.write(String.format("%s,%s,%s\n", accountName, password, balance));
        console.println("Account has been written to file");
        writer.close();
    }

    public void writeNewBalance(CasinoAccount activeAccount) throws IOException { // TODO this method is overwriting CasinoAccountLog.txt
        BufferedReader reader = new BufferedReader(new FileReader("CasinoAccountLog.txt"));

        System.out.println("[NOTICE] I am inside the WRITE NEW BALANCE method");

        String s;
        while ((s = reader.readLine()) != null) {

            System.out.println("[NOTICE] I am inside the WHILE loop");
            System.out.println(s); //TODO never printed out

            String[] accountInfo = s.split(","); //TODO turns line into array by separating commas
            System.out.println(Arrays.toString(accountInfo));

            if (accountInfo[0].equals(String.valueOf(activeAccount.getAccountName()))
                    && accountInfo[1].equals(String.valueOf(activeAccount.getPassword()))) {

                System.out.println("[NOTICE] I am inside the IF statement"); //TODO never printed out

                accountInfo[2] = String.valueOf(activeAccount.getBalance());
                BufferedWriter writer = new BufferedWriter(new FileWriter("CasinoAccountLog.txt"));

                System.out.println("[NOTICE] Saved new balance, about to write to file");

                writer.write(String.format("%s,%s,%s\n", accountInfo[0], accountInfo[1], accountInfo[2]));
                writer.close();
                break;
            }
        }
        reader.close();
/*
Calvin,Tran,1000
Rubber,Ducky,2000
Bravo,Casino,3000
 */
    }

    public void readFileAndStore(CasinoAccountManager casinoAccountManager) throws IOException {
        String accountFile = "CasinoAccountLog.txt";
        BufferedReader br = new BufferedReader(new FileReader(accountFile));
        String s;
        while ((s = br.readLine()) != null) {
            String[] accountInfo = s.split(",");
            String accountName = String.valueOf(accountInfo[0]);
            String password = String.valueOf(accountInfo[1]);
            double balance = Double.parseDouble(accountInfo[2]);
            casinoAccountManager.addToDatabase(new CasinoAccount(accountName, password, balance));
        }
        br.close();
    }

    public void writeAllAccsToFile(AccountDatabase database) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("CasinoAccountLog.txt"));

        for(int i = 0; i < database.getSize(); i++) {
            String accountName = String.valueOf(database.getCasinoAccountByIndex(i).getAccountName());
            String password = String.valueOf(database.getCasinoAccountByIndex(i).getPassword());
            String balance = String.valueOf(database.getCasinoAccountByIndex(i).getBalance());
            writer.write(String.format("%s,%s,%s\n", accountName, password, balance));
        }

        console.println("Database has been re-written to file");
        writer.close();
    }

}
