package org.yash.question20;

import java.util.Arrays;

public class CheckAnagram {

	public boolean checkTwoStringIsAnagramOrNot(String str1, String str2) {

		char[] charArr1 = str1.toCharArray();
		char[] charArr2 = str2.toCharArray();

		if (charArr1.length != charArr2.length) {
			return false;
		}

		Arrays.sort(charArr1);
		Arrays.sort(charArr2);

		for (int i = 0; i < charArr1.length; i++)
			if (charArr1[i] == charArr2[i])
				return true;

		return false;

	}

}
