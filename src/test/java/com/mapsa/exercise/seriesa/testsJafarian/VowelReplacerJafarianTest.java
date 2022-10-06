package com.mapsa.exercise.seriesa.testsJafarian;

import com.mapsa.exercise.seriesa.g.VowelReplacer;
import com.mapsa.exercise.seriesa.g.VowelReplacerJafarian;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelReplacerJafarianTest {
	@Test
	public void test1() {
		assertEquals("th# ##rdv#rk", VowelReplacerJafarian.replaceVowels("the aardvark", '#'));
	}

	@Test
	public void test2() {
		assertEquals("m?nn?? m??s?", VowelReplacerJafarian.replaceVowels("minnie mouse", '?'));
	}

	@Test
	public void test3() {
		assertEquals("sh*k*sp**r*", VowelReplacerJafarian.replaceVowels("shakespeare", '*'));
	}

	@Test
	public void test4() {
		assertEquals("<ll <s f<<r <n l<v< <nd w<r", VowelReplacerJafarian.replaceVowels("all is fair in love and war", '<'));
	}
}