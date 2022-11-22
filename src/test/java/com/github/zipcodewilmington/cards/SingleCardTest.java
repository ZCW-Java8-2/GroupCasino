package com.github.zipcodewilmington.cards;

import com.github.zipcodewilmington.casino.gameobjects.CardDeckFaceEnum;
import com.github.zipcodewilmington.casino.gameobjects.CardDeckSuitEnum;
import com.github.zipcodewilmington.casino.gameobjects.SingleCard;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SingleCardTest {

    @Test
    public void cardTest(){
        SingleCard cardAceDiamond = new SingleCard(CardDeckSuitEnum.DIAMONDS, CardDeckFaceEnum.ACE);

        String expectedFace ="ACE";
        String expectedSuit = "DIAMOND";

        String actualFace = String.valueOf(cardAceDiamond.getFace());
        String actualSuit = String.valueOf(cardAceDiamond.getSuit());

        Assert.assertEquals(expectedFace, actualFace);
        Assert.assertEquals(expectedSuit, actualSuit);

        System.out.println(cardAceDiamond.cardValue());
    }

    @Test
    public void cardTest2(){
        SingleCard cardJackHeart = new SingleCard(CardDeckSuitEnum.HEARTS, CardDeckFaceEnum.JACK);

        String expectedFace ="JACK";
        String expectedSuit = "HEART";

        String actualFace = String.valueOf(cardJackHeart.getFace());
        String actualSuit = String.valueOf(cardJackHeart.getSuit());

        Assert.assertEquals(expectedFace, actualFace);
        Assert.assertEquals(expectedSuit, actualSuit);

        System.out.println(cardJackHeart.cardValue());
    }

    @Test
    public void getSuitTest(){
        SingleCard cardJackHeart = new SingleCard(CardDeckSuitEnum.HEARTS, CardDeckFaceEnum.JACK);

        String expected = "HEART";

        String actual = String.valueOf(cardJackHeart.getSuit());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFaceTest(){
        SingleCard cardJackHeart = new SingleCard(CardDeckSuitEnum.HEARTS, CardDeckFaceEnum.JACK);

        String expected = "JACK";

        String actual = String.valueOf(cardJackHeart.getFace());

        Assert.assertEquals(expected, actual);
    }

}