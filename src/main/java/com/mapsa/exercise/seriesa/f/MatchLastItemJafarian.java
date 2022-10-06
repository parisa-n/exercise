package com.mapsa.exercise.seriesa.f;

import java.util.Objects;

public class MatchLastItemJafarian {
	  public static boolean matchLastItem(String[] items) {
		  String sumItem ="";
		  for (int i = 0; i <items.length-1 ; i++) {
			  sumItem+= items[i];
		  }

		  if (Objects.equals(sumItem,items[items.length-1]))
			  return true;


		  else return false;
			
	  }
}