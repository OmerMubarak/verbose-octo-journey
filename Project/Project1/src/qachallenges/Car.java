package qachallenges;

public class Car extends Vehicle {

	public int passengers = 5;
	public int range = 100;


	public Car(int id, boolean petrol, boolean fourWheels, boolean eightWheels, String brand, int range,
			int passengers) {
		super(id, petrol, fourWheels, eightWheels, brand, range);
		this.passengers = passengers;
		this.range = range;
	}

	public void checkRange() {
		System.out.println(
				"The range of this car is " + this.range + " , While being a petrol car?: " + super.isPetrol()+"\n");
	}

	public int getRange() {
		return range;
	}
	
	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}


	public void setRange(int range) {
		this.range = range;
	}
	
	public void Passengers() {
		System.out.println("This " + super.getBrand() + " car has a capacity of: " +passengers+ " number of passengers!");
	}

	@Override
	public double calculateCost() {
		return this.range*5;
	}

}
