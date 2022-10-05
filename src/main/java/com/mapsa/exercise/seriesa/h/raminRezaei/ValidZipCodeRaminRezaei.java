package com.mapsa.exercise.seriesa.h.raminRezaei;

public class ValidZipCodeRaminRezaei {
	public static boolean isValid(String str) {
		if(str.length()>5)
			return false ;
		else{
			for(int i=0 ; i<str.length() ; i++){
				if(str.charAt(i)==' ')
				{ return false ; }
				else if(str.charAt(i)>57 || str.charAt(i)<48)
				{ return false ;}
			}

		}
		return true;

	}
}