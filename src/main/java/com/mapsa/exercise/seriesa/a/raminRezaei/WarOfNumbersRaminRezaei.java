package com.mapsa.exercise.seriesa.a.raminRezaei;

public class WarOfNumbersRaminRezaei {
	  public static int warOfNumbers(int[]numbers){
		  int difference=0 ;
		  for(int i=0 ; i<numbers.length ; i++){
			  if(numbers[i]%2==0){
				  difference+=numbers[i];
			  }
			  else{
				  difference-=numbers[i];
			  }

		  }
		  return Math.abs(difference);
	  }
}