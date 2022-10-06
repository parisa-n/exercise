package com.mapsa.exercise.seriesc.testsJafarian;

import com.mapsa.exercise.seriesc.h.InputFactorialJafarian;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class InputFactorialJafarianTest {

    @Test
    public void test1() {
        assertTrue(InputFactorialJafarian.checkNumberIsFactorial(24));
    }

    @Test
    public void test2() {
        assertTrue(InputFactorialJafarian.checkNumberIsFactorial(2));
    }

    @Test
    public void test3() {
        assertFalse(InputFactorialJafarian.checkNumberIsFactorial(27));
    }

    @Test
    public void test4() {
        assertFalse(InputFactorialJafarian.checkNumberIsFactorial(29));
    }

    @Test
    public void test5() {
        assertTrue(InputFactorialJafarian.checkNumberIsFactorial(120));
    }







}
