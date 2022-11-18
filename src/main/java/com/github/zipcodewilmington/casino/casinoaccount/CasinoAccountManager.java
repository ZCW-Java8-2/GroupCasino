package com.github.zipcodewilmington.casino.casinoaccount;

public class CasinoAccountManager {

    public static AccountDatabase database = new AccountDatabase();

    public CasinoAccount getAccount(String accountName, String accountPassword) {
        //TODO getAccount for Validation
        System.out.println("Inside database is " + database.getCasinoAccount(accountName, accountPassword));
        return database.getCasinoAccount(accountName, accountPassword);
//        String currentMethodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        String currentClassName = getClass().getName();
//        String errorMessage = "Method with name [ %s ], defined in class with name [ %s ] has  not yet been implemented";
//        throw new RuntimeException(String.format(errorMessage, currentMethodName, currentClassName));
    }

    /**
     * logs & creates a new `ArcadeAccount`
     *
     * //@param accountName     name of account to be created
     * //@param accountPassword password of account to be created
     * //@return new instance of `ArcadeAccount` with specified `accountName` and `accountPassword`
     */
    public CasinoAccount createAccount(String username, String password, double balance) {
        return new CasinoAccount(username, password, balance);
//        //TODO Actually creates the account with input recieved
//        String currentMethodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        String currentClassName = getClass().getName();
//        String errorMessage = "Method with name [ %s ], defined in class with name [ %s ] has  not yet been implemented";
//        throw new RuntimeException(String.format(errorMessage, currentMethodName, currentClassName));
    }

    /**
     * logs & registers a new `ArcadeAccount` to `this.getArcadeAccountList()`
     *
     * @param casinoAccount the arcadeAccount to be added to `this.getArcadeAccountList()`
     */

    public void addToDatabase(CasinoAccount casinoAccount) { //TODO SAVE TO DATABASE (ARRAYLIST<CASINOACCOUNTS>)
        //TODO Rename as "AddtoDataBase"

        database.addCasinoAccount(casinoAccount);
//        String currentMethodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        String currentClassName = getClass().getName();
//
//        //TODO ERROR MESSAGE
//        String errorMessage = "Method with name [ %s ], defined in class with name [ %s ] has  not yet been implemented";
//        throw new RuntimeException(String.format(errorMessage, currentMethodName, currentClassName));
    }


}
