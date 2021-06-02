package utilities;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import automobiles.Car;
import garage.Garage;
import menu.CarMenu;

@RunWith(MockitoJUnitRunner.class)
public class TestCarUserInput {

	Garage testGarage;

	@Mock
	private UserInput scan;

	@Mock
	private Garage myGarage;

	@InjectMocks
	private CarMenu carMenu;

	@Test
	public void testCreate() {
		when(scan.getString()).thenReturn("BmW", "Red");
		when(scan.getInt()).thenReturn(100, 4, 100);

		carMenu.create();

		Car testCar = new Car("BmW", "Red", 100, 4, 100);
		verify(myGarage, times(1)).addVehicle(testCar);

	}
}
