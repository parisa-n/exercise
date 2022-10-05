package com.mapsa.exercise.seriesa.e.raminRezaei;

public class IsAverageWholeNumberRaminRezaei {
	public static boolean isAvgWhole(int arr[]){

		int sum =0 ;
		for(int i=0 ; i<arr.length ; i++){
			sum+=arr[i];
		}
		float avg =(float)sum/arr.length;
		System.out.println(avg);
		if(avg==Math.floor(avg))
			return true ;
		return false ;
	}
}