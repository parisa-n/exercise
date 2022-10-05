package com.mapsa.exercise.seriesa.raminRezaeiTest;

import com.mapsa.exercise.seriesa.k.SpecialArrays;
import com.mapsa.exercise.seriesa.k.raminRezaei.SpecialArraysRaminRezaei;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SpecialArraysTestRaminRezaei {
	@Test
	public void test1() {
		assertThat(SpecialArraysRaminRezaei.isSpecialArray(new int[] { 2, 7, 4, 9, 6, 1, 6, 3 }), is(true));
	}

	@Test
	public void test2() {
		assertThat(SpecialArraysRaminRezaei.isSpecialArray(new int[] { 2, 7, 9, 1, 6, 1, 6, 3 }), is(false));
	}

	@Test
	public void test3() {
		assertThat(SpecialArraysRaminRezaei.isSpecialArray(new int[] { 2, 7, 8, 8, 6, 1, 6, 3 }), is(false));
	}

	@Test
	public void test4() {
		assertThat(SpecialArraysRaminRezaei.isSpecialArray(new int[] { 1, 1, 1, 2 }), is(false));
	}

	@Test
	public void test5() {
		assertThat(SpecialArraysRaminRezaei.isSpecialArray(new int[] { 2, 2, 2, 2 }), is(false));
	}

	@Test
	public void test6() {
		assertThat(SpecialArraysRaminRezaei.isSpecialArray(new int[] { 2, 1, 2, 1 }), is(true));
	}

	@Test
	public void test7() {
		assertThat(SpecialArraysRaminRezaei.isSpecialArray(new int[] { 4, 5, 6, 7 }), is(true));
	}

	@Test
	public void test8() {
		assertThat(SpecialArraysRaminRezaei.isSpecialArray(new int[] { 4, 5, 6, 7, 0, 5 }), is(true));
	}
}