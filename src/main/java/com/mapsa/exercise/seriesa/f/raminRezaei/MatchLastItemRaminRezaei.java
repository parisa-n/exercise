package com.mapsa.exercise.seriesa.f.raminRezaei;

public class MatchLastItemRaminRezaei {
	  public static boolean matchLastItem(String[]arr) {
		  String str="" ;
		  for(int i=0 ; i<arr.length-1 ; i++){

			  str+=arr[i];


		  }
		  return str.equals(arr[arr.length-1]);
			
	  }
}