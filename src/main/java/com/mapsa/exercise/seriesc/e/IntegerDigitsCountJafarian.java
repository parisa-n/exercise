package com.mapsa.exercise.seriesc.e;

public class IntegerDigitsCountJafarian {
    int count=0;

    public static int integerDigitsCount(int number) {
        IntegerDigitsCountJafarian integerDigitsCount = new IntegerDigitsCountJafarian();
        return integerDigitsCount.numberDigits(Math.abs(number));

    }

    private int numberDigits(int num) {
        if (num==0)
            return 1;
            if(num!=0) {
                count++;
                numberDigits(num/10);
            }
            return count;
        }

}
