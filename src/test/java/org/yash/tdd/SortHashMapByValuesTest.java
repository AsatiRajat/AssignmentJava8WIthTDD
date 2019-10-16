package org.yash.tdd;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.yash.question12.SortHashMapByValues;

public class SortHashMapByValuesTest {

	SortHashMapByValues sortHashMapByValues = new SortHashMapByValues();

	@Test
	public void shouldReturnSortedHashMapInAscOrderByValues() {
		final Map<Integer, String> map = new HashMap<>();
		map.put(1, "Ram");
		map.put(2, "Lakshaman");
		map.put(3, "Bharat");
		map.put(4, "Shatarughan");
		map.put(5, "Hanuman");
		map.put(6, "Sita");
		// {1=Ram, 2=Lakshaman, 3=Bharat, 4=Shatarughan, 5=Hanuman, 6=Sita}

		Map<Integer, String> expected = new HashMap<>();
		expected.put(3, "Bharat");
		expected.put(5, "Hanuman");
		expected.put(2, "Lakshaman");
		expected.put(1, "Ram");
		expected.put(4, "Shatarughan");
		expected.put(6, "Sita");
		// {3=Bharat, 5=Hanuman, 2=Lakshaman, 1=Ram, 4=Shatarughan, 6=Sita}

		Map<Integer, String> actual = sortHashMapByValues.sortHashMapByValuesInAscOrder(map);
		assertEquals(expected, actual);

	}

}
