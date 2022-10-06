package com.mapsa.exercise.seriesa.n;

public class RepeatingLettersNTimesJafarian {
	public static String repeat(String str, int n) {
		String newText = "";

		for (int i = 0; i <str.length() ; i++) {
			newText += repeatChar(str.charAt(i),n);

		}

		return newText;

	}
	private static String repeatChar(char character,int number){
		String text = "";
		for (int i = 0; i <number ; i++) {
			text += String.valueOf(character);
		}

		return text;
	}
}