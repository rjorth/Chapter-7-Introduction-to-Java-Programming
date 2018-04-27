import java.util.Scanner; 

public class DistinctNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter ten numbers: "); 
		
		int[] values = new int[10]; 
		int num = input.nextInt(); 
		int loc = 0;
	
		
		for (int i = 0; i < values.length; i++) { 
			if (isDistinct(values, num)) {
				values[loc++] = num; 
				
				
				
			}
		}
		
		System.out.println("The number of distinc numbers is: " + loc); 
		System.out.println("The distinct numbers are: "); 
		for (int i = 0; i < loc; i++) 
			System.out.print(values[i] + " "); 
		
	}
	
	public static boolean isDistinct(int[] values, int n) {
		
		for (int i : values) {
			
			if (n == i)
				return false; 
		}
		return true; 
	}
	

}
