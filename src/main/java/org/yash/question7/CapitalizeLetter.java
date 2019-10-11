package org.yash.question7;

public class CapitalizeLetter {

	public String captalizeFirstAndLastLetterOfEachWord(String string) {

		if (string != null) {
			StringBuffer sb = new StringBuffer();
			String[] wordArray = string.split(" ");
			for (int i = 0; i < wordArray.length; i++) {
				String word = wordArray[i];
				char first = word.charAt(0);
				char last = word.charAt(word.length() - 1);
				sb = sb.append(Character.toUpperCase(first)).append(word.substring(1, word.length() - 1))
						.append(Character.toUpperCase(last));
				if (i < wordArray.length - 1) {
					sb = sb.append(" ");
				}
			}
			return sb.toString();
		} else {
			throw new NullPointerException("String should not be null.");
		}

	}

}
