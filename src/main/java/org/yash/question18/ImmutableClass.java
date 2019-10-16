package org.yash.question18;

public class ImmutableClass {

	private int id;

	private ImmutableClass(int id) {
		this.id = id;
	}

	public static ImmutableClass getInstance(int id) {
		return new ImmutableClass(id);
	}

	public int getId() {
		return id;
	}

}
