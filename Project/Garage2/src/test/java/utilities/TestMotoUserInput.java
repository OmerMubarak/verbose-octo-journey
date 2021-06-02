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

import automobiles.Motorbike;
import garage.Garage;
import menu.MotoMenu;

@RunWith(MockitoJUnitRunner.class)
public class TestMotoUserInput {

	Garage testGarage;

	@Mock
	private UserInput scan;

	@Mock
	private Garage myGarage;

	@InjectMocks
	private MotoMenu motoMenu;

	@Test
	public void testCreate() {
		when(scan.getString()).thenReturn("suzuki", "blue");
		when(scan.getInt()).thenReturn(101,200);
		when(scan.getBool()).thenReturn(true);
		

		motoMenu.create();

		Motorbike testMoto = new Motorbike("suzuki", "blue", 101,200,true);
		verify(myGarage, times(1)).addVehicle(testMoto);

	}
}
