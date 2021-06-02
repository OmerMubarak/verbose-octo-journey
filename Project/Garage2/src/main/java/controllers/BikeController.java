package controllers;

import java.util.List;
import automobiles.Motorbike;
import dao.BikeDAO;
import utilities.UserInput;

public class BikeController implements GarageController<Motorbike> {
	private BikeDAO bikeDAO;
	private UserInput input = UserInput.getInstance();

	public BikeController(BikeDAO bikeDAO) {
		super();
		this.bikeDAO = bikeDAO;
	}

	public Motorbike create() {
		System.out.println("What's the motorbikes brandname?");
		String brand = input.getString();
		System.out.println("What colour is the bike?");
		String colour = input.getString();
		System.out.println("How much range?");
		int ranges = input.getInt();
		System.out.println("How much cc does it pack?");
		int wheels = input.getInt();
		System.out.println("Sidecar? answer true or false for y/n");
		boolean sideCar = input.getBool();

		Motorbike newBike = new Motorbike(brand, colour, ranges, wheels, sideCar);
		return bikeDAO.create(newBike);
	}

	public boolean delete() {
		readAll();
		System.out.println("ID of the bike you wanna to delete?");
		int id = input.getInt();
		return bikeDAO.delete(id);
	}

	public List<Motorbike> readAll() {
		List<Motorbike> all = bikeDAO.readAll();
		for (Motorbike bike : all) {
			System.out.println(bike);
		}
		return all;
	}

	public Motorbike update() {
		readAll();

		System.out.println("ID of the bike you wish to Update?");
		int id = input.getInt();
		Motorbike myBike = bikeDAO.read(id);
		System.out.println("How much CC does the bike have?");
		myBike.setCc(input.getInt());
		System.out.println("What colour is it?");
		myBike.setColour(input.getString());
		System.out.println("Brand?");
		myBike.setBrand(input.getString());
		System.out.println("Does it have a sidecar?");
		myBike.setSideCar(input.getBool());

		if (bikeDAO.delete(id)) {
			return bikeDAO.create(myBike);
		} else {
			System.out.println("Failed");
			return null;
		}

	}
}
