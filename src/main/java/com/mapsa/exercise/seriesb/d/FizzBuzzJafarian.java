package com.mapsa.exercise.seriesb.d;

public class FizzBuzzJafarian {

	public static String fizzBuzz(int number) {

		if (number % 15 == 0) {
			return "FizzBuzz";
		} else if (number % 5 == 0) {
			return "Buzz";
		} else if (number % 3 == 0) {
			return "Fizz";
		}
		return String.valueOf(number);


	}
}
