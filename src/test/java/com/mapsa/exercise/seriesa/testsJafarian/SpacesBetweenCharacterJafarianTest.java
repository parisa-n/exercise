package com.mapsa.exercise.seriesa.testsJafarian;

import com.mapsa.exercise.seriesa.m.SpacesBetweenCharacter;
import com.mapsa.exercise.seriesa.m.SpacesBetweenCharacterJafarian;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpacesBetweenCharacterJafarianTest {
	@Test
	public void test1() {
		assertEquals("s p a c e", SpacesBetweenCharacterJafarian.spaceMeOut("space"));
	}

	@Test
	public void test2() {
		assertEquals("f a r   o u t", SpacesBetweenCharacterJafarian.spaceMeOut("far out"));
	}

	@Test
	public void test3() {
		assertEquals("e l o n g a t e d   m u s k", SpacesBetweenCharacterJafarian.spaceMeOut("elongated musk"));
	}

	@Test
	public void test4() {
		assertEquals("l o n g", SpacesBetweenCharacterJafarian.spaceMeOut("long"));
	}

	@Test
	public void test5() {
		assertEquals("1 2 3", SpacesBetweenCharacterJafarian.spaceMeOut("123"));
	}

	@Test
	public void test6() {
		assertEquals("a 1 b 2 c 3", SpacesBetweenCharacterJafarian.spaceMeOut("a1b2c3"));
	}
}