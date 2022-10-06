package com.mapsa.exercise.seriesa.c;

public class GetSumOfPeopleBudgetJafarian {
	
	public static double getBudgets(Person[] persons) {
		double sum = 0;
		for (Person people: persons) {
			sum+=people.getBudget();
		}
		return sum;

	}

}

