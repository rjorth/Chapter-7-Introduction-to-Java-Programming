
public class FourofaKind {

	public static void main(String[] args) {
		
		boolean spades = false; 
		boolean hearts = false; 
		boolean diamond = false; 
		boolean clubs = false; 
		
		String[] cardOrder = new String[4]; 
		int index = 0; 
		int pickCount = 0; 
		
		while(!spades || !hearts || !diamond || !clubs) {
			
			String card = revealCard(getCard()); 
			pickCount++; 
			
			if (card.contains("Spades") && !spades) {
				cardOrder[index++] = card;
				spades = true; 
			}
			else if (card.contains("Hearts") && !hearts) {
				cardOrder[index++] = card; 
				hearts = true; 
			}
			else if (card.contains("Diamond") && !diamond) {
				cardOrder[index++] = card; 
				diamond = true; 
			}
			else if (card.contains("Clubs") && !clubs) {
				cardOrder[index++] = card; 
				clubs = true; 
			}
			
		}
		for (int i = 0; i < cardOrder.length; i++) {
			System.out.println(cardOrder[i]);
		}
		System.out.println("Pick count = " + pickCount); 

	}
	
	public static int getCard() {
		return (int)(Math.random() * 52); 
	}
	public static String revealCard(int cardNum) {
		
		String[] suit = {"Spades", "Hearts", "Diamonds", "Clubs",}; 
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
				"King"}; 
		
		int suitNum = cardNum / 13; 
		int rankNum = cardNum % 13; 
		
		return ranks[rankNum] + " of " + suit[suitNum]; 
		}
	}


