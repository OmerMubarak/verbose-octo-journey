package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import automobiles.Vehicle;

public interface Dao<T extends Vehicle> {

	T create(T vehicle);

	T read(int id);

	List<T> readAll();

	boolean delete(int id);
	
	T modelResultSet(ResultSet result) throws SQLException;
	
	T modelVehicle(Vehicle vehicle);
}
