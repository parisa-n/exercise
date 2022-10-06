package com.mapsa.exercise.seriesb.testsJafarian;

import com.mapsa.exercise.seriesb.b.NameShuffle;
import com.mapsa.exercise.seriesb.b.NameShuffleJafarian;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameShuffleJafarianTest {
	
	
	  @Test
	  public void test1() {
	    assertEquals("Trump Donald", NameShuffleJafarian.nameShuffle("Donald Trump"));
	  }
		
		@Test
	  public void test2() {
	    assertEquals("O'Donnel Rosie", NameShuffleJafarian.nameShuffle("Rosie O'Donnel"));
	  }
		
		@Test
	  public void test3() {
	    assertEquals("Butts Seymour", NameShuffleJafarian.nameShuffle("Seymour Butts"));
	  }
		
		@Test
	  public void test4() {
	    assertEquals("Greene Ebony", NameShuffleJafarian.nameShuffle("Ebony Greene"));
	  }
		
		@Test
	  public void test5() {
	    assertEquals("Kennedy Ken", NameShuffleJafarian.nameShuffle("Ken Kennedy"));
	  }
		
		@Test
	  public void test6() {
	    assertEquals("Gonzalez Allison", NameShuffleJafarian.nameShuffle("Allison Gonzalez"));
	  }
		
		@Test
	  public void test7() {
	    assertEquals("Frazier Albert", NameShuffleJafarian.nameShuffle("Albert Frazier"));
	  }
		
		@Test
	  public void test8() {
	    assertEquals("Hopkins Eloise", NameShuffleJafarian.nameShuffle("Eloise Hopkins"));
	  }
		
		@Test
	  public void test9() {
	    assertEquals("Welch Donnie", NameShuffleJafarian.nameShuffle("Donnie Welch"));
	  }
		
		@Test
	  public void test10() {
	    assertEquals("Thomas Vernon", NameShuffleJafarian.nameShuffle("Vernon Thomas"));
	  }

}
