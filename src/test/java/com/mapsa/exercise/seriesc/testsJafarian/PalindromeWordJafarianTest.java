package com.mapsa.exercise.seriesc.testsJafarian;

import com.mapsa.exercise.seriesc.g.PalindromeWordJafarian;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeWordJafarianTest {

    @Test
    public void test1() {
        assertTrue(PalindromeWordJafarian.palindromeWord("madam"));
    }

    @Test
    public void test2() {
        assertFalse(PalindromeWordJafarian.palindromeWord("adieu"));
    }

    @Test
    public void test3() {
        assertTrue(PalindromeWordJafarian.palindromeWord("rotor"));
    }


}
