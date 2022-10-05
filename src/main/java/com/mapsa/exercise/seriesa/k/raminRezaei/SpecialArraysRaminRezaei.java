package com.mapsa.exercise.seriesa.k.raminRezaei;

public class SpecialArraysRaminRezaei {
    public static boolean isSpecialArray(int[] arr) {
        //an array is special
        // odd index contains odd number
        // even index contains even number
        for (int i = 0; i < arr.length; i++) {
            if ((i % 2 == 0 && arr[i] % 2 != 0) || (i % 2 != 0 && arr[i] % 2 == 0)) {
                return false;
            }


        }
        return true;

    }
}