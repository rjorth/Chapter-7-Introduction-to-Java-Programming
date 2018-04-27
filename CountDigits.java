
public class CountDigits {

	public static void main(String[] args) {
		
		int[] randoms = new int[100]; 
		int[] occ = new int[10]; 
		
		for (int i = 0; i < 100; i++) {
			
			int n = (int)(Math.random() * 10); 
			randoms[i] = n; 
			occ[n]++; 
		}
		
		for (int i = 0; i < 100; i++) {
			
			System.out.print(randoms[i] + " "); 
			if ((i + 1) % 10 == 0) 
				System.out.println(""); 
		}
		
		System.out.println("--------------------------"); 
		for (int i = 0; i < 10; i++) {
			System.out.println("Occurences of " + i + " = " + occ[i]); 
		}
		

	}
	
	public static void printArray(int[] arr, int numPerLine) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%4d", arr[i]);
			if ((i + 1) % numPerLine == 0) 
				System.out.println(""); 
		}
	}

}
