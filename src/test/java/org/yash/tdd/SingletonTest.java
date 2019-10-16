package org.yash.tdd;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import org.junit.Test;
import org.yash.question16.Singleton;

public class SingletonTest {

	@Test
	public void shouldReturnOnlyOneInstance() {

		Singleton instance1 = Singleton.getInstance();

		// Serialization
		try {
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.txt"));
			out.writeObject(instance1);
			out.close();

			ObjectInput in = new ObjectInputStream(new FileInputStream("file.txt"));
			Singleton instance2 = (Singleton) in.readObject();
			in.close();

			assertEquals(instance1.hashCode(), instance2.hashCode());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
