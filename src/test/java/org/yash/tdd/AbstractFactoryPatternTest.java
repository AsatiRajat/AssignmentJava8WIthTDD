package org.yash.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.yash.question17.VehicleFactory;
import org.yash.question17.Vehicle;

public class AbstractFactoryPatternTest {

	VehicleFactory abstractFactoryPattern = new VehicleFactory();

	@Test
	public void shouldReturnTwoVehicleInstanceFromAbstractFactoryPattern() {
		String expected = "TwoVehicle";
		Vehicle actual = abstractFactoryPattern.getAbstractFactoryInstance(2);
		assertEquals(expected, actual.getVehicleType());
	}

	@Test
	public void shouldReturnFourVehicleInstanceFromAbstractFactoryPattern() {
		String expected = "FourVehicle";
		Vehicle actual = abstractFactoryPattern.getAbstractFactoryInstance(4);
		assertEquals(expected, actual.getVehicleType());
	}

	@Test
	public void shouldReturnNullIfWePassWrongWheelarType() {
		Vehicle actual = abstractFactoryPattern.getAbstractFactoryInstance(1);
		assertEquals(null, actual);
	}

}
