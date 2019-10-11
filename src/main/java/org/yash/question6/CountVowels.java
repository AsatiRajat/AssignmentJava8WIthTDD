package org.yash.question6;

public class CountVowels {

	public int countVowelsFromString(String string) {

		if (string != null) {
			int count = 0;
			char[] charArr = string.toCharArray();
			for (char c : charArr) {
				switch (c) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					count++;
				}
			}
			System.out.println("Vowels count : " + count);
			return count;
		} else {
			throw new NullPointerException("String should not be null.");
		}

	}

}
