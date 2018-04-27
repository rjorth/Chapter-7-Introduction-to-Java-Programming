import java.util.Scanner; 

public class ReverseNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter ten numbers: ");
		int[] numbers = new int[10]; 
		
		for(int i = 0; i < 10; i++) {
			
			numbers[i] = input.nextInt(); 
			
		}
		
		for (int i = numbers.length - 1; i >= 0; i--) 
			System.out.print(numbers[i] + " "); 
		

		
	}
	
	
}
