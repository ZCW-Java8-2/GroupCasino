package com.github.zipcodewilmington.casino;

public interface GamblingInterface {

    void getBetAmount();

    double winBet(double bet, double balance);

    double loseBet(double bet, double balance);

    void addToBalance();

    void subFromBalance();

}
