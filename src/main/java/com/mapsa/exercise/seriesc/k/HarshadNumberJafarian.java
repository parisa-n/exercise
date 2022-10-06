package com.mapsa.exercise.seriesc.k;

import java.util.Arrays;

public class HarshadNumberJafarian {
    private int sum = 0;


    public static boolean isHarshad(int number) {
        HarshadNumberJafarian harshadNumberJafarian = new HarshadNumberJafarian();

        if (number % harshadNumberJafarian.sumRoot(number) == 0)
            return true;

        return false;


    }

    private int sumRoot(int number) {
        int n = (int) (number - ((number / 10) * 10));
        sum += n;

        if (number < 10) {
            return sum;
        }

        return sumRoot(number / 10);
    }


}
