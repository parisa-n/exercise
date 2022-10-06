package com.mapsa.exercise.seriesc.testsJafarian;

import com.mapsa.exercise.seriesc.k.HarshadNumberJafarian;
import com.mapsa.exercise.seriesc.m.DigitsSumRootJafarian;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class HarshadNumberJafarianTest {

    @Test
    public void test1() {
        assertFalse( HarshadNumberJafarian.isHarshad(75));
    }

    @Test
    public void test2() {
        assertTrue(HarshadNumberJafarian.isHarshad(171));

    }

    @Test
    public void test3() {
        assertTrue(HarshadNumberJafarian.isHarshad(481));

    }

    @Test
    public void test4() {
        assertFalse(HarshadNumberJafarian.isHarshad(89));

    }

    @Test
    public void test5() {
        assertTrue(HarshadNumberJafarian.isHarshad(516));

    }

    @Test
    public void test6() {
        assertTrue(HarshadNumberJafarian.isHarshad(200));

    }




}
