import java.util.Scanner; 


public class BubbleSort {

	static final int size = 10; 
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter ten numbers: ");
		double[] numbers = new double[size]; 
		
		for (int i = 0; i < numbers.length; i++) {
			
			numbers[i] = input.nextDouble(); 
			
		}
		
		bubbleSort(numbers); 
		for (double k : numbers) 
			System.out.println(k + ""); 
		System.out.println();
		
		

	}
	
	public static void bubbleSort(double[] list) {
		
		double temp;
		boolean swapped; 
		
		do  {
			
			swapped = false; 
			for (int i = 0; i < list.length - 1; i++) {
				
				if (list[i] > list[i + 1]) {
					temp = list[i]; 
					list[i] = list[i + 1]; 
					list[i + 1] = temp; 
					swapped = true; 
				}
			}
		}
		while (swapped); 
		
		
	}

}
















