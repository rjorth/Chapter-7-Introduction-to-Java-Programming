import java.util.Scanner; 

public class IndexOfSmallest {
	
	static final int size = 10; 

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		double[] numbers = new double[size]; 
		
		System.out.print("Enter 10 numbers: "); 
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble(); 
		}
		System.out.println("The index of the smallest number is: " + indexOfSmall(numbers)); 

	}
	
	public static int indexOfSmall(double[] arr) {
		
		int index = 0; 
		double small = arr[index]; 
		for (int i = 0; i < arr.length; i++) {
			
			if (small > arr[i]) {
				small = arr[i];
				index = i; 
			}
		
		}
		return index;
	}

}
