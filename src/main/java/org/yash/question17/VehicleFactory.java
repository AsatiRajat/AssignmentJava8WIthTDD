package org.yash.question17;

public class VehicleFactory {

	public Vehicle getAbstractFactoryInstance(int numberOfWheels) {

		Vehicle vehicle = null;

		if (numberOfWheels == 2) {
			vehicle = new TwoVehicle();
		} else if (numberOfWheels == 4) {
			vehicle = new FourVehicle();
		}

		return vehicle;
	}

}

// switch (numberOfWheels) {
// case 2:
// vehicle = new TwoVehicle();
// break;
// case 4:
// vehicle = new FourVehicle();
// break;
// default:
// break;
// }
