package org.yash.question17;

public class TwoVehicle implements Vehicle {
	public TwoVehicle() {
		System.out.println("TwoVehicle constructor called.!");
	}

	@Override
	public String getVehicleType() {
		return "TwoVehicle";
	}
}
