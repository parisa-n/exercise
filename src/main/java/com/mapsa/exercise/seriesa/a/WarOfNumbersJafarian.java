package com.mapsa.exercise.seriesa.a;

public class WarOfNumbersJafarian {
	  public static int warOfNumbers(int[]numbers){
		  int sumOdd = 0;
		  int sumEven = 0;

		  for (int number : numbers) {
			  if (isEven(number))
				  sumEven += number;
			  else sumOdd += number;
		  }

		  return difference(sumEven,sumOdd);
			
	  }


	private static boolean isEven(int number) {
		return number % 2 == 0;
	}

	private static int difference(int numberOne,int numberTwo){
		if (numberOne > numberTwo)
			return numberOne - numberTwo;
		else if (numberTwo > numberOne) return numberTwo - numberOne;
		else return 0;
	}
}