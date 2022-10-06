package com.mapsa.exercise.seriesc.testsJafarian;

import com.mapsa.exercise.seriesc.b.NumberedCardsJafarian;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberedCardsJafarianTest {

    @Test
    public void test1() {
        assertTrue(NumberedCardsJafarian.numberedCards(new int[] {2,5,2,6,9 },new int[] {3,7,3,1,2 } ));
    }

    @Test
    public void test2() {
        assertFalse(NumberedCardsJafarian.numberedCards(new int[] {1,2,3,4,5 },new int[] {9,8,7,6,5} ));
    }

    @Test
    public void test3() {
        assertFalse(NumberedCardsJafarian.numberedCards(new int[] {4,3,4,4,5},new int[] {3,2,5,4,1 } ));
    }


}
