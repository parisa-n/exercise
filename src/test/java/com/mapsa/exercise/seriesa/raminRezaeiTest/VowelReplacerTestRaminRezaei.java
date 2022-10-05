package com.mapsa.exercise.seriesa.raminRezaeiTest;

import com.mapsa.exercise.seriesa.g.VowelReplacer;
import com.mapsa.exercise.seriesa.g.raminRezaei.VowelReplacerRaminRezaei;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelReplacerTestRaminRezaei {
	@Test
	public void test1() {
		assertEquals("th# ##rdv#rk", VowelReplacerRaminRezaei.replaceVowels("the aardvark", '#'));
	}

	@Test
	public void test2() {
		assertEquals("m?nn?? m??s?", VowelReplacerRaminRezaei.replaceVowels("minnie mouse", '?'));
	}

	@Test
	public void test3() {
		assertEquals("sh*k*sp**r*", VowelReplacerRaminRezaei.replaceVowels("shakespeare", '*'));
	}

	@Test
	public void test4() {
		assertEquals("<ll <s f<<r <n l<v< <nd w<r", VowelReplacerRaminRezaei.replaceVowels("all is fair in love and war", '<'));
	}
}