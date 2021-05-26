package qachallenges;

public class BottlesBeer {

	public static void main(String[] args) {
		bottlesOfBeer();
	}

	private static void bottlesOfBeer() {
		for(int i = 99; i > 0; i--) {
			System.out.println(i + " bottles of beer on the wall, "+ i+ "bottles of beer."+
					"Take one down and pass it around," + (i-1)+ "bottles of beer on the wall.");
			if (i == 1 ) {
				System.out.println("No more bottles of beer on the wall, no more bottles of beer."+
						"Go to the store and buy some more, 99 bottles of beer on the wall.");
			}
	} 
		
	}
	
}
