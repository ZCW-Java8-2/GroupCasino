package com.github.zipcodewilmington.casino.games;


import java.util.Random;

public class RandomNumberGenerator {

    public static int randomizedNumber(int upperBound) {
        Random randomNumber = new Random();
        int rng = randomNumber.nextInt(upperBound);
        return rng;
    }
}

