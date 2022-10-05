package com.mapsa.exercise.seriesa.j.raminRezaei;

public class CheckArrayCanNestedInAnotherRaminRezaei {
	public static boolean canNest(int[] arr1, int[] arr2) {
		int arr1Min=arr1[0] , arr1Max=arr1[0] ;
		int arr2Min=arr2[0] , arr2Max=arr2[0] ;

		//max and min for first array
		for(int i=0 ; i<arr1.length ; i++){
			if(arr1[i]<arr1Min){
				arr1Min=arr1[i];
			}
			else if (arr1[i]>arr1Max){
				arr1Max=arr1[i];
			}

		}
		//max and min for second array
		for(int i=0 ; i<arr2.length ; i++){
			if(arr2[i]<arr2Min){
				arr2Min = arr2[i];
			}
			else if(arr2[i]>arr2Max){
				arr2Max = arr2[i];
			}

		}


		//arr1 min is greater than arr2 min
		//arr1 max is less than arr2s max
		if(arr1Min>arr2Min && arr1Max<arr2Max){
			return true ;
		}
		return false ;


	}
}