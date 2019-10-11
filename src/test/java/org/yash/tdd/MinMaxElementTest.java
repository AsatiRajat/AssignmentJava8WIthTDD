package org.yash.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.yash.question4.MinMaxElement;

public class MinMaxElementTest {

	MinMaxElement minMaxElement = new MinMaxElement();

	@Test
	public void shouldReturnMinValueFromArraytest() {
		int[] numArray = { 7, 4, 89, 56, 24, 62 };
		int expected = 4;
		int actual = minMaxElement.findMinMaxElementFromArray(numArray, "min");
		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturnMaxValueFromArraytest() {
		int[] numArray = { 7, 4, 89, 56, 24, 62 };
		int expected = 89;
		int actual = minMaxElement.findMinMaxElementFromArray(numArray, "max");
		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturnValueFromArraytest() {
		int[] numArray = {};
		int expected = 0;
		int actual = minMaxElement.findMinMaxElementFromArray(numArray, "min");
		assertEquals(expected, actual);
	}

}
