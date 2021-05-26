package menu;

import garage.Garage;
import utilities.UserInput;

public class Menu {

	UserInput scan = UserInput.getInstance();
	Garage myGarage = Garage.getInstance();
	CarMenu carMenu = new CarMenu();
	MotoMenu motoMenu = new MotoMenu();

	public void start() {
		while (true) {
			System.out.println("What would you like to do?");
			System.out.println("1 - Create");
			System.out.println("2 - Read");
			System.out.println("3 - Delete");
			int input = scan.getInt();
			switch (input) {
			case 1:
				create();
				break;
			case 2:
				read();
				break;
			case 3:
				delete();
				break;
			default:
				start();
			}
		}
	}

	private void create() {
		System.out.println("Create What?");
		System.out.println("1 - Car");
		System.out.println("2 - Motorbike");
		int input = scan.getInt();
		switch (input) {
		case 1:
			carMenu.create();
			break;
		case 2:
			motoMenu.create();
			break;
		default:
			start();

		}
	}

	private void read() {
		myGarage.printGarage();
	}

	private void delete() {
	}

}
