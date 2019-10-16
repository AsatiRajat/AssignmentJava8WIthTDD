package org.yash.question15;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountOfCharacters {

	public String findCountOfCharacters(String givenString) {

		char[] charArray = givenString.toCharArray();
		// iamyashemployee
		// ia2m2y2shploe3
		Map<Character, Integer> characterMap = new LinkedHashMap<>();

		for (int i = 0; i < charArray.length; i++) {
			if (!characterMap.containsKey(charArray[i]))
				characterMap.put(charArray[i], 1);
			else
				characterMap.put(charArray[i], characterMap.get(charArray[i]) + 1);
		}

		String finalString = "";
		for (Entry<Character, Integer> entry : characterMap.entrySet()) {
			finalString = finalString + entry.getKey();
			if (entry.getValue() > 1) {
				finalString = finalString + entry.getValue();
			}
		}

		return finalString;

	}

}
