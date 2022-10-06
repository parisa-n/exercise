package com.mapsa.exercise.seriesc.h;

public class InputFactorialJafarian {
    private int index = 1;


    public static boolean checkNumberIsFactorial(int number) {
        InputFactorialJafarian inputFactorialJafarian = new InputFactorialJafarian();
        return inputFactorialJafarian.isFactorial(number);
    }

    private boolean isFactorial(int number){
        if (number == 1)
            return true;

        if (number % index == 0){
            number /= index;
        }

        else {
            return false;
        }

        index++;
        return isFactorial(number);
    }


}
