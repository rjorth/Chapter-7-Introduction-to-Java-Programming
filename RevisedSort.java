import java.util.Scanner; 

public class RevisedSort {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		double[] numbers = new double[10]; 
		
		System.out.print("Enter 10 numbers: "); 
		for (int i = 0; i < numbers.length; i ++) {
			
			numbers[i] = input.nextInt(); 
			
		}
		selectionSort(numbers); 
		
		for (double e : numbers) 
			System.out.print(e + " "); 
		System.out.println(); 
		

	}
	public static void selectionSort(double[] list) {
		
		for (int i = list.length - 1; i >= 0 ; i --) {
			double max = list[i]; 
			int maxIndex = i; 
			
			for (int j = i - 1; j >= 0; j++) {
				
				list[maxIndex] = list[i];
				list[i] = max; 
				
			}
		}
	}

}
