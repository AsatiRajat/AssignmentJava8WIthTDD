package org.yash.question5;

import java.util.ArrayList;
import java.util.List;

public class CreateSubList {

	public List<Integer> createSubListFromArrayList(int fromIndex, int toIndex) {

		List<Integer> numberList = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			numberList.add(i);
		}
		System.out.println("Main list : " + numberList);

		List<Integer> subList = numberList.subList(fromIndex, toIndex);
		System.out.println("Sub list : " + subList);

		return subList;
	}

}
