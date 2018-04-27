import java.util.Scanner; 

public class Hangman {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String play; 
		
		do {
			char[] word = getWord(); 
			char[] asterisks = new char[word.length]; 
			fill(asterisks); 
			int missed = 0; 
			do {
				char guess = getGuess(asterisks); 
				if (!isCorrect(word, asterisks, guess))
					missed++; 
			}
			while (!isFinished(asterisks)); 
			
			print(word, missed); 
			
			System.out.println("Do you want to play again? Enter y or n>");
			play = input.next(); 
			
		}
		while (play.charAt(0) == 'y'); 
		

	}
	
	public static char getGuess(char[] asterisks) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("(Guess) Enter a letter: ");
		System.out.print(asterisks); 
		System.out.print( " > ");
		String guess = input.next(); 
		return guess.charAt(0); 
	}
	
	public static void print(int m, char guess) {
		System.out.print("\t" + guess);
		switch(m) {
		
		case 1: System.out.println(" is in the word!"); break; 
		case 2: System.out.println(" is not in the word"); break; 
		}
		
	}
	
	public static void print(char[] word, int missed) {
		System.out.print("The word is ");
		System.out.print(word);
		System.out.println(" You missed " + missed + " times");
	}
	
	public static boolean isFinished(char[] blanks) {
		for (char e : blanks) {
			if (e == '*') return false; 
		}
		return true; 
	}
	
	public static boolean isCorrect(char[] word, char[] blanks, char guess) {
		
		boolean correct = false;
		int message = 2;
		for (int i = 0; i < word.length; i++) {
			if (word[i] == guess) {
				correct = true;
				if (blanks[i] == guess)
					message = 1;
				else { 
					blanks[i] = guess; 
					message = 0;
				}
			}
		}
		if (message > 0)
			print(message, guess);
		return correct;
	}
	public static void fill(char[] list) {
		for (int i = 0; i < list.length; i++) {
			list[i] = '*'; 
		}
	}
	public static char[] getWord() {
		String[] words = {"friendship", "adversity", "challenge", "progress", "playful", "burrito", "puppies" };
		String pick = words[(int)(Math.random() * words.length)];
		char[] word = new char[pick.length()];
		for (int i = 0; i < word.length; i++) {
			word[i] = pick.charAt(i); 
		}
		return word; 
	}
		


}
