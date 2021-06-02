package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	private static String connectionURL;
	private String username;
	private String password;

	private Statement stmt;
	private Connection con;

	public JDBC(String connectionURL, String username, String password) {
		try {
			con = DriverManager.getConnection(connectionURL, username, password);
		} catch (SQLException e) {
			con = null;
			e.printStackTrace();
		}
	}

	private static JDBC instance = null;
	
	public static JDBC getInstance(String connectionURL, String username, String password) {
		if (instance == null) {
			instance = new JDBC(connectionURL, username, password);
		}
		return instance;
	}

	public ResultSet exQuery(String query) {
		ResultSet result = null;
		try {
			stmt = con.createStatement();
			result = stmt.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public boolean exUpdate(String query) {
		try {
			stmt = con.createStatement();
			stmt.executeUpdate(query);
			return true;
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
