package org.yash.tdd;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import org.yash.question13.FindLeadersNumbers;

public class FindLeadersNumbersTest {

	FindLeadersNumbers findLeadersNumbers = new FindLeadersNumbers();

	@Test
	public void findAllLeadersNumbers() {
		int[] numArray = { 7, 4, 89, 72, 24, 62 };
		int[] expecteds = { 89, 72, 62 };
		int[] actuals = findLeadersNumbers.findAllLeadersNumbersInArray(numArray);
		assertArrayEquals(expecteds, actuals);
	}

}
