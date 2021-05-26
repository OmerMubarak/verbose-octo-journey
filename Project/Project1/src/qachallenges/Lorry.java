package qachallenges;

public class Lorry extends Vehicle{
		
		private boolean workuse = true;
		private int range = 300;

		public Lorry(int id, boolean petrol, boolean fourWheels, boolean eightWheels,String brand, boolean workuse,int range) {
			super(id, eightWheels, petrol, fourWheels, brand, range);
			this.workuse = workuse;
			this.range = range;
		}

		public boolean isWorkuse() {
			return workuse;
		}

		public void setWorkuse(boolean workuse) {
			this.workuse = workuse;
		}

		public int getRange() {
			return range;
		}

		public void setRange(int range) {
			this.range = range;
		}

		public void checkRange(){
			System.out.println("The range of this behemoth is: " +range+ "miles, That means that it is available for work use correct?: " + workuse );
		}

		@Override
		public double calculateCost() {
			return this.range*9;

		}
}
