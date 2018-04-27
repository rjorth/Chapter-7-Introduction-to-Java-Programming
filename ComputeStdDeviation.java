import java.util.Scanner; 

public class ComputeStdDeviation {

	static final int size = 10; 
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[size]; 
		
		System.out.println("Enter 10 numbers: ");
		
		for (int i = 0; i < numbers.length; i++) { 
			
			numbers[i] = input.nextDouble(); 
		}
		System.out.println("The mean is " + mean(numbers));
		System.out.println("The standard deviation is " + deviation(numbers));
		

	}
	
	public static double deviation(double[] x) {
		
		double mean = mean(x); 
		double deviation = 0; 
		
		for (int i = 0; i < x.length; i++) {
			
			deviation += Math.pow(x[i] - mean, 2); 
		}
		double std = Math.sqrt(deviation / (x.length - 1)); 
		return std; 
		
		
	}
	
	public static double mean(double[] x) {
		
		double sum = 0; 
		for (int i = 0; i < x.length; i++) { 
			
			sum += x[i]; 
			
		}
		double average = sum / x.length; 
		
		
		return average; 
		
	}
	

}
