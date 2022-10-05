package com.mapsa.exercise.seriesa.n.raminRezaei;

public class RepeatingLettersNTimesRaminRezaei {
	public static String repeat(String str, int count) {
		String newString="" ;
		for(int i=0 ; i<str.length() ; i++){
			for(int j=0 ; j<count ; j++){
				newString+=str.charAt(i) ;
			}
		}

		return newString ;

	}
}