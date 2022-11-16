package com.github.zipcodewilmington.casino.casinoaccount;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AccountDatabase {

    private ArrayList<CasinoAccount> database;

    public AccountDatabase(ArrayList<CasinoAccount> database){
        this.database = database;
    }

    public void addCasinoAccount(CasinoAccount casinoAccount){
        database.add(casinoAccount);
    }

    public CasinoAccount getCasinoAccount(String accountName){
        for (CasinoAccount ca : database){
            if (ca.getAccountName().equals(accountName)){
                return ca;
            }
        }
        return null;
    }

    public void removeCasinoAccount(String accountName){
        database.remove(accountName);
    }


}
