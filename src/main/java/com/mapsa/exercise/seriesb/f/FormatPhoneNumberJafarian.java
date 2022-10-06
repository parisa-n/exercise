package com.mapsa.exercise.seriesb.f;

public class FormatPhoneNumberJafarian {

    public static String formatPhoneNumber(int[] nums) {
        String input = "";
        for (int num : nums) {
            input += num;
        }

        String number = input.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");


        return number;
    }
}
