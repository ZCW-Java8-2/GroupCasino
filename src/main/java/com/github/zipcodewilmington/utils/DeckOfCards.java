//package com.github.zipcodewilmington.utils;
//
//import com.github.zipcodewilmington.Cards;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//public class DeckOfCards extends Cards {
//    static List<String> cardList = new ArrayList<>(List.of(cards));
//
//    static Cards[] elementArray = (Cards[]) cardList.toArray();
//    static List<Cards> transfer = new ArrayList<>(List.of(elementArray));
//
//    Cards[] card = new Cards[52];
//    static List<Cards> listCard = new ArrayList<Cards>();
//    static List<String> shuffledCard = new ArrayList<>();
//    String[] storage;
//
//    public Cards() {
//
//    }
//
//    public static Cards[] takeCardFromDeck(int dealtCard) {
//        Cards[] card = new Cards[dealtCard];
//        for (int i = 0; i < dealtCard; i++) {
//            Random ran = new Random();
//            int random = ran.nextInt(elementArray.length);
//            card[i] = transfer.get(random);
//            cardList.remove(random);
//        }
//        return card;
//    }
//    //    public String[] takeCardFaceDown(int dealtCard) {
////        String[] card = new String[dealtCard];
////        String[] storage = new String[dealtCard];
////        String[] faceDown = new String[dealtCard];
////        for (int i = 0; i < dealtCard; i++) {
////            Random ran = new Random();
////            int random = ran.nextInt(cardList.size());
////            card[i] = cardList.get(random);
////            cardList.remove(random);
////        }
////        for (int i = 0; i < dealtCard; i++) {
////            faceDown[i] = "_";
////        }
////        storage = card;
////        this.storage = storage;
////        return card = faceDown;
////    }
//////    public String[] takeCardFaceUpFaceDown(int faceUp, int faceDown) {
//////        String[] faceDownCards = takeCardFaceDown(faceUp);
//////        String[] faceUpCards = takeCardFromDeck(faceDown);
//////        List<String> hand = new ArrayList<>();
//////        for (int i = 0; i < faceDownCards.length; i++) {
//////            hand.add(faceDownCards[i]);
//////        }
//////        for (int i = 0; i < faceUpCards.length; i++) {
//////            hand.add(faceUpCards[i]);
//////        }
//////        String[] result = hand.toArray(new String[0]);
//////        return result;
//////    }
////    public String flipCard(int cardIndex) {
////        String card = "";
////        card = storage[cardIndex];
////        storage[cardIndex] = "_";
////        return card;
////    }
//    public static String[] getCard () {
//        return cards;
//    }
//    public static List<String> getShuffledCard () {
//        return shuffledCard;
//    }
//}
////}
//}
