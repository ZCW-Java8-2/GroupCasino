package com.github.zipcodewilmington;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cards {
    static String[] cards = new String[]{"♠ A", "♠ 2", "♠ 3", "♠ 4", "♠ 5", "♠ 6", "♠ 7", "♠ 8", "♠ 9", "♠ 10", "♠ J", "♠ Q", "♠ K",
            "♣ A", "♣ 2", "♣ 3", "♣ 4", "♣ 5", "♣ 6", "♣ 7", "♣ 8", "♣ 9", "♣ 10", "♣ J", "♣ Q", "♣ K",
            "♥ A", "♥ 2", "♥ 3", "♥ 4", "♥ 5", "♥ 6", "♥ 7", "♥ 8", "♥ 9", "♥ 10", "♥ J", "♥ Q", "♥ K",
            "♦ A", "♦ 2", "♦ 3", "♦ 4", "♦ 5", "♦ 6", "♦ 7", "♦ 8", "♦ 9", "♦ 10", "♦ J", "♦ Q", "♦ K"};
    static List<String> cardList = new ArrayList<>(List.of(cards));
    static List<String> shuffledCard = new ArrayList<>();
    static String dealtCard;

    public Cards(){

    }
    public static String[] takeCardFromDeck(int dealtCard) {
        String[] card = new String[dealtCard];
        for (int i = 0; i < dealtCard; i++) {
            Random ran = new Random();
            int random = ran.nextInt(cardList.size());
            card[i] = cardList.get(random);
            cardList.remove(random);
        }
        return card;
    }
    public

    public static String[] getCard() {
        return cards;
    }
    public static List<String> getShuffledCard() {
        return shuffledCard;
    }
}
