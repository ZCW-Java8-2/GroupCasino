package com.github.zipcodewilmington.casino.casinoaccount;

public class CasinoAccountManager {

    public static AccountDatabase database = new AccountDatabase();

    public CasinoAccount createAccount(String username, String password, double balance) {
        return new CasinoAccount(username, password, balance);
//        //TODO Actually creates the account with input recieved
    }

    public void addToDatabase(CasinoAccount casinoAccount) {

        database.addCasinoAccount(casinoAccount);
    }

    public CasinoAccount getAccount(String accountName, String accountPassword) {
        //TODO getAccount for Validation
        return database.getCasinoAccount(accountName, accountPassword);
    }


}
