import java.util.Scanner; 

public class RandomNumberChooser {

	static final int size = 10; 
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[size]; 
		System.out.print("Enter ten numbers: "); 
		
		for (int i = 0; i < numbers.length; i++) {
			
			numbers[i] = input.nextInt(); 
		}
		
		System.out.println("Random number: " + getRandom(numbers));

	}
	
	public static int getRandom(int... numbers) {
		
		int random = (int) (Math.random() * 54 + 1); 
		for (int i = 0; i < numbers.length; i++) {
			
			if (random == numbers[i]) {
				random = (int)(Math.random() * 54 + 1); 
				i = -1; 
			}
		}
		return random; 
		
	}

}
