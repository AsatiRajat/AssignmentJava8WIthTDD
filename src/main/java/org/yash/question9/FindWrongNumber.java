package org.yash.question9;

import java.util.List;

public class FindWrongNumber {

	public Integer findWrongNumberFromSeries(List<Integer> numberList) {

		// 3, 12, 8, 19, 13, 32, 18, 42, 23, 52

		int evenIndexValue = numberList.get(0);
		int oddIndexValue = numberList.get(1);

		for (int i = 2; i < numberList.size(); i++) {

			if (i % 2 == 0) {
				evenIndexValue = evenIndexValue + 5;
				if (evenIndexValue != numberList.get(i)) {
					return numberList.get(i);
				}
			} else {
				oddIndexValue = oddIndexValue + 10;
				if (oddIndexValue != numberList.get(i)) {
					return numberList.get(i);
				}
			}

		}

		return 0;

	}

}
