package com.github.zipcodewilmington.casino.games.Roulette;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.games.GameTypes.RandomGame;
import com.github.zipcodewilmington.casino.games.Player.GamblerPlayer;

import javax.sound.midi.Soundbank;
import java.util.*;

public class RouletteGame extends RandomGame {
    HashMap<Integer, Integer> betMap1;
    ArrayList<Integer> blackNumbers = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 11, 13, 15, 17, 20,22,24,26, 28, 29, 31, 33, 35));
    ArrayList<Integer> redNumbers = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 12, 14, 16, 19, 21, 23, 25, 27 ,30, 32, 34, 36));
    ArrayList<Integer> greenNumbers = new ArrayList<>(Arrays.asList(0, 37));
    ArrayList<Integer> straightUp = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37));
    ArrayList<Integer> oddNumbers = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37));
    ArrayList<Integer> evenNumbers = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36));
    ArrayList<Integer> highNumbers = new ArrayList<>(Arrays.asList(19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37));
    ArrayList<Integer> lowNumbers = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18));




    int spin;
    GamblerPlayer gamblerPlayer;
    private int oddsOnBet;

    public RouletteGame(GamblerPlayer gamblerPlayer) {
        this.gamblerPlayer = gamblerPlayer;
        this.betMap1 = new HashMap<>();
        this.getClass();
    }


    public void runGame() {
        placeBet();
    }
    public void placeBet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please make a bet " + gamblerPlayer.getName());
        Integer playerBetAmt = scanner.nextInt();
        System.out.println("What would you like to bet on? ");
        System.out.println("1 Straight Bet");
        System.out.println("2 Red Numbers Bet");
        System.out.println("3 Black Numbers Bet");
        System.out.println("4 Odd Numbers Bet");
        System.out.println("5 Even Numbers Bet");
        System.out.println("6 High Numbers Bet");
        System.out.println("7 Low Numbers Bet");
        String winningsString;
        switch (oddsOnBet) {
            case 1: winningsString = "playerBetAmt * 35";
                    break;
            case 2: winningsString = "playerBetAmt * 2";
        }
        Integer playersBet = scanner.nextInt();
        betMap1.put(playersBet, playerBetAmt);
        System.out.println("Would you like to make Another bet? Y/N");
        String response = scanner.next();
        gamblerPlayer.setBalance(gamblerPlayer.getBalance() - playersBet);
        if (response.equals("Y")) {
            placeBet();
        }else {
            spinWheel();
        }

    }
    public void spinWheel() {
        Random random = new Random();
        this.spin = random.nextInt(38);
        System.out.println("Wheels Spinning");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("The Winning Number is " + spin);
    }
    public void getWinner() {
        if (betMap1.containsKey(spin)) {
            System.out.println("Winner Winner Chicken Dinner");
            gamblerPlayer.setBalance(gamblerPlayer.getBalance() + betMap1.get(spin) * 35);
        }else {
            System.out.println("You Lose");
        }

    }
    public void restartPrompt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to play again? Y/N ");
        String response = scanner.next();
        if (response == "Y") {
            placeBet();
        }else {
            // calls main menu method
        }
    }
}

