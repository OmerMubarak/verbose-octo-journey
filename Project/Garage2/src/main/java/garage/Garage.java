package garage;

import java.util.ArrayList;

import automobiles.Vehicle;

public class Garage {

	ArrayList<Vehicle> myGarage = new ArrayList<Vehicle>();

	private static Garage instance = null;

	private Garage() {
	}

	public static Garage getInstance() {
		if (instance == null) {
			instance = new Garage();
		}
		return instance;
	}

	public void addVehicle(Vehicle vehicle) {
		myGarage.add(vehicle);
	}

	public void displayVehicleById(Vehicle vehicle) {
		for (Vehicle i : myGarage) {

			System.out.println(i.getBrand());
		}
	}

	public void printGarage() {
		for (Vehicle i : myGarage) {
			System.out.println(i);
		}
	}

	public void removeByType(String type) {
		Vehicle found = null;
		for (Vehicle vehicle : myGarage) {
			if (vehicle.getType() == type) {
				found = vehicle;
			}
		}
		myGarage.remove(found);
	}

	public void removeById(int id) {
		Vehicle found = null;
		for (Vehicle vehicle : myGarage) {
			if (vehicle.getId() == id) {
				found = vehicle;
			}
		}
		myGarage.remove(found);
	}

	public double calculateCostById(int id) {
		for (Vehicle vehicle : myGarage) {
			if (vehicle.getId() == id) {
				return vehicle.calculateCost();
			}
		}
		return 0;
	}

	public void fixVehicleById(int id) {
		for (Vehicle vehicle : myGarage) {
			if (vehicle.getId() == id)
				System.out.println("This " + vehicle.getBrand() + " costs" + vehicle.calculateCost()
						+ " to repair. How would you like to pay.");
		}
		removeById(id);
	}

	public void emptyGarage() {
		myGarage.clear();
	}
	
	public ArrayList<Vehicle> getGarage() {
		return myGarage;
	}
}
