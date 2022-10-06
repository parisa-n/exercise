package com.mapsa.exercise.seriesc.testsJafarian;

import com.mapsa.exercise.seriesc.a.SevenBoomJafarian;
import com.mapsa.exercise.seriesc.i.ArraySumJafarian;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArraySumJafarianTest {

    @Test
    public void test1() {
        assertEquals(10, ArraySumJafarian.calculateArraySum(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void test2() {
        assertEquals(3, ArraySumJafarian.calculateArraySum(new int[]{1, 2}));
    }

    @Test
    public void test3() {
        assertEquals(1, ArraySumJafarian.calculateArraySum(new int[]{1}));
    }

    @Test
    public void test4() {
        assertEquals(0, ArraySumJafarian.calculateArraySum(new int[]{}));
    }


}
