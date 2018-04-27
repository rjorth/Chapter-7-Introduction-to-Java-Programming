import java.util.Scanner; 

public class AverageAnArray {
	
	static final int size = 10; 

	public static void main(String[] args) {
		
		double[] nums = new double[size]; 
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter 10 numbers: "); 
		for (int i = 0; i < nums.length; i++) 
			nums[i] = input.nextDouble(); 
		
		System.out.println("The average value is: " + average(nums));  

	}
	
	public static int average(int[] array) {
		
		int total = 0; 
		for (int i = 0; i < array.length; i++) {
			total += array[i]; 
		}
		return total / array.length; 
		
	}
	
	public static double average(double[] array) {
		
		//sum of all numbers
		double total = 0; 
		for (int i = 0; i < array.length; i++) {
			total += array[i]; 
			//sums all the numbers that are in the array 
		}
		return total / array.length;
	}
	
	public static void printArray(int[] array, int numPerLine) {
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.printf("%4d", array[i]); 
			if ((i + 1) % numPerLine == 0) 
			System.out.println(""); 
		}
		
	}
}


