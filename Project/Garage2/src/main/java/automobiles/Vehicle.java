package automobiles;

public abstract class Vehicle {

	private int id;
	private String type;
	private String brand;
	private String colour;
	private int counter = 0;
	private int ranges;

	public Vehicle(String type, String brand, String colour, int ranges) {
		super();
		id = ++counter;
		this.setType(type);
		this.brand = brand;
		this.colour = colour;
		this.ranges = ranges;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getRange() {
		return ranges;
	}

	public void setRange(int ranges) {
		this.ranges = ranges;
	}

	public abstract double calculateCost();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
