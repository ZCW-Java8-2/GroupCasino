package com.github.zipcodewilmington.casino;

public interface GamblingInterface {

    double winBet(double bet, double balance);

    double loseBet(double bet, double balance);

    void addToBalance();

    void subFromBalance();

}
