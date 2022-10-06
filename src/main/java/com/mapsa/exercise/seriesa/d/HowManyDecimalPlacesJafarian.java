package com.mapsa.exercise.seriesa.d;

public class HowManyDecimalPlacesJafarian {

	public static int getDecimalPlaces(String num) {
		if (num.indexOf('.') != -1) {
			num = num.substring(num.indexOf('.')+1);
			return num.length();

		} else return 0;

	}
}