package qachallenges;

public abstract class Vehicle {

		private int id;
		private boolean petrol = false;
		private boolean fourWheels = true;
		private boolean eightWheels = false;
		private String brand;
		private int range;
		

	

		public Vehicle(int id, boolean petrol, boolean fourWheels, boolean eightWheels, String brand, int range) {
			super();
			this.id = id;
			this.petrol = petrol;
			this.fourWheels = fourWheels;
			this.eightWheels = eightWheels;
			this.brand = brand;
			this.range = range;
		}

		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		public int getRange() {
			return range;
		}

		public void setRange(int range) {
			this.range = range;
		}

		public boolean isPetrol() {
			return petrol;
		}

		public void setPetrol(boolean petrol) {
			this.petrol = petrol;
		}

		public boolean isFourWheels() {
			return fourWheels;
		}

		public void setFourWheels(boolean fourWheels) {
			this.fourWheels = fourWheels;
		}

		public boolean isEightWheels() {
			return eightWheels;
		}

		public void setEightWheels(boolean eightWheels) {
			this.eightWheels = eightWheels;
		}

		public void noise() {
			System.out.println("vroom vroom");
		}
		
		public void checkRange() {
			System.out.println("The range of this vehicle is set to null");
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}
		
		public abstract double calculateCost();

		
		

	}


