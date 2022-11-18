package com.github.zipcodewilmington.casino.games.ThreeCup;

import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.games.GameTypes.RandomGame;

import java.util.Random;
import java.util.Scanner;

public class ThreeCupGame extends RandomGame {



public ThreeCupGame(){
    super();
}

    public int numGenerator() {
        Random number = new Random();

        return number.nextInt(3)+ 1;

    }

    public String checkNumber() {
        Scanner guess = new Scanner(System.in);
        System.out.println("Guess which cup the ball is in");
        int cup = guess.nextInt();

            if (cup != numGenerator()) {
                return "You picked the wrong cup";
            } else {
                return "You picked the right cup";
            }

    }
    public void add(PlayerInterface player){

    }

    public void remove(PlayerInterface player){

    }

    public Boolean checkWinner(){
        return null;
    }

    public void run(){
        numGenerator();
        checkNumber();
    }
}




