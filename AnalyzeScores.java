import java.util.Scanner;

public class AnalyzeScores {
	
	static final int max = 100; 
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		int scores[] = new int[max]; 
		int numScores = 0; 
		
		System.out.print("Enter scores: "); 
		for (int i = 0; i < max; i++) { 
			
			int grade = input.nextInt(); 
			if (grade < 0) break; 
			scores[i] = grade;
			numScores++; 
		}
		scores[numScores] = -1; 
		int average = getAverage(scores, numScores); 
		int aboveOrEqual = getScoresAboveOrEqual(scores, average); 
		
		System.out.println("Number of scores: " + numScores); 
		System.out.println("Average score is: " + average); 
		System.out.println("Scores above average: " + aboveOrEqual); 
		System.out.println("Scores below average: " + (numScores - aboveOrEqual)); 

	}
	
	public static int getAverage(int[] scores, int numScores) {
		
		
		int total = 0; 
		for (int i = 0; scores[i] >= 0; i++) {
			total += scores[i]; 
		}
		
		return total/numScores; 
		
	}
		
	public static int getScoresAboveOrEqual(int[] scores, int average) {
		int count = 0; 
		for (int i = 0; scores[i] >= 0; i++) {
			if (scores[i] >= average) 
				count++; 
		}
		return count; 
	}
		
		
		
		
		
		
		
		
		
		
		
		
	

}
