package com.github.zipcodewilmington.casino.casinoaccount;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AccountDatabase {

    private ArrayList<CasinoAccount> database = new ArrayList<>();

    public void addCasinoAccount(CasinoAccount casinoAccount){
        database.add(casinoAccount);
    }

    public void removeCasinoAccount(CasinoAccount casinoAccount){ database.remove(casinoAccount); }

    public int getSize() {
        return database.size();
    }

    public CasinoAccount getCasinoAccount(String accountName){
        for (CasinoAccount ca : database){
            if (ca.getAccountName().equals(accountName)){
                return ca;
            }
        }
        return null;
    }

    public CasinoAccount getCasinoAccount(String accountName, String accountPassword){
        for (CasinoAccount ca : database){
            if (ca.getAccountName().equals(accountName)
                    && ca.getPassword().equals(accountPassword)){
                return ca;
            }
        }
        return null;
    }


}
