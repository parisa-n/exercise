package com.mapsa.exercise.seriesb.testsJafarian;

import com.mapsa.exercise.seriesb.d.FizzBuzz;
import com.mapsa.exercise.seriesb.d.FizzBuzzJafarian;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzJafarianTest {

	@Test
	public void test1() {
		assertEquals(FizzBuzzJafarian.fizzBuzz(3), "Fizz");
	}

	@Test
	public void test2() {
		assertEquals(FizzBuzzJafarian.fizzBuzz(5), "Buzz");
	}

	@Test
	public void test3() {
		assertEquals(FizzBuzzJafarian.fizzBuzz(15), "FizzBuzz");
	}

	@Test
	public void test4() {
		assertEquals(FizzBuzzJafarian.fizzBuzz(10), "Buzz");
	}

	@Test
	public void test5() {
		assertEquals(FizzBuzzJafarian.fizzBuzz(98), "98");
	}

}
