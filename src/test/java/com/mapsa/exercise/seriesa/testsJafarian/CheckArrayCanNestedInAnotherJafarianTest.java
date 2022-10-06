package com.mapsa.exercise.seriesa.testsJafarian;

import com.mapsa.exercise.seriesa.j.CheckArrayCanNestedInAnother;
import com.mapsa.exercise.seriesa.j.CheckArrayCanNestedInAnotherJafarian;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckArrayCanNestedInAnotherJafarianTest {
	public static boolean canNest(int[] arr1, int[] arr2) {
		return false;

	}
	
	
	  @Test
	    public void test1() {
	        assertTrue(CheckArrayCanNestedInAnotherJafarian.canNest(new int[] { 1, 2, 3, 4 }, new int[] { 0, 6 }));
	    }

	    @Test
	    public void test2() {
	    	assertTrue(CheckArrayCanNestedInAnotherJafarian.canNest(new int[] { 3, 1 }, new int[] { 4, 0 }));
	    }

	    @Test
	    public void test3() {
	        assertFalse(CheckArrayCanNestedInAnotherJafarian.canNest(new int[] { 9, 9, 8 }, new int[] { 8, 9, 10 }));
	    }

	    @Test
	    public void test4() {
	    	assertFalse(CheckArrayCanNestedInAnotherJafarian.canNest(new int[] { 9, 9, 8 }, new int[] { 8, 9 }));
	    }

	    @Test
	    public void test5() {
	    	assertFalse(CheckArrayCanNestedInAnotherJafarian.canNest(new int[] { 1, 2, 3, 4 }, new int[] { 2, 3 }));
	    }

}