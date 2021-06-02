package garage;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import automobiles.Car;
import automobiles.Motorbike;
import automobiles.Vehicle;

public class TestGarage {

	Garage testGarage;
	
	@Before
	public void setup() {
		testGarage = Garage.getInstance();
	}

	
	@Test
	public void testGetGarage() {
		assertEquals(new ArrayList<Vehicle>(), testGarage.getGarage());
	}

	@Test
	public void testAddVehicle() {
		Car Lambo = new Car("Aventad", "blue", 90, 4, 999);

		ArrayList<Vehicle> testArray = new ArrayList<Vehicle>();
		testArray.add(Lambo);
		testGarage.addVehicle(Lambo);
		assertEquals(testArray, testGarage.getGarage());
	}

	@Test
	public void testFixVehicleById() {
		Car Lambo = new Car("Aventad", "blue", 90, 4, 999);
		ArrayList<Vehicle> testArray = new ArrayList<Vehicle>();
		testGarage.addVehicle(Lambo);
		testGarage.fixVehicleById(0);
		assertEquals(testArray, testGarage.getGarage());
	}
	
	@Test
	public void testDisplayVehicleId() {
		Car Lambo = new Car("Aventad", "blue", 90, 4, 999);
		testGarage.addVehicle(Lambo);
		testGarage.displayVehicleById(Lambo);
		assertEquals("Aventad", Lambo.getBrand());
	}
	
	@Test
	public void testPrintGarage() {
		Car Lambo = new Car("Aventad", "blue", 90, 4, 999);
		Motorbike Ducat = new Motorbike("Scram", "red", 100, 670, false);
		ArrayList<Vehicle> testArray = new ArrayList<Vehicle>();
		testArray.add(Lambo);
		testGarage.addVehicle(Lambo);
		testGarage.addVehicle(Ducat);
		testGarage.removeByType("Motorbike");
		assertEquals(testArray, testGarage.getGarage());
	}
	
	@Test
	public void testCalculateCostById() {
		Car Lambo = new Car("Aventad", "blue", 90, 4, 999);
		testGarage.addVehicle(Lambo);
		testGarage.calculateCostById(0);
		double number = testGarage.calculateCostById(0);
		double output = Lambo.calculateCost();
		assertEquals(150, number, 0.01);
	}

	@After
	public void garageEmpty() {
		testGarage.emptyGarage();
		System.out.println("Garage is Emptied");
		System.out.println("New test begin.");
		
	}
}
