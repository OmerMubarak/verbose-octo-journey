package garage;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import automobiles.Car;
import automobiles.Vehicle;

public class TestGarage {
	
	
	Garage testGarage = Garage.getInstance();
	
	@Test
	public void testGetGarage() {
		assertEquals(new ArrayList<Vehicle>(),testGarage.getGarage());
	}
	
	@Test
	public void testAddVehicle() {
		Car Lambo = new Car("Aventad", "blue", 90,4,999);
		
		ArrayList<Vehicle> testArray = new ArrayList<Vehicle>();
		testArray.add(Lambo);
		testGarage.addVehicle(Lambo);
		assertEquals(testArray, testGarage.getGarage());
	}
	
	@public void testDisplayVehicleById() {
		Car Lambo = new Car("Aventad", "blue", 90,4,999);
		ArrayList<Vehicle> testArray = new ArrayList<Vehicle>();
		testArray.add(Lambo);
		testGarage.addVehicle(Lambo);

	}
}
