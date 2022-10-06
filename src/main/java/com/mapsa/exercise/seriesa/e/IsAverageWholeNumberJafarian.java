package com.mapsa.exercise.seriesa.e;

public class IsAverageWholeNumberJafarian {
    public static boolean isAvgWhole(int[] arr) {
        int sum = 0;
        for (int number : arr) {
            sum += number;

        }
        double average = sum % arr.length;

        if (average == 0)
            return true;

        return false;

    }
}