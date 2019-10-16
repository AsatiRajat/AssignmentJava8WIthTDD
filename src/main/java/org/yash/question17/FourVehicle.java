package org.yash.question17;

public class FourVehicle implements Vehicle {
	public FourVehicle() {
		System.out.println("FourVehicle constructor called.!");
	}

	@Override
	public String getVehicleType() {
		return "FourVehicle";
	}
}
