package org.yash.question3;

import java.time.LocalDate;

public class ChangeDate {

	public LocalDate changeCurrectToNewDate(Boolean flag, Integer numberOfDays) {

		LocalDate localDate = LocalDate.now();

		if (flag) {
			System.out.println("Current Date : " + localDate);
			return localDate;
		} else {
			System.out.println("Entered number of day : " + numberOfDays);
			LocalDate updatedDate = localDate.plusDays(numberOfDays);
			System.out.println("Updated date : " + updatedDate);
			return updatedDate;
		}

	}

}
