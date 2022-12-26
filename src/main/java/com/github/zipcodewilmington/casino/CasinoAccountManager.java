package com.github.zipcodewilmington.casino;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leon on 7/21/2020.
 * `ArcadeAccountManager` stores, manages, and retrieves `ArcadeAccount` objects
 * it is advised that every instruction in this class is logged
 */
public class CasinoAccountManager {
    ArrayList<CasinoAccount> casinoAccounts;

    public CasinoAccountManager() {
        this.casinoAccounts = new ArrayList<>();
    }

    /**
     * @param accountName     name of account to be returned
     * @param accountPassword password of account to be returned
     * @return `ArcadeAccount` with specified `accountName` and `accountPassword`
     */


    public CasinoAccount getAccount(String accountName, String accountPassword) {
//        String currentMethodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        String currentClassName = getClass().getName();
//        String errorMessage = "Method with name [ %s ], defined in class with name [ %s ] has  not yet been implemented";
//        throw new RuntimeException(String.format(errorMessage, currentMethodName, currentClassName));
        for(int i=0; i<casinoAccounts.size(); i++) {
            if (casinoAccounts.get(i).getUsername().equals(accountName)
                    && casinoAccounts.get(i).getPassword().equals(accountPassword)){
                return casinoAccounts.get(i);
            }
        }
        return null;
    }

    /**
     * logs & creates a new `ArcadeAccount`
     *Create an account and add to the arrayList
     * @param accountName     name of account to be created
     * @param accountPassword password of account to be created
     * @return new instance of `ArcadeAccount` with specified `accountName` and `accountPassword`
     */
    public CasinoAccount createAccount(String accountName, String accountPassword) {
//        String currentMethodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        String currentClassName = getClass().getName();
//        String errorMessage = "Method with name [ %s ], defined in class with name [ %s ] has  not yet been implemented";
//        throw new RuntimeException(String.format(errorMessage, currentMethodName, currentClassName));
        CasinoAccount casinoAccount = new CasinoAccount(accountName, accountPassword);
        //casinoAccounts.add(casinoAccount);
        return casinoAccount;
        
    }

    /**
     * logs & registers a new `ArcadeAccount` to `this.getArcadeAccountList()`
     *
     * @param casinoAccount the arcadeAccount to be added to `this.getArcadeAccountList()`
     */

    public void registerAccount(CasinoAccount casinoAccount) {
//        String currentMethodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        String currentClassName = getClass().getName();
//        String errorMessage = "Method with name [ %s ], defined in class with name [ %s ] has  not yet been implemented";
//        throw new RuntimeException(String.format(errorMessage, currentMethodName, currentClassName));

        casinoAccounts.add(casinoAccount);
           // CasinoAccount newUser = new CasinoAccount(newUserName, newPassword);


    }
}
