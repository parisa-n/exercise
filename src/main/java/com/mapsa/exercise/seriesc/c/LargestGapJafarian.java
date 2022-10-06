package com.mapsa.exercise.seriesc.c;

import java.util.Arrays;

public class LargestGapJafarian {

    public static int largestGap(int[] num) {
        int largestGap = 0;
        Arrays.sort(num);
        for (int i = num.length - 1; i > 0; i--) {
            int menus = num[i] - num[i - 1];
            if (menus> largestGap)
                largestGap = menus;
        }

        return largestGap;

    }
}
