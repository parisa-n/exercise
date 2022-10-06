package com.mapsa.exercise.seriesc.i;

public class ArraySumJafarian {


    public static int calculateArraySum(int[] array) {
      return findSum(array,array.length);
    }

    static int findSum(int[] array, int length)
    {
        if (length <= 0)
            return 0;
        return (findSum(array, length - 1) + array[length - 1]);
    }




}
