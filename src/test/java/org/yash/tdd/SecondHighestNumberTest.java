package org.yash.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.yash.question11.SecondHighestNumber;

public class SecondHighestNumberTest {

	SecondHighestNumber secondHighestNumber = new SecondHighestNumber();

	@Test
	public void findSecondHighestNumber() {
		int[] numArray = { 12, 3, 43, 42, 2, 2 };
		int expected = 42;
		int actual = secondHighestNumber.findSecondHighestNumber(numArray);
		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturnValueFromArraytest() {
		int[] numArray = {};
		int expected = 0;
		int actual = secondHighestNumber.findSecondHighestNumber(numArray);
		assertEquals(expected, actual);
	}

}
