package org.yash.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.yash.question2.CheckSpyNumber;

public class CheckSpyNumberTest {

	CheckSpyNumber checkSpyNumber = new CheckSpyNumber();
	
	@Test
	public void shouldReturnFalseIfNumberIsNull() {
		boolean actual = checkSpyNumber.checkSpyNumber(null);
		assertEquals(false, actual);
	}
	

	@Test
	public void shouldReturnTrueIfNumberIsSpyNumberTest() {
		boolean actual = checkSpyNumber.checkSpyNumber(132);
		assertEquals(true, actual);
	}

	@Test
	public void shouldReturnFalseIfNumberIsNotSpyNumberTest() {
		boolean actual = checkSpyNumber.checkSpyNumber(412);
		assertEquals(false, actual);
	}

}
