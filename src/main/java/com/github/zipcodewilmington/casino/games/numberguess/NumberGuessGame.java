package com.github.zipcodewilmington.casino.games.numberguess;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by leon on 7/21/2020 NumberGuessGame.
 */
public class NumberGuessGame implements GameInterface {
    private int bet;
    private int start=1;
    private int end=50;
    NumberGuessPlayer newPlayer;
    Scanner scanner =new Scanner(System.in);

    public NumberGuessGame() {}

    public int getBet() {
        return bet;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public int getStart() {return start;}

    public void setStart(int start) {this.start = start;}

    public int getEnd() {return end;}

    public void setEnd(int end) {this.end = end;}



    public String numberCompare(){

        System.out.println("Enter an integer from 1 to 100. You have 5 trial.");
        int userNumber= scanner.nextInt();
        int randonNumber=(int)(Math.random()*50)+1;
        for(int i=0; i<5; i++){
            if(userNumber==randonNumber){
                newPlayer.setBalance(newPlayer.getBalance()+this.bet*100);
                return ("You won: "+this.bet*100+". The random number is "+ randonNumber );


            }else if(userNumber>randonNumber){
                this.start= start;
                this.end = userNumber;
                System.out.println("Trial "+(i+1)+": Too large. Enter a number from "+this.start+" to "+this.end);
                userNumber=scanner.nextInt();
            }else {
                this.start= userNumber;
                this.end = end;
                System.out.println("Trial "+(i+1)+": Too small. Enter a number from " + this.start + " to " + this.end);
                userNumber=scanner.nextInt();
            }
        }
        return "Your run out of tried. The random number is "+ randonNumber;
      }

    public void add(PlayerInterface player) {
        newPlayer = new NumberGuessPlayer(player.getArcadeAccount());
    }

    @Override
    public void remove(PlayerInterface player) {}
    @Override
    public Boolean checkWinner() {
        return null;
    }
    @Override
    public void run() {
        boolean exit = false;

        int input;
        while (!exit) {
            System.out.println("Your current balance is $" + newPlayer.getBalance()
                    + ". Enter amount for your bet: ");
            bet = scanner.nextInt();

            //make sure player's bet is less than his/her balance
            while (bet > newPlayer.getBalance()) {
                System.out.println("Your current balance is: " + newPlayer.getBalance() +
                        "\nRe-enter a value amount: ");
                bet = scanner.nextInt();
            }
            newPlayer.makeBet(bet);

            System.out.println(numberCompare());

            //Check if the player's balance is greater than 0;
            if (newPlayer.getBalance() <= 0) {
                System.out.println("Your current balance is $0. See you next time.\n");
                break;
            }
            System.out.println("Your remaining balance is $" + newPlayer.getBalance() +
                    "\nPlay again? 1 for YES || 2 for NO.");
            this.start=1;
            this.end =50;
            input = scanner.nextInt();
            if (input == 2) break;
        }
    }
}