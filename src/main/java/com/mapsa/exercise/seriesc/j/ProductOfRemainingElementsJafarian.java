package com.mapsa.exercise.seriesc.j;

import java.util.Arrays;

public class ProductOfRemainingElementsJafarian {


    public static boolean canPartition(int[] array) {

        Arrays.sort(array);
        int multiOne = 1;
        int multiTwo = 1;

        for (int i = 0; i < array.length - 1; i++) {
            multiOne *= array[i];

        }

        for (int i = array.length - 1; i > 0; i--) {
            multiTwo *= array[i];

        }

        if (multiOne == array[array.length - 1] || multiTwo == array[0])
            return true;

        return false;


    }


}
