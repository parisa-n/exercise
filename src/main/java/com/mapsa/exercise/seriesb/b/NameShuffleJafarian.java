package com.mapsa.exercise.seriesb.b;

public class NameShuffleJafarian {

	public static String nameShuffle(String s) {


		String[] text = s.split(" ");
		String newText = "";
		for (int i = text.length-1; i >0 ; i--) {
			newText += text[i] + " ";

		}

		newText += text[0];


		return newText;
	}

}


