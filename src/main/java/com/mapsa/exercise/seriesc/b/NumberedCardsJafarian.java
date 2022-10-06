package com.mapsa.exercise.seriesc.b;

import java.util.Arrays;

public class NumberedCardsJafarian {

    public static boolean numberedCards(int[] num1, int[] num2) {
        Arrays.sort(num1);
        Arrays.sort(num2);
        String max1 = String.valueOf(num1[num1.length - 1]) + String.valueOf(num1[num1.length - 2]);
        String max2 = String.valueOf(num2[num2.length - 1]) + String.valueOf(num2[num2.length - 2]);

        if (Integer.valueOf(max1) > Integer.valueOf(max2))
            return true;


        return false;

    }
}
