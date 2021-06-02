package main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import automobiles.Car;
import automobiles.Motorbike;
import dbconnection.JDBC;
import menu.Menu;


public class Runner {

	public static void main(String[] args) {

		String connectionURL = "jdbc:mysql://localhost:3306/garage";

		String username = "root";
		String password = "root";
		Connection con = null;

		Statement stmt = null;

		String query = "SELECT * From cars;";
		JDBC dbCon = new JDBC(connectionURL, username, password);
		ResultSet result = dbCon.exQuery(query);

		String brand;
		String colour;
		int ranges;
		int wheels;
		int power;
		int cc;
		boolean sideCar;

		ArrayList<Car> found = new ArrayList<Car>();
		ArrayList<Motorbike> found1 = new ArrayList<Motorbike>();

		try {
			while (result.next()) {
				brand = result.getString(1);
				colour = result.getString(2);
				ranges = result.getInt(3);
				wheels = result.getInt(4);
				power = result.getInt(5);
				found.add(new Car(brand, colour, ranges, wheels, power));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			while (result.next()) {
				brand = result.getString(1);
				colour = result.getString(2);
				ranges = result.getInt(3);
				cc = result.getInt(4);
				sideCar = result.getBoolean(5);
				found1.add(new Motorbike(brand, colour, ranges, cc, sideCar));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		for (Car v : found) {
			System.out.println(v);
		}
		for (Motorbike v : found1) {
			System.out.println(v);
		}

		Menu menu = new Menu();
		menu.start();
		System.out.println("See ya.");

	}
}
