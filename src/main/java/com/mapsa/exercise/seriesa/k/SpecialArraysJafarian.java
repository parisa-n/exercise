package com.mapsa.exercise.seriesa.k;

public class SpecialArraysJafarian {
	public static boolean isSpecialArray(int[] arr) {
		boolean checkEven = false;
		boolean checkOdd = false;

		for (int i = 0; i < arr.length; i += 2) {
			if (arr[i] % 2 == 0)
				checkEven = true;
			else {
				checkEven = false;
				break;
			}

		}

		for (int i = 1; i < arr.length; i += 2) {

			if (arr[i] % 2 != 0)
				checkOdd = true;
			else {
				checkOdd = false;
				break;
			}
		}

		return checkEven && checkOdd;

	}
}