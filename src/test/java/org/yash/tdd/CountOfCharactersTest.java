package org.yash.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.yash.question15.CountOfCharacters;

public class CountOfCharactersTest {

	CountOfCharacters countOfCharacters = new CountOfCharacters();

	@Test
	public void shouldReturnCountOfCharactersTest() {
		String string = "iamyashemployee";
		String expected = "ia2m2y2she3plo";

		String actual = countOfCharacters.findCountOfCharacters(string);
		assertEquals(expected, actual);
	}

}
