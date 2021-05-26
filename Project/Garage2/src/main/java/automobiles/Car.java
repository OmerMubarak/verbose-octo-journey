package automobiles;

public class Car extends Vehicle {

	private int wheels;
	private int power;

	public Car(String brand, String colour, int range, int wheels, int power) {
		super("Car", brand, colour, range);
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


	
	
}
