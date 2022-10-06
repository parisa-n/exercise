package com.mapsa.exercise.seriesc.l;

import java.util.Arrays;

public class PositivesNegativesJafarian {


    public static boolean alternateSign(int[] array) {
        String status = "";
        if (array[0]>0)
            status = "positive";
        else if (array[0]<0)
            status = "negative";
        else return false;

        for (int i = 1; i <array.length ; i++) {
            if (array[i]>0 && status.equals("positive")) {
                return false;
            }
            else if(array[i] > 0 && status.equals("negative")) {
                status = "positive";
            } else if (array[i]<0 && status.equals("negative")){
                return false;
            } else if (array[i]<0 && status.equals("positive")){
                status = "negative";
            } else if (array[i] == 0)
                return false;

        }

        return true;







    }


}
