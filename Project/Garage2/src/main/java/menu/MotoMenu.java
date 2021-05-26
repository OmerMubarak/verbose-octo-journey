package menu;

import automobiles.Motorbike;
import garage.Garage;
import utilities.UserInput;

public class MotoMenu {

	UserInput scan = UserInput.getInstance();
	Garage myGarage = Garage.getInstance();

	public void create() {

		System.out.println("Brand?");
		String brand = scan.getString();
		System.out.println("Colour?");
		String colour = scan.getString();
		System.out.println("Range of tank?");
		int range = scan.getInt();
		System.out.println("Cubic Capacity?");
		int cc = scan.getInt();
		System.out.println("Does it have a side car? (yes or no)");
		boolean sideCar = scan.getBool();
		scan.getString();

		Motorbike userMoto = new Motorbike(brand, colour, range, cc, sideCar);
		myGarage.addVehicle(userMoto);
	}

}
