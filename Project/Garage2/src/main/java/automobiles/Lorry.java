package automobiles;

public class Lorry extends Vehicle {

	private String heavyDuty;
	private double height;

	public Lorry(String type, String brand, String colour, int range, String heavyDuty, double height) {
		super("Lorry", brand, colour, range);
		this.heavyDuty = heavyDuty;
		this.height = height;
	}

	public String getHeavyDuty() {
		return heavyDuty;
	}

	public void setHeavyDuty(String heavyDuty) {
		this.heavyDuty = heavyDuty;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double calculateCost() {
		return 250;
	}
}
