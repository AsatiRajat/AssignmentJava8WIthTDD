package org.yash.question12;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapByValues {

	public Map<Integer, String> sortHashMapByValuesInAscOrder(Map<Integer, String> unsortedMap) {

		Map<Integer, String> sortedMap = unsortedMap
				.entrySet()
				.stream()
				.sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		System.out.println("UnsortedMap : " + unsortedMap);
		System.out.println("SortedMap : " + sortedMap);
		return sortedMap;

	}

}


//.sorted(Map.Entry.<Integer, String>comparingByValue())