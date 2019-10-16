package org.yash.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.yash.question19.SumOfEvenNumbers;

public class SumOfEvenNumbersTest {

	SumOfEvenNumbers sumOfEvenNumbers = new SumOfEvenNumbers();

	@Test
	public void shouldReturnSumOfEvenNumbersTest() {
		Integer[] numArray = { 12, 3, 45, 65, 8, 9, 10, 4, 6 };
		int expected = 40;
		int actual = sumOfEvenNumbers.calculateSumOfEvenNumbersInArray(numArray);
		System.out.println(actual);
		assertEquals(expected, actual);
	}

}
