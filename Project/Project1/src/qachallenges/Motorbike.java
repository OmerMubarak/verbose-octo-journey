package qachallenges;

public class Motorbike extends Vehicle {

	public int range = 170;
	
	public Motorbike(int id, boolean petrol, boolean fourWheels, boolean eightWheels, String brand, int range) {
		super(id, petrol, fourWheels, eightWheels, brand, range);
		this.range = range;
	}
	
	@Override
	public void checkRange() {
		System.out.println(
				"The range of "+ super.getBrand() + " motorbike is " + range + " and has four wheels, correct?: " + super.isFourWheels() + "\n");
	}
	public int getRange() {
		return range;
	}
	
	public void calculateBill(int range) {
		this.calculateBill(range*2);
	}

	public void setRange(int range) {
		this.range = range;
	}
	
	public void exhaustNote() {
		System.out.println(super.getBrand() + " - with an upgraded exhaust goes VRAAM VRAAAM, VRAM VRAM VRAAAAAM \n");
	}

	@Override
	public void noise() {
		System.out.println("A " + super.getBrand() + " makes this kind of noise - bvraaaaaaaaaam bvraaaaaaaaaaaam \n");
	}

	@Override
	public double calculateCost() {
		return this.range*4;
	}

}
