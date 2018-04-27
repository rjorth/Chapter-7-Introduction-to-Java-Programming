import java.util.Scanner; 

public class findSmallest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers: "); 
		
		double[] n = new double[10]; 
		for (int i = 0; i < n.length; i++) {
			n[i] = input.nextDouble(); 
		
		}
		
		System.out.println("The smallest number is: " + min(n)); 
		

	}
	
	public static double min(double[] array) {
		
		double min = array[0]; 
		
		for (int i = 0; i < array.length; i++) {
			
			if (min > array[i]) {
				min = array[i]; 
			}
			
		}
		return min; 
		
	}

}
