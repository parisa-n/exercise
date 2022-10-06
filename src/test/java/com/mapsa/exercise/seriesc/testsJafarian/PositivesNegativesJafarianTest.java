package com.mapsa.exercise.seriesc.testsJafarian;

import com.mapsa.exercise.seriesc.l.PositivesNegativesJafarian;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PositivesNegativesJafarianTest {

    @Test
    public void test1() {
        assertTrue(PositivesNegativesJafarian.alternateSign(new int[] {3,-2,5,-5,2,-8}));
    }

    @Test
    public void test2() {
        assertTrue(PositivesNegativesJafarian.alternateSign(new int[] {-6,1,-1,4,-3}));
    }

    @Test
    public void test3() {

        assertFalse(PositivesNegativesJafarian.alternateSign(new int[] {4,4,-2,3,-6,10}));
    }






}
