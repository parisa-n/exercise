package com.mapsa.exercise.seriesa.g.raminRezaei;

public class VowelReplacerRaminRezaei {
	public static String replaceVowels(String str, char ch) {
		StringBuilder stringB = new StringBuilder(str);
		for(int i=0 ; i<str.length() ; i++){
			if(str.charAt(i)=='a'||
					str.charAt(i)=='e'||
					str.charAt(i)=='o'||
					str.charAt(i)=='i'||
					str.charAt(i)=='u'){
				stringB.setCharAt(i, ch);
			}
		}
		return stringB.toString();

	}
}