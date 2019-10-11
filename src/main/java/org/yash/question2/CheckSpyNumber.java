package org.yash.question2;

public class CheckSpyNumber {

	public boolean checkSpyNumber(Integer number) {

		int sum = 0, product = 1, mod = 0;

		if (number != null) {

			while (number > 0) {
				mod = number % 10;
				sum = sum + mod;
				product = product * mod;
				number = number / 10;
			}
			if (sum == product)
				return true;
			else
				return false;

		}
		return false;
	}

}

