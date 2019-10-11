package org.yash.tdd;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.yash.question5.CreateSubList;

public class CreateSubListTest {

	CreateSubList createSubList = new CreateSubList();

	@Test
	public void shouldReturnSubList() {
		List<Integer> expected = Arrays.asList(4, 5, 6, 7, 8);
		List<Integer> actual = createSubList.createSubListFromArrayList(3, 8);
		assertEquals(expected, actual);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void shouldThrowIndexOutOfBoundsException() {
		List<Integer> expected = Arrays.asList(4, 5, 6, 7, 8);
		List<Integer> actual = createSubList.createSubListFromArrayList(12, 15);
		assertEquals(expected, actual);
	}

}
