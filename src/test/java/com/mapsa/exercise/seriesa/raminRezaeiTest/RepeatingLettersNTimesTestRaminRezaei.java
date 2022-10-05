package com.mapsa.exercise.seriesa.raminRezaeiTest;

import com.mapsa.exercise.seriesa.n.RepeatingLettersNTimes;
import com.mapsa.exercise.seriesa.n.raminRezaei.RepeatingLettersNTimesRaminRezaei;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepeatingLettersNTimesTestRaminRezaei {
	  @Test
	  public void test1() {
	    assertEquals("mmmmmiiiiiccccceeeee", RepeatingLettersNTimesRaminRezaei.repeat("mice", 5));
	  }
		
		@Test
	  public void test2() {
	    assertEquals("hhheeellllllooo", RepeatingLettersNTimesRaminRezaei.repeat("hello", 3));
	  }
		
		@Test
	  public void test3() {
	    assertEquals("stop", RepeatingLettersNTimesRaminRezaei.repeat("stop", 1));
	  }
		
		@Test
	  public void test4() {
	    assertEquals("ttoommaattoo", RepeatingLettersNTimesRaminRezaei.repeat("tomato", 2));
	  }
}