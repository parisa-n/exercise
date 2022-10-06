package com.mapsa.exercise.seriesb.testsJafarian;

import com.mapsa.exercise.seriesb.c.CanCapture;
import com.mapsa.exercise.seriesb.c.CanCaptureJafarian;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CanCaptureJafarianTest {

	@Test
	public void test1() {
		assertTrue(CanCaptureJafarian.canCapture(new String[] { "A8", "E8" }));
	}

	@Test
	public void test2() {
		assertFalse(CanCaptureJafarian.canCapture(new String[] { "A1", "B2" }));
	}

	@Test
	public void test3() {
		assertTrue(CanCaptureJafarian.canCapture(new String[] { "H4", "H3" }));
	}

	@Test
	public void test4() {
		assertFalse(CanCaptureJafarian.canCapture(new String[] { "F5", "C8" }));
	}

	@Test
	public void test5() {
		assertTrue(CanCaptureJafarian.canCapture(new String[] { "G3", "G7" }));
	}

	@Test
	public void test6() {
		assertTrue(CanCaptureJafarian.canCapture(new String[] { "B3", "B2" }));
	}

	@Test
	public void test7() {
		assertFalse(CanCaptureJafarian.canCapture(new String[] { "F5", "B2" }));
	}

	@Test
	public void test8() {
		assertFalse(CanCaptureJafarian.canCapture(new String[] { "H5", "C8" }));
	}

}
