package com.mapsa.exercise.seriesc.testsJafarian;

import com.mapsa.exercise.seriesc.f.ConsecutiveNumbersJafarian;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ConsecutiveNumbersJafarianTest {

    @Test
    public void test1() {
        assertTrue(ConsecutiveNumbersJafarian.consecutiveNumbers(new int[] {5,1,4,3,2 } ));
    }

    @Test
    public void test2() {
        assertFalse(ConsecutiveNumbersJafarian.consecutiveNumbers(new int[] {5,1,4,3,2,8 } ));
    }

    @Test
    public void test3() {
        assertFalse(ConsecutiveNumbersJafarian.consecutiveNumbers(new int[] {5,6,7,8,9,9} ));
    }


}
