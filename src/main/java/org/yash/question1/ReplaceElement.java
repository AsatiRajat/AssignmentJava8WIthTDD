package org.yash.question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReplaceElement {

	private List<Integer> list = new ArrayList<Integer>(Arrays.asList(55, 25, 368));

	public List<Integer> replaceElementWithInArrayList(Integer replacedNumber, Integer replacementNumber) {
		if (replacedNumber != null && replacementNumber != null) {
			if (list.contains(replacedNumber)) {
				Collections.replaceAll(list, replacedNumber, replacementNumber);
			} else {
				throw new NumberNotFoundException("Number not found.");
			}
		} else {
			throw new RuntimeException("Number should not be null.");
		}
		return list;
	}

}
