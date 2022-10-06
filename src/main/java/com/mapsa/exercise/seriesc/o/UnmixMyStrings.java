package com.mapsa.exercise.seriesc.o;

public class UnmixMyStrings {


    public static String unmix(String input) {
        String newText = "";
        if (input.length() % 2 == 0) {
            for (int i = 0; i <input.length() ; i+=2) {
                char a = input.charAt(i);
                char b = input.charAt(i +1);
                String change = String.valueOf(b) + a;

                newText+= change;

            }

        } else {
            for (int i = 0; i <input.length()-1 ; i+=2) {
                char a = input.charAt(i);
                char b = input.charAt(i +1);
                String change = String.valueOf(b) + a;

                newText+= change;

            }
            newText+=input.charAt(input.length()-1);

        }

        return newText;


    }


}
