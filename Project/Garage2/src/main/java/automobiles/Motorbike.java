package automobiles;

public class Motorbike extends Vehicle {

	private int cc;
	private boolean sideCar;
	String type;

	public Motorbike(String brand, String colour, int ranges, int cc, boolean sideCar) {
		super("Motorbike", brand, colour, ranges);
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
		return "Motorbike [cc, brandname, " + cc + " " + getBrand() + ", range =" + getRange() + ", colour="
				+ getColour() + " sideCar=" + isSideCar();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motorbike other = (Motorbike) obj;
		if (cc != other.cc)
			return false;
		if (sideCar != other.sideCar)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}
