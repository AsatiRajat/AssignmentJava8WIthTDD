package org.yash.tdd;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.yash.question10.FindNextNumber;

public class FindNextNumberTest {

	FindNextNumber findNextNumber = new FindNextNumber();

	@Test
	public void shouldReturnNextNumberFromSeries() {
		List<Integer> numberList = Arrays.asList(7, 10, 8, 11, 9, 12);
		int actual = findNextNumber.findNextNumberFromSeries(numberList);
		int expected = 10;
		assertEquals(expected, actual);
	}

}
