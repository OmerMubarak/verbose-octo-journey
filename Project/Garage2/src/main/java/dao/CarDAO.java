package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import automobiles.Car;
import automobiles.Vehicle;
import dbconnection.JDBC;

public class CarDAO implements Dao<Car> {

	JDBC jdbc = JDBC.getInstance("jdbc:mysql://localhost:3306/garage", "root", "root");

	public Car modelResultSet(ResultSet result) throws SQLException {
		String brand = result.getString(1);
		String colour = result.getString(2);
		int ranges = result.getInt(3);
		int wheels = result.getInt(4);
		int power = result.getInt(5);
		return new Car(brand, colour, ranges, wheels, power);
	}

	public Car create(Car vehicle) {
		String query = "Insert into Cars(brand,colour,ranges,wheels,power) VALUES ('" + vehicle.getBrand() + "','"
				+ vehicle.getColour() + "'," + vehicle.getRange() + "," + vehicle.getWheels() + "," + vehicle.getPower()
				+ ");";
		if (jdbc.exUpdate(query)) {
			return vehicle;
		} else {
			return new Car(null, null, 0, 0, 0);
		}
	}

	public Car read(int id) {
		String query = "SELECT * FROM CARS WHERE ID=" + id;
		ResultSet result = jdbc.exQuery(query);
		try {
			result.next();
			return modelResultSet(result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new Car(null, null, 0, 0, 0);
	}

	public ArrayList<Car> readAll() {
		String query = "SELECT * FROM CARS;";
		ArrayList<Car> cars = new ArrayList<Car>();
		ResultSet result = jdbc.exQuery(query);
		try {
			while (result.next()) {
				cars.add(modelResultSet(result));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cars;
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Car modelVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return null;
	}

}
