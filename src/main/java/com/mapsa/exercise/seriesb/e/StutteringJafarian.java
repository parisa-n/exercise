package com.mapsa.exercise.seriesb.e;

public class StutteringJafarian {

	public static String stutter(String word) {
		String stutter = word.substring(0,2);

		return stutter + "... " + stutter + "... " + word +"?";
	}

}
