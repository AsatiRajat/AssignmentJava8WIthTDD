package org.yash.question13;

import java.util.ArrayList;
import java.util.List;

public class FindLeadersNumbers {

	public int[] findAllLeadersNumbersInArray(int[] numArray) {

		List<Integer> leaderNumsList = new ArrayList<>();
		int arrLenght = numArray.length;

		for (int i = 0; i < arrLenght; i++) {
			int j = 0;
			for (j = i + 1; j < arrLenght; j++) {
				if (numArray[i] <= numArray[j]) {
					break;
				}
			}
			if (j == arrLenght)
				leaderNumsList.add(numArray[i]);
		}

		return leaderNumsList.stream().mapToInt(i -> i).toArray();

	}

}
