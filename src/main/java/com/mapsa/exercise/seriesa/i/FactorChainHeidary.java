package com.mapsa.exercise.seriesa.i;

public class FactorChainHeidary {
	public static boolean factorChain(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[arr.length - 1] % arr[i] != 0) {
				return false;
			}

		}
		return true;
	}
}