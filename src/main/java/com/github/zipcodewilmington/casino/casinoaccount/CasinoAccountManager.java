package com.github.zipcodewilmington.casino.casinoaccount;

import com.github.zipcodewilmington.casino.casinoaccount.CasinoAccount;

/**
 * Created by leon on 7/21/2020.
 * `ArcadeAccountManager` stores, manages, and retrieves `ArcadeAccount` objects
 * it is advised that every instruction in this class is logged
 */
public class CasinoAccountManager {
    /**
     * @param accountName     name of account to be returned
     * @param accountPassword password of account to be returned
     * @return `ArcadeAccount` with specified `accountName` and `accountPassword`
     */

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

    public void registerAccount(CasinoAccount casinoAccount) { //TODO SAVE TO DATABASE (ARRAYLIST<CASINOACCOUNTS>)
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
