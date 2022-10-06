package com.mapsa.exercise.seriesa.m;

public class SpacesBetweenCharacterJafarian {
	public static String spaceMeOut(String str) {
		String newText ="";
		for (int i = 0; i <str.length()-1 ; i++) {
			newText = newText + String.valueOf(str.charAt(i)) + " ";

		}
		newText = newText + String.valueOf(str.charAt(str.length()-1));

		return newText;

	}
}