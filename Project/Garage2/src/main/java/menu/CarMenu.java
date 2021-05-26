package menu;

import automobiles.Car;
import garage.Garage;
import utilities.UserInput;

public class CarMenu {

	UserInput scan = UserInput.getInstance();
	Garage myGarage = Garage.getInstance();

	public void create() {
		
		System.out.println("Brand?");
		String brand = scan.getString();
		System.out.println("Colour?");
		String colour = scan.getString();
		System.out.println("Range of tank?");
		int range = scan.getInt();
		System.out.println("How many wheels?");
		int wheels = scan.getInt();
		System.out.println("Horsepower?");
		int power = scan.getInt();

		Car userCar = new Car(brand, colour, range, wheels, power);
		myGarage.addVehicle(userCar);
	}

}
