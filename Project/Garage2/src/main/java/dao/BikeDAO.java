package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import automobiles.Motorbike;
import automobiles.Vehicle;
import dbconnection.JDBC;

public class BikeDAO implements Dao<Motorbike> {

	JDBC jdbc = JDBC.getInstance("jdbc:mysql://localhost:3306/garage", "root", "root");

	public Motorbike modelResultSet(ResultSet result) throws SQLException {
		String brand = result.getString(1);
		String colour = result.getString(2);
		int ranges = result.getInt(3);
		int cc = result.getInt(4);
		boolean sidecar = result.getBoolean(5);
		return new Motorbike(brand, colour, ranges, cc, sidecar);
	}

	public Motorbike create(Motorbike vehicle) {
		String query = "Insert into Bikes(brand,colour,ranges,cc,sidecar) VALUES ('" + vehicle.getBrand() + "','"
				+ vehicle.getColour() + "'," + vehicle.getRange() + "," + vehicle.getCc() + "," + vehicle.isSideCar()
				+ ");";
		if (jdbc.exUpdate(query)) {
			return vehicle;
		} else {
			return new Motorbike(null, null, 0, 0, false);
		}
	}

	public Motorbike read(int id) {
		String query = "SELECT * FROM Bikes WHERE ID=" + id;
		ResultSet result = jdbc.exQuery(query);
		try {
			result.next();
			return modelResultSet(result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new Motorbike(null, null, 0, 0, false);
	}

	public List<Motorbike> readAll() {
		String query = "SELECT * FROM Bikes;";
		ArrayList<Motorbike> bikes = new ArrayList<Motorbike>();
		ResultSet result = jdbc.exQuery(query);
		try {
			while (result.next()) {
				bikes.add(modelResultSet(result));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bikes;
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Motorbike modelVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return null;
	}

}
