package com.mapsa.exercise.seriesc.testsJafarian;

import com.mapsa.exercise.seriesc.a.SevenBoomJafarian;
import com.mapsa.exercise.seriesc.k.HarshadNumberJafarian;
import com.mapsa.exercise.seriesc.o.UnmixMyStrings;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class UnmixMyStringsTest {


    @Test
    public void test1() {
        assertEquals("214365", UnmixMyStrings.unmix("123456"));
    }

    @Test
    public void test2() {
        assertEquals("This is a mixed up string.", UnmixMyStrings.unmix("hTsii  s aimex dpus rtni.g"));
    }

    @Test
    public void test3() {
        assertEquals("abcde", UnmixMyStrings.unmix("badce"));
    }




}
