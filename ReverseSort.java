import java.util.Scanner; 

public class ReverseSort {

	static final int size = 10; 
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		double[] numbers = new double[size]; 
		
		System.out.print("Enter ten numbers: "); 
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble(); 
			
		}
		
		sort(numbers); 
		printArray(numbers, 10); 
	}
	public static void sort(double[] numbers) {
		
		for (int i = numbers.length - 1; i > 1; i--) {
			int index = i; 
			double high = numbers[i]; 
			
			for (int j = i - 1; j > 0; j--) {
				if (high < numbers[j]) {
					index = j;
					high = numbers[j]; 
				}
			}
			if (high != i) {
				double temp = numbers[index]; 
				numbers[index] = numbers[i]; 
				numbers[i] = temp; 
			}
			
		}
		
	}
	public static void printArray(double[] array, int numPerLine) {
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.printf("%5.2f " , array[i]); 
			if ((i + 1) % numPerLine == 0) 
				System.out.println(); 
		}
	}
}

