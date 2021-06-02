package controllers;

import java.util.List;
import automobiles.Car;
import dao.CarDAO;
import utilities.UserInput;

public class CarController implements GarageController<Car> {

	private CarDAO carDAO;
	private UserInput input = UserInput.getInstance();

	public CarController(CarDAO carDAO) {
		super();
		this.carDAO = carDAO;
	}

	public Car create() {
		System.out.println("What's the cars brand?");
		String brand = input.getString();
		System.out.println("What colour is it?");
		String colour = input.getString();
		System.out.println("How much range?");
		int ranges = input.getInt();
		System.out.println("How many wheels?");
		int wheels = input.getInt();
		System.out.println("How much power?");
		int power = input.getInt();

		Car newCar = new Car(brand, colour, ranges, wheels, power);
		return carDAO.create(newCar);
	}

	public boolean delete() {
		readAll();
		System.out.println("ID of the car you wish to delete?");
		int id = input.getInt();
		return carDAO.delete(id);
	}

	public List<Car> readAll() {
		List<Car> all = carDAO.readAll();
		for (Car car : all) {
			System.out.println(car);
		}
		return all;
	}

	public Car update() {
		readAll();

		System.out.println("ID of the car you wish to Update?");
		int id = input.getInt();
		Car myCar = carDAO.read(id);
		System.out.println("How many wheels does the car have?");
		myCar.setWheels(input.getInt());
		System.out.println("What colour is it?");
		myCar.setColour(input.getString());
		System.out.println("Brand?");
		myCar.setBrand(input.getString());
		System.out.println("How many horsepower?");
		myCar.setPower(input.getInt());

		if (carDAO.delete(id)) {
			return carDAO.create(myCar);
		} else {
			System.out.println("Failed");
			return null;
		}
	}

}
