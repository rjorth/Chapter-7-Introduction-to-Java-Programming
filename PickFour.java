
public class PickFour {
	
	static String[] suit = {"Spades", "Hearts", "Diamonds", "Clubs"}; 
	static String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack",
			"Queen", "King"}; 
	

	public static void main(String[] args) {
		
		int sum = 0; 
		int cardCount = 0; 
		String[] cards = new String[4]; 
		
		while (sum != 24 || cardCount != 4) {
			
			if (sum != 24 || cardCount > 3) {
				cardCount = 0; 
				sum = 0; 
			}
			
			int suitIndex = getRandomSuit(); 
			int rankIndex = getRandomRank(); 
			
			cards[cardCount] = getCard(rankIndex, suitIndex); 
			System.out.println("Points = " + (rankIndex + 1)); 
			sum += rankIndex + 1; 
			cardCount++; 
		}
		for (int i = 0; i < cards.length; i++) {
			System.out.println(cards[i] + " = " + i + " points");
			
		}
		System.out.println("sum = " + sum); 
	}
	
	public static String getCard(int rankIndex, int suitIndex) {
		return rank[rankIndex] + " of " + suit[suitIndex]; 
	}
	public static String getRandomCard() {
		int suitIndex = getRandomSuit(); 
		int rankIndex = getRandomRank(); 
		
		return rank[rankIndex] + " of " + suit[suitIndex]; 
	}
	public static int getRandom() {
		return (int)(Math.random() * 52); 
	}
	public static int getRandomSuit() {
		return getRandom() / 13; 
	}
	public static int getRandomRank() {
		return getRandom() % 13; 
	}
	
}
