package com.mapsa.exercise.seriesa.g;

public class VowelReplacerJafarian {
	public static String replaceVowels(String str, char ch) {
		String newText="";

		for (int i = 0; i <str.length() ; i++) {

			if (checkVowel(str.charAt(i)))
				newText += String.valueOf(ch);
			else newText += String.valueOf(str.charAt(i));

		}

		return newText;

	}

	private static boolean checkVowel(char character){
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		for (int i = 0; i <vowels.length ; i++) {
			if (character == vowels[i])
				return true;

		}

		return false;

	}
}