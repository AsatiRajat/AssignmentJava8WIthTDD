package org.yash.question4;

public class MinMaxElement {

	public int findMinMaxElementFromArray(int[] numArray, String numberType) {

		int temp = 0;

		for (int i = 0; i < numArray.length; i++) {
			for (int j = i; j < numArray.length; j++) {
				if (numArray[i] > numArray[j]) {
					temp = numArray[i];
					numArray[i] = numArray[j];
					numArray[j] = temp;
				}
			}
		}

		if (numArray.length > 0) {
			if (numberType.equals("min"))
				return numArray[0];
			else if (numberType.equals("max"))
				return numArray[numArray.length - 1];
		}

		return 0;

	}

}
