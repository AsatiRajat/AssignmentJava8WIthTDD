package org.yash.question11;

public class SecondHighestNumber {

	public int findSecondHighestNumber(int[] numArray) {

		int temp;

		for (int i = 0; i < numArray.length; i++) {
			for (int j = i; j < numArray.length; j++) {
				if (numArray[i] > numArray[j]) {
					temp = numArray[i];
					numArray[i] = numArray[j];
					numArray[j] = temp;
				}
			}
		}

		if (numArray.length > 0)
			return numArray[numArray.length - 2];

		return 0;

	}

}
