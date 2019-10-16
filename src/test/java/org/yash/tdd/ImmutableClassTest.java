package org.yash.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.yash.question18.ImmutableClass;

public class ImmutableClassTest {

	@Test
	public void shouldReturnImmutableClassInstance() {

		ImmutableClass actual = ImmutableClass.getInstance(5);
		int expected = 5;
		assertEquals(expected, actual.getId());

	}

}
