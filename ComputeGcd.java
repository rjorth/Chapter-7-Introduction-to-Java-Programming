import java.util.Scanner; 

public class ComputeGcd {

	static final int capacity = 5; 
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 numbers: "); 
		int[] arr = new int[capacity]; 
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = input.nextInt(); 
		}
		
		System.out.println("The greatest common denominator of these numbers is: " + gcd(arr));
		

	}
	
	public static int gcd(int... numbers) {
		
		int gcd = 1; 
		boolean isDivisor; 
		int min = numbers[0];
		for (int j : numbers) {
			if (j < min)
				min = j;
		
		for (int i = 2; i < min; i++) {
			
			isDivisor = true; 
			for (int k : numbers) {
				if (k % i != 0) 
					isDivisor = false; 
			}
			if(isDivisor)
				gcd = i; 
		}
		 
		}
		return gcd;
	}
}
	
		
	
	
	


