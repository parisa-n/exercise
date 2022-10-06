package com.mapsa.exercise.seriesc.testsJafarian;

import com.mapsa.exercise.seriesc.d.ValidatePinJafarian;
import com.mapsa.exercise.seriesc.j.ProductOfRemainingElementsJafarian;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProductOfRemainingElementsJafarianTest {

    @Test
    public void test1() {
        assertTrue(ProductOfRemainingElementsJafarian.canPartition(new int[]{2,8,4,1}));
    }

    @Test
    public void test2() {
        assertFalse(ProductOfRemainingElementsJafarian.canPartition(new int[]{-1,-10,1,-2,20}));
    }


    @Test
    public void test3() {
        assertTrue(ProductOfRemainingElementsJafarian.canPartition(new int[]{-1,-20,5,-1,-2,2}));
    }






}
