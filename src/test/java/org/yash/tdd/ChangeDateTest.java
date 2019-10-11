package org.yash.tdd;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;
import org.yash.question3.ChangeDate;

public class ChangeDateTest {

	ChangeDate changeDate = new ChangeDate();

	@Test
	public void shouldReturnCurrentDateTest() {
		LocalDate expected = LocalDate.now();
		LocalDate actual = changeDate.changeCurrectToNewDate(true, 10);
		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturnUpdatedDateTest() {
		LocalDate localDate = LocalDate.now();
		LocalDate expected = localDate.plusDays(10);
		LocalDate actual = changeDate.changeCurrectToNewDate(false, 10);
		assertEquals(expected, actual);
	}

}
