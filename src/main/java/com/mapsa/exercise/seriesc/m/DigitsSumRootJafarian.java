package com.mapsa.exercise.seriesc.m;

public class DigitsSumRootJafarian {
    private int sum = 0;


    public static int digitRoot(long number) {

        DigitsSumRootJafarian digitsSumRootJafarian = new DigitsSumRootJafarian();
        return digitsSumRootJafarian.sumRoot(number);
    }

    private int sumRoot(long number) {
        int n = (int) (number - ((number / 10) * 10));
        sum += n;
        if (number < 10 && sum > 10) {
            number = sum*100;
            sum = 0;
        } else if (number < 10 && sum < 10)
            return sum;

        return  sumRoot(number / 10);
    }


}
