package org.yash.tdd;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.yash.question9.FindWrongNumber;

public class FindWrongNumberTest {

	FindWrongNumber findWrongNumber = new FindWrongNumber();

	@Test
	public void shouldReturnWrongEvenNumberFromSeries() {
		List<Integer> numberList = Arrays.asList(3, 12, 8, 19, 13, 32, 18, 42, 23, 52);
		int actual = findWrongNumber.findWrongNumberFromSeries(numberList);
		int expected = 19;
		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturnWrongOddNumberFromSeries() {
		List<Integer> numberList = Arrays.asList(3, 12, 8, 22, 14, 32, 18, 42, 23, 52);
		int actual = findWrongNumber.findWrongNumberFromSeries(numberList);
		int expected = 14;
		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturnZeroIfSeriesIsPerfect() {
		List<Integer> numberList = Arrays.asList(3, 12, 8, 22, 13, 32, 18, 42, 23, 52);
		int actual = findWrongNumber.findWrongNumberFromSeries(numberList);
		int expected = 0;
		assertEquals(expected, actual);
	}

}
