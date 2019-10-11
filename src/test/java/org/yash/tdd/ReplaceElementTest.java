package org.yash.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.yash.question1.NumberNotFoundException;
import org.yash.question1.ReplaceElement;

public class ReplaceElementTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	ReplaceElement replaceElementInArrayList = new ReplaceElement();

	@Test
	public void replacedNumberShouldNotBeNull() {
		replaceElementInArrayList.replaceElementWithInArrayList(25, 6);
		assertNotNull(25);
	}

	@Test
	public void replacementNumberShouldNotBeNull() {
		replaceElementInArrayList.replaceElementWithInArrayList(25, 6);
		assertNotNull(25);
	}

	@Test(expected = RuntimeException.class)
	public void replacedNumberShouldNull() {
		replaceElementInArrayList.replaceElementWithInArrayList(null, 6);
	}

	@Test
	public void replacementNumberShouldNull() {
		thrown.expect(RuntimeException.class);
		thrown.expectMessage("Number should not be null.");
		replaceElementInArrayList.replaceElementWithInArrayList(25, null);
	}

	@Test
	public void shouldCheckNumberIsExistInArrayList() {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(55, 25, 368));
		replaceElementInArrayList.replaceElementWithInArrayList(25, 6);
		assertEquals(true, list.contains(25));
	}

	@Test
	public void shouldCheckNumberIsNotExistInArrayList() {
		thrown.expect(NumberNotFoundException.class);
		thrown.expectMessage("Number not found.");
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(55, 25, 368));
		replaceElementInArrayList.replaceElementWithInArrayList(251, 6);
		assertEquals(false, list.contains(251));
	}

	@Test
	public void shouldReturnReplacedNumberList() {
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(55, 6, 368));
		List<Integer> actual = replaceElementInArrayList.replaceElementWithInArrayList(25, 6);
		assertEquals(expected, actual);
	}

}
