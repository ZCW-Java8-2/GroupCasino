package com.github.zipcodewilmington.cards;

import com.github.zipcodewilmington.casino.gameobjects.Card;
import com.github.zipcodewilmington.casino.gameobjects.CardDeckFaceEnum;
import com.github.zipcodewilmington.casino.gameobjects.CardDeckSuitEnum;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CardTest {

    @Test
    public void cardTest(){
        Card cardAceDiamond = new Card(CardDeckSuitEnum.DIAMOND, CardDeckFaceEnum.ACE);

        String expectedFace ="ACE";
        String expectedSuit = "DIAMOND";

        String actualFace = String.valueOf(cardAceDiamond.getFace());
        String actualSuit = String.valueOf(cardAceDiamond.getSuit());

        Assert.assertEquals(expectedFace, actualFace);
        Assert.assertEquals(expectedSuit, actualSuit);
    }

}