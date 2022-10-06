package com.mapsa.exercise.seriesb.c;

public class CanCaptureJafarian {

	public static Boolean canCapture(String[] rooks) {
		String word1 = rooks[0];
		String word2 = rooks[1];

		if (word1.charAt(0) == word2.charAt(0) || word1.charAt(1) == word2.charAt(1))
			return true;

		return false;

	}
}
