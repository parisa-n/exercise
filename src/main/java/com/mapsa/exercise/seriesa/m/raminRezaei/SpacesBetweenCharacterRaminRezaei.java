package com.mapsa.exercise.seriesa.m.raminRezaei;

public class SpacesBetweenCharacterRaminRezaei {
	public static String spaceMeOut(String str) {
		StringBuilder stringBuilder = new StringBuilder(str);
		for(int i=1 ; i<stringBuilder.length(); i+=2){
			stringBuilder.insert(i,' ');
		}
		return stringBuilder.toString();

	}
}