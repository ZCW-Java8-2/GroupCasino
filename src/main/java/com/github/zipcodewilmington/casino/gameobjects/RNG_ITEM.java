package com.github.zipcodewilmington.casino.gameobjects;

import java.util.Random;

public class RNG_ITEM {
    private int rangeOfRNG;

    public RNG_ITEM (int rangeofRNG) {
        this.rangeOfRNG = rangeofRNG;
    }

    public int runRNG() {
        Random rand = new Random();
        return rand.nextInt((this.rangeOfRNG)) + 1;
    }
}
