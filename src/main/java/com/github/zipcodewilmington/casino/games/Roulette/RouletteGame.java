package com.github.zipcodewilmington.casino.games.Roulette;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.games.GameTypes.RandomGame;
import com.github.zipcodewilmington.casino.games.Player.GamblerPlayer;

import java.util.*;

public class RouletteGame extends RandomGame {
    HashMap<Integer, Integer> betMap1;
    ArrayList<Integer> blackNumbers = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 11, 13, 15, 17, 20,22,24,26, 28, 29, 31, 33, 35));
    ArrayList<Integer> redNumbers = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 12, 14, 16, 19, 21, 23, 25, 27 ,30, 32, 34, 36));
    ArrayList<Integer> greenNumbers = new ArrayList<>(Arrays.asList(0, 37));
    int spin;
    GamblerPlayer gamblerPlayer;

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
        Integer player1BetAmt = scanner.nextInt();
        System.out.println("what would like to bet on? ");
        Integer player1bet = scanner.nextInt();
        betMap1.put(player1bet, player1BetAmt);
        System.out.println("Would you like to make Another bet? Y/N");
        String response = scanner.next();
        gamblerPlayer.setBalance(gamblerPlayer.getBalance() - player1bet);
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
}

