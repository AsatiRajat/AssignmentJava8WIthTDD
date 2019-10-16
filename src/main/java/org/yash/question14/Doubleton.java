package org.yash.question14;

public class Doubleton {

	private static Doubleton doubleton;
	static int count = 0;

	private Doubleton() {
		count++;
	}

	public static Doubleton getInstance() {
		if (count < 2) {
			doubleton = new Doubleton();
		}
		return doubleton;
	}
	
	// private static Doubleton doubleton1;
	// private static Doubleton doubleton2;
	//
	// private Doubleton() {
	// }
	//
	// public static Doubleton getInstance() {
	// if (doubleton1 == null) {
	// doubleton1 = new Doubleton();
	// return doubleton1;
	// } else if (doubleton2 == null) {
	// doubleton2 = new Doubleton();
	// return doubleton2;
	// } else {
	// if (Math.random() < 0.5) {
	// return doubleton1;
	// } else {
	// return doubleton2;
	// }
	// }
	// }

}
