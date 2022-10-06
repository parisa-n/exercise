package com.mapsa.exercise.seriesa.testsJafarian;

import com.mapsa.exercise.seriesa.i.FactorChain;
import com.mapsa.exercise.seriesa.i.FactorChainJafarian;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorChainJafarianTest {
	@Test
	public void test1() {
		assertEquals(FactorChainJafarian.factorChain(new int[] { 1, 2, 4, 8, 16, 32 }), true);
	}

	@Test
	public void test2() {
		assertEquals(FactorChainJafarian.factorChain(new int[] { 1, 1, 1, 1, 1, 1 }), true);
	}

	@Test
	public void test3() {
		assertEquals(FactorChainJafarian.factorChain(new int[] { 2, 4, 6, 7, 12 }), false);
	}

	@Test
	public void test4() {
		assertEquals(FactorChainJafarian.factorChain(new int[] { 10, 1 }), false);
	}

	@Test
	public void test5() {
		assertEquals(FactorChainJafarian.factorChain(new int[] { 10, 20, 30, 40 }), false);
	}

	@Test
	public void test6() {
		assertEquals(FactorChainJafarian.factorChain(new int[] { 10, 20, 40 }), true);
	}

	@Test
	public void test7() {
		assertEquals(FactorChainJafarian.factorChain(new int[] { 1, 1, 1, 1, 7, 49 }), true);
	}
}