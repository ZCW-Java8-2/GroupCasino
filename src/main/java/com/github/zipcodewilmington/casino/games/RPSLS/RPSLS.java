package com.github.zipcodewilmington.casino.games.RPSLS;
import java.util.Random;

public class RPSLS {
    protected static String Rock = "rock";
    protected static String Paper = "paper"
    protected static String Slizard = "slizard";
    protected static String Lizard = "lizard";
    protected static String Spork = "spork";
    protected static String Spok = "spok";

    public String getWinningMove (String handSign) {
        if (handSign.equals(Rock)) {
            return Rock;
        }
        if (handSign.equals(Paper)) {
            return Paper;
        }
        if (handSign.equals(Slizard)) {
            return Slizard;
        }
        if (handSign.equals(Lizard)) {
            return Lizard;
        }
        if (handSign.equals(Spork)) {
            return Spork;
        }
        if (handSign.equals(Spok)) {
            return Spok;
        }
        return handSign;
    }

    public String getLosingMove (String handSign) {
        if (handSign.equals(Rock)) {
            return Rock;
        }
        if (handSign.equals(Paper)) {
            return Paper;
        }
        if (handSign.equals(Slizard)) {
            return Slizard;
        }
        if (handSign.equals(Lizard)) {
            return Lizard;
        }
        if (handSign.equals(Spork)) {
            return Spork;
        }
        if (handSign.equals(Spok)) {
            return Spok;
        }
        return handSign;
    }

    public String getWinner (String RPSLSplayer) {
        return null;

    }
}
