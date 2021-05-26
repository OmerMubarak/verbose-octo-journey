package automobiles;

public class Motorbike extends Vehicle {

	
	private int cc;
	private boolean sideCar;
	String type;
	public Motorbike(String brand, String colour, int range, int cc, boolean sideCar) {
		super("Motorbike", brand, colour, range);
		this.cc = cc;
		this.sideCar = sideCar;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public boolean isSideCar() {
		return sideCar;
	}
	public void setSideCar(boolean sideCar) {
		this.sideCar = sideCar;
	}
	
	public double calculateCost() {
		return 70;
	}
	@Override
	public String toString() {
		return "Motorbike [cc, brandname, " + cc+ " "+getBrand()  + ", range =" + getRange() + ", colour=" +getColour() +" sideCar=" + sideCar;
	}
	
}
