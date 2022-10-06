package com.mapsa.exercise.seriesa.testsJafarian;

import com.mapsa.exercise.seriesa.n.RepeatingLettersNTimes;
import com.mapsa.exercise.seriesa.n.RepeatingLettersNTimesJafarian;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepeatingLettersNTimesJafarianTest {
	  @Test
	  public void test1() {
	    assertEquals("mmmmmiiiiiccccceeeee", RepeatingLettersNTimesJafarian.repeat("mice", 5));
	  }
		
		@Test
	  public void test2() {
	    assertEquals("hhheeellllllooo", RepeatingLettersNTimesJafarian.repeat("hello", 3));
	  }
		
		@Test
	  public void test3() {
	    assertEquals("stop", RepeatingLettersNTimesJafarian.repeat("stop", 1));
	  }
		
		@Test
	  public void test4() {
	    assertEquals("ttoommaattoo", RepeatingLettersNTimesJafarian.repeat("tomato", 2));
	  }
}