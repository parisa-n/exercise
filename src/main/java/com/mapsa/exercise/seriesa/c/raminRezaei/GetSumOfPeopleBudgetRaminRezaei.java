package com.mapsa.exercise.seriesa.c.raminRezaei;

import com.mapsa.exercise.seriesa.c.Person;

import java.util.List;

public class GetSumOfPeopleBudgetRaminRezaei {

	public static int getBudgets(Person[] peoplesBudgets){
		int budgets =0 ;
		for(int i=0 ; i<peoplesBudgets.length ; i++){
			budgets+=peoplesBudgets[i].getBudget() ;
		}
		return budgets ;
	}

}

