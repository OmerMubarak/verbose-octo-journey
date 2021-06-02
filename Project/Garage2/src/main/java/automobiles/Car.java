package automobiles;

public class Car extends Vehicle {

	private int wheels;
	private int power;

	public Car(String brand, String colour, int ranges, int wheels, int power) {
		super("Car", brand, colour, ranges);
		this.wheels = wheels;
		this.power = power;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public double calculateCost() {
		return 150;
	}

	@Override
	public String toString() {
		return "Car [brand=" + getBrand() + ",colour=" + getColour() +",wheels=" + wheels + ", power=" + power + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (power != other.power)
			return false;
		if (wheels != other.wheels)
			return false;
		return true;
	}


	
	
}
