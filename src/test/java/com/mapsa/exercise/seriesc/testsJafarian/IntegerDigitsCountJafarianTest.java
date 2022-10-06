package com.mapsa.exercise.seriesc.testsJafarian;

import com.mapsa.exercise.seriesc.e.IntegerDigitsCountJafarian;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerDigitsCountJafarianTest {

    @Test
    public void test1() {
        assertEquals(3, IntegerDigitsCountJafarian.integerDigitsCount(318));
    }

    @Test
    public void test2() {
        assertEquals(5, IntegerDigitsCountJafarian.integerDigitsCount(-92563));
    }

    @Test
    public void test3() {
        assertEquals(4, IntegerDigitsCountJafarian.integerDigitsCount(4666));
    }

    @Test
    public void test4() {
        assertEquals(6, IntegerDigitsCountJafarian.integerDigitsCount(-314890));
    }

    @Test
    public void test5() {
        assertEquals(6, IntegerDigitsCountJafarian.integerDigitsCount(654321));
    }

    @Test
    public void test6() {
        assertEquals(6, IntegerDigitsCountJafarian.integerDigitsCount(638476));
    }

    @Test
    public void test7() {
        assertEquals(1, IntegerDigitsCountJafarian.integerDigitsCount(0));
    }





}
