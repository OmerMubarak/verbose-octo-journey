package dbConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Runner {
public static void main(String[] args) {
	String connectionURL = "jdbc:mysql://localhost:3306/some_database";
	
	String username = "root";
	String password = "root";
	Connection con = null;
	
	
	Statement stmt = null;
	
	String query = "SELECT * From games;";
	JDBC dbCon = new JDBC(connectionURL, username, password);
	ResultSet result = dbCon.exQuery(query);
	
	int game_id;
	String game_name;
	int stock;
	int agerating;
	int price;
	
	ArrayList<Game> found = new ArrayList<Game>();
	
	try {
		while(result.next()) {
		game_id = result.getInt(1);
		game_name = result.getString(2);
		stock = result.getInt(3);
		agerating = result.getInt(4);
		price = result.getInt(5);
		found.add(new Game(game_id, game_name, stock, agerating, price));
	}
	}
		catch (SQLException e) {
			e.printStackTrace();
		}
	
	for(Game game: found) {
		System.out.println(game);
	}
	}}
	
