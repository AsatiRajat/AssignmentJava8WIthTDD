package org.yash.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.yash.question7.CapitalizeLetter;

public class CapitalizeLetterTest {

	CapitalizeLetter capitalizeLetter = new CapitalizeLetter();

	@Test
	public void shouldReturnCaptalizeFirstAndLastLetter() {
		String actual = capitalizeLetter.captalizeFirstAndLastLetterOfEachWord("yash pune office");
		assertEquals("YasH PunE OfficE", actual);
	}

	@Test(expected = NullPointerException.class)
	public void shouldThrowNullPointerException() {
		capitalizeLetter.captalizeFirstAndLastLetterOfEachWord(null);
	}

}
