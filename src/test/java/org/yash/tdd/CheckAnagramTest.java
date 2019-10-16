package org.yash.tdd;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.yash.question20.CheckAnagram;

public class CheckAnagramTest {

	CheckAnagram checkAnagram = new CheckAnagram();

	@Test
	public void shouldReturnTrueIfTwoStringIsAnagram() {
		String str1 = "peek";
		String str2 = "keep";

		boolean actual = checkAnagram.checkTwoStringIsAnagramOrNot(str1, str2);
		assertTrue(actual);
	}

	@Test
	public void shouldReturnFalseIfTwoStringIsNotAnagram() {
		String str1 = "Motheds In Law";
		String str2 = "Hitler Woman";

		boolean actual = checkAnagram.checkTwoStringIsAnagramOrNot(str1, str2);
		assertFalse(actual);
	}

	@Test
	public void shouldReturnFalseIfTwoStringsLengthIsNotEqual() {
		String str1 = "peeks";
		String str2 = "keep";

		boolean actual = checkAnagram.checkTwoStringIsAnagramOrNot(str1, str2);
		assertFalse(actual);
	}

}
