package com.mapsa.exercise.seriesc.testsJafarian;

import com.mapsa.exercise.seriesc.m.DigitsSumRootJafarian;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitsSumRootJafarianTest {

    @Test
    public void test1() {
        assertEquals(6, DigitsSumRootJafarian.digitRoot(123L));
    }

    @Test
    public void test2() {
        assertEquals(9, DigitsSumRootJafarian.digitRoot(999888777L));
    }

    @Test
    public void test3() {
        assertEquals(9, DigitsSumRootJafarian.digitRoot(1238763636555555555L));
    }


}
