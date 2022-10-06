package com.mapsa.exercise.seriesc.testsJafarian;

import com.mapsa.exercise.seriesc.m.DigitsSumRootJafarian;
import com.mapsa.exercise.seriesc.n.HowManyPrimeNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HowManyPrimeNumberTest {

    @Test
    public void test1() {
        assertEquals(4, HowManyPrimeNumber.primeNumbers(10));
    }

    @Test
    public void test2() {
        assertEquals(8, HowManyPrimeNumber.primeNumbers(20));
    }

    @Test
    public void test3() {
        assertEquals(10, HowManyPrimeNumber.primeNumbers(30));
    }


}
