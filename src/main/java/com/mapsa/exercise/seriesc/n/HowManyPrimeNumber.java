package com.mapsa.exercise.seriesc.n;

public class HowManyPrimeNumber {


    public static int primeNumbers(int number) {
        int count = 1;
        if (number>2){
            for (int i = 3; i <number; i++) {
                if (isPrime(i))
                    count++;

            }
        }

        return count;

    }

    private static boolean isPrime(int number){
        for (int i = 2; i <number ; i++) {
            if (number%i==0)
                return false;

        }
        return true;
    }




}
