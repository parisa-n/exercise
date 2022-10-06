package com.mapsa.exercise.seriesc.testsJafarian;

import com.mapsa.exercise.seriesc.a.SevenBoomJafarian;
import org.junit.Test;

import static org.junit.Assert.*;

public class SevenBoomJafarianTest {

    @Test
    public void test1() {
        assertEquals("Boom!", SevenBoomJafarian.sevenBoom(new int[]{1, 2, 3, 4, 5, 6, 7}));
    }

    @Test
    public void test2() {
        assertEquals("there is no 7 in the array", SevenBoomJafarian.sevenBoom(new int[]{8, 6, 33, 100}));
    }

    @Test
    public void test3() {
        assertEquals("Boom!", SevenBoomJafarian.sevenBoom(new int[]{2, 55, 60, 97, 86}));
    }


}
