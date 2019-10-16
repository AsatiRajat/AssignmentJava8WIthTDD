package org.yash.question19;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfEvenNumbers {

	public int calculateSumOfEvenNumbersInArray(Integer[] numArray) {

		// Integer sum = Arrays.asList(numArray).stream().filter(n -> n % 2 ==
		// 0).mapToInt(n -> n.intValue()).sum();

		// Integer sum = Arrays.asList(numArray).stream().filter(n -> n % 2 ==
		// 0).reduce(0, (a, b) -> a + b);

		Integer sum = Arrays.asList(numArray).stream().filter(n -> n % 2 == 0).collect(Collectors.summingInt(n -> n));

		return sum;
	}

}
