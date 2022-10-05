package com.mapsa.exercise.seriesa.l.raminRezaei;

import java.util.Arrays;

public class MaximumPossibleTotalRaminRezaei {
	public static int maxTotal(int[] arr) {

		int sumOfFive =0 ; //will save sum of 5 numbers
		//bubble sort
		int temp  ;
		for(int i=0 ; i<arr.length ; i++){
			for(int j=i ; j<arr.length ; j++){
				//bubble sort in increasing mode
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp ;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		//sum of the five maximun numbers of the array
		for(int i=0 ; i<5 ; i++){
			sumOfFive+=arr[i] ;
		}
		return sumOfFive;

	}
}