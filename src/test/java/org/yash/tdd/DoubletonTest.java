package org.yash.tdd;

import static org.junit.Assert.*;

import org.junit.Test;
import org.yash.question14.Doubleton;

public class DoubletonTest {

	@Test
	public void shouldReturnOnlyTwoInstance() {

		Doubleton doubleton1 = Doubleton.getInstance();
		System.out.println(doubleton1);
		Doubleton doubleton2 = Doubleton.getInstance();
		System.out.println(doubleton2);
		Doubleton doubleton3 = Doubleton.getInstance();
		System.out.println(doubleton3);
		Doubleton doubleton4 = Doubleton.getInstance();
		System.out.println(doubleton4);
		
		assertNotEquals(doubleton1, doubleton2);
		assertEquals(doubleton2, doubleton3);
		assertEquals(doubleton2, doubleton4);

	}

}
