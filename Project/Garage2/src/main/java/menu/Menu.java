package menu;

import controllers.BikeController;
import controllers.CarController;
import controllers.GarageController;
import dao.BikeDAO;
import dao.CarDAO;
import utilities.UserInput;

public class Menu {

	GarageController<?> activeController;
	CarController carController;
	BikeController bikeController;
	UserInput input = UserInput.getInstance();

	public Menu() {
		CarDAO carDAO = new CarDAO();
		carController = new CarController(carDAO);
		BikeDAO bikeDAO = new BikeDAO();
		bikeController = new BikeController(bikeDAO);
	}

	public void start() {
		boolean exit = false;
		do {
			System.out.println("1) Car");
			System.out.println("2) Motorbike");
			System.out.println("3) Exit");

			int selection = input.getInt();

			switch (selection) {
			case 1:
				activeController = carController;
				action();
				break;
			case 2:
				activeController = bikeController;
				action();
				break;
			case 3:
				exit = true;
			}
		} while (!exit);
	}

	public void action() {
		boolean back = false;
		do {
			System.out.println("what do you want to do?");
			System.out.println("1) Create");
			System.out.println("2) Delete");
			System.out.println("3) Read All");
			System.out.println("4) Update");
			System.out.println("5) Return");

			int selection = input.getInt();

			switch (selection) {
			case 1:
				activeController.create();
				break;
			case 2:
				activeController.delete();
				break;
			case 3:
				activeController.readAll();
				break;
			case 4:
				activeController.update();
				break;
			case 5:
				back = true;
			}
		} while (!back);
	}

}
