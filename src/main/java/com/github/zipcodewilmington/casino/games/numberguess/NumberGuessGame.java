package com.github.zipcodewilmington.casino.games.numberguess;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by leon on 7/21/2020 NumberGuessGame.
 */
public class NumberGuessGame {
    private int num;

    public NumberGuessGame(int num) {
        this.num = num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public int getNum(){
        return this.num;
    }


    public int getRandomNumber(){

        int randomNumber = (int)(Math.random()*10)+1;
        return randomNumber;
    }
    public Boolean numberCompare(){
        String result="";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 10: ");
        num = in.nextInt();

        return num==getRandomNumber();
//
    }
    public String resultToString(){
        NumberGuessGame numGuess = new NumberGuessGame(num);
        String result ="num";
        if(numGuess.numberCompare()){
            return result ="You win, our number is "+ "num";
        }else{
            return result+=("You lose. My number is "+ getRandomNumber()+
                    "\nYour number is "+ num);

        }
    }
}