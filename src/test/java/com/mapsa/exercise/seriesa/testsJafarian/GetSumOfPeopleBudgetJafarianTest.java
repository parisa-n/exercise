package com.mapsa.exercise.seriesa.testsJafarian;

import com.mapsa.exercise.seriesa.c.GetSumOfPeopleBudget;
import com.mapsa.exercise.seriesa.c.GetSumOfPeopleBudgetJafarian;
import com.mapsa.exercise.seriesa.c.Person;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GetSumOfPeopleBudgetJafarianTest {
	
	@Test
	public void test1() {
		assertTrue(GetSumOfPeopleBudgetJafarian.getBudgets(new Person[] { new Person("John", 21, 23000), new Person("Steve", 32, 40000),
				new Person("Martin", 16, 2700) }) - 65700.0 == 0.0);
	}

	@Test
	public void test2() {
		assertTrue(GetSumOfPeopleBudgetJafarian.getBudgets(new Person[] { new Person("John", 21, 29000), new Person("Steve", 32, 32000),
				new Person("Martin", 16, 1600) }) - 62600.0 == 0.0);
	}

	@Test
	public void test3() {
		assertTrue(GetSumOfPeopleBudgetJafarian.getBudgets(new Person[] { new Person("John", 21, 19401), new Person("Steve", 32, 12321),
				new Person("Martin", 16, 1204) }) - 32926.0 == 0.0);
	}

	@Test
	public void test4() {
		assertTrue(GetSumOfPeopleBudgetJafarian.getBudgets(new Person[] { new Person("John", 21, 10234), new Person("Steve", 32, 21754),
				new Person("Martin", 16, 4935) }) - 36923.0 == 0.0);
	}
}

