
public class PrimeNumbers {

	public static void main(String[] args) {
		
		int[] primes = new int[50]; 
		
		int index = 0; 
		
		for (int i = 2; index < 50; i++) {
			
			if(isPrime(i)) {
				primes[index++] = i; 
			}
			
		}
		
		printArray(primes, 10); 

	}
	
	public static boolean isPrime(int num) {
		
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) 
				return false; 
		}
		return true; 
		
	}
	
	public static void printArray(int[] arr, int numPerLine) {
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.printf("%10d ", arr[i]); 
			if ((i + 1) % numPerLine == 0) 
				
				System.out.println(""); 
		}
		
	}

}
