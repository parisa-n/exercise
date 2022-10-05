package com.mapsa.exercise.seriesa.i.raminRezaei;

public class FactorChainRaminRezaei {
	public static boolean factorChain(int[] arr) {
		int lastOfArray = arr[arr.length-1];
		for(int i=0 ; i<arr.length-1 ; i++){
			if(lastOfArray%arr[i]!=0)
				return false ;
		}
		return true ;
	}

	}
