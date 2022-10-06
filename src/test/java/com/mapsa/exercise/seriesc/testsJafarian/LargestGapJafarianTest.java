package com.mapsa.exercise.seriesc.testsJafarian;

import com.mapsa.exercise.seriesc.c.LargestGapJafarian;
import org.junit.Test;

import static org.junit.Assert.*;

public class LargestGapJafarianTest {

    @Test
    public void test1() {
        assertEquals(11, LargestGapJafarian.largestGap(new int[]{9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5}));
    }

    @Test
    public void test2() {
        assertEquals(4, LargestGapJafarian.largestGap(new int[]{14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7}));
    }

    @Test
    public void test3() {
        assertEquals(2, LargestGapJafarian.largestGap(new int[]{13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9}));
    }


}
