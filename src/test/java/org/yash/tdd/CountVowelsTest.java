package org.yash.tdd;

import static org.junit.Assert.*;

import org.junit.Test;
import org.yash.question6.CountVowels;

public class CountVowelsTest {

	CountVowels countVowels = new CountVowels();

	@Test
	public void shouldRetrunCountOfVowelsTest() {
		int vowelCount = countVowels.countVowelsFromString("includehelpINCLUDEHELPaeiouAEIOU");
		assertEquals(18, vowelCount);
	}
	
	@Test(expected = NullPointerException.class)
	public void shouldThrowNullPointerException() {
		countVowels.countVowelsFromString(null);
	}

}
