package com.mapsa.exercise.seriesa.i;

public class FactorChainJafarian {
    public static boolean factorChain(int[] arr) {
        boolean check = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] % arr[i] == 0)
                check = true;

            else return false;

        }

        return check;

    }
}