package com.github.zipcodewilmington.casino.games.numberguess;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by leon on 7/21/2020 NumberGuessGame.
 */
public class NumberGuessGame implements GameInterface {
    private int num;

    public NumberGuessGame() {
        this.num = (int)(Math.random()*10)+1;
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
//    public String resultToString(){
//
//        NumberGuessGame numGuess =  new NumberGuessGame();
//
//        String result="";
//        if(numberCompare()){
//            return result+=("You win, our number is "+ num);
//        }else{
//            return result+=("You lose. My number is "+ getRandomNumber()+
//                    "\nYour number is "+ num);
//        }
//    }

    public void add(PlayerInterface player) {

    }

    @Override
    public void remove(PlayerInterface player) {

    }
    @Override
    public Boolean checkWinner() {
        return null;
    }
    @Override
    public void run() {
       int numbers = getRandomNumber();
        if(numberCompare()){
            System.out.print("\nYou won! Our number is "+numbers);
        }else{
            System.out.println("You lost! My number is "
                    + numbers+", but you guess "+ num+"\n");
        };

    }

}