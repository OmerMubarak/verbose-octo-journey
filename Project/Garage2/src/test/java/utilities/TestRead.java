package utilities;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import garage.Garage;
import menu.Menu;

@RunWith(MockitoJUnitRunner.class)
public class TestRead {

	@Mock
	private UserInput scan;

	@Mock
	private Garage myGarage;

	@InjectMocks
	private Menu menu;

	@Test
	public void testRead() {
		when(scan.getInt()).thenReturn(2);
		menu.start();
		verify(scan, times(1)).getInt();
	}

}
