package com.mapsa.exercise.seriesa.raminRezaeiTest;

import com.mapsa.exercise.seriesa.m.SpacesBetweenCharacter;
import com.mapsa.exercise.seriesa.m.raminRezaei.SpacesBetweenCharacterRaminRezaei;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpacesBetweenCharacterTestRaminRezaei {
	@Test
	public void test1() {
		assertEquals("s p a c e", SpacesBetweenCharacterRaminRezaei.spaceMeOut("space"));
	}

	@Test
	public void test2() {
		assertEquals("f a r   o u t", SpacesBetweenCharacterRaminRezaei.spaceMeOut("far out"));
	}

	@Test
	public void test3() {
		assertEquals("e l o n g a t e d   m u s k", SpacesBetweenCharacterRaminRezaei.spaceMeOut("elongated musk"));
	}

	@Test
	public void test4() {
		assertEquals("l o n g", SpacesBetweenCharacterRaminRezaei.spaceMeOut("long"));
	}

	@Test
	public void test5() {
		assertEquals("1 2 3", SpacesBetweenCharacterRaminRezaei.spaceMeOut("123"));
	}

	@Test
	public void test6() {
		assertEquals("a 1 b 2 c 3", SpacesBetweenCharacterRaminRezaei.spaceMeOut("a1b2c3"));
	}
}