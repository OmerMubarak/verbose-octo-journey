package qachallenges;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> myGarage = new ArrayList<>();

	private static Garage instance = null;

	public void addVehicle(Vehicle newVehicle) {
		myGarage.add(newVehicle);
	}

	public void removeByType(int id) {
		myGarage.removeIf(newVehicle -> newVehicle.getId() == (id));
	}

	public boolean fixVehicle(Vehicle newVehicle) {

		for (myGarage.indexOf(newVehicle);;) {
			System.out.println("The fix price for " + newVehicle.getBrand() + " is around "
					+ (newVehicle.getRange() * 10) + "Pounds");
			break;
		}
		return false;
	}

	public void fixVehicleById(int id) {
		for (Vehicle vehicle : myGarage) {
			if (vehicle.getId() == id)
				System.out.println("This " + vehicle.getBrand() + " costs" + vehicle.calculateCost());
		}
	}

	public void emptyGarage() {
		myGarage.clear();
	}

	public boolean removeVehicles(Vehicle newVehicle) {
		for (myGarage.indexOf(newVehicle);;) {
			myGarage.remove(myGarage.indexOf(newVehicle));
			return false;
		}
	}

	public void removeById(int id) {
		{

			for (Vehicle vehicle : myGarage) {
				if (vehicle.getId() == id)
					myGarage.remove(vehicle);
			}
		}
	}

	public void printGarage() {
		for (Vehicle newVehicle : myGarage) {
			System.out.println(newVehicle);
		}
	}

	public boolean getTheVehicles() {
		for (Vehicle i : myGarage) {
			System.out.println(i.getBrand());
		}
		return false;
	}

	public void setTheVehicles(ArrayList<Vehicle> i) {
		this.myGarage = i;
	}

}

//public ArrayList<Vehicle> getTheVehicles() {
//	for (Vehicle i: theVehicles) {
//		System.out.println(i.getBrand());
//		if (i.isFourWheels() == true) {
//			System.out.println("The four wheeler bill is: " + (i.getRange()*3));
//			}
//		if (i.isEightWheels() == true) {
//			System.out.println("The eight wheeler bill is: " + (i.getRange()*4));
//		}
//		if (i.isFourWheels() == false) {
//			System.out.println("The moto bill is : " + (i.getRange()*2));
//		}
//		}
//	return theVehicles;
//	}
