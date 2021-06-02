package dbConnector;

public class Game {
	private int game_id;
	private String game_name;
	private int stock;
	private int agerating;
	private int price;

	public Game(int game_id, String game_name, int stock, int agerating, int price) {
		super();
		this.game_id = game_id;
		this.game_name = game_name;
		this.stock = stock;
		this.agerating = agerating;
		this.price = price;
	}
	
	public int getGame_id() {
		return game_id;
	}
	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}
	public String getGame_name() {
		return game_name;
	}
	public void setGame_name(String game_name) {
		this.game_name = game_name;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getAgerating() {
		return agerating;
	}
	public void setAgerating(int agerating) {
		this.agerating = agerating;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Game [game_id=" + game_id + ", game_name=" + game_name + ", stock=" + stock + ", agerating=" + agerating
				+ ", price=" + price + "]";
	}

	
	
}
