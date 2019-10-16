package org.yash.question16;

import java.io.Serializable;

public class Singleton implements Serializable {

	private static final long serialVersionUID = 1L;
	private static Singleton singleton;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			// singleton = new Singleton();
			synchronized (Singleton.class) {
				if (singleton == null) {
					// if instance is null, initialize
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}

	protected Object readResolve() {
		return singleton;
	}

}
