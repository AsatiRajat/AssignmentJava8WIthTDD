package org.yash.question10;

import java.util.List;

public class FindNextNumber {

	public int findNextNumberFromSeries(List<Integer> numberList) {

		// 7, 10, 8, 11, 9, 12

		int value = numberList.get(0);

		for (int i = 0; i < numberList.size(); i++) {

			if (i % 2 == 0) {
				value = value + 3;
			} else {
				value = value - 2;
			}

		}

		return value;

	}

}
