import java.util.Scanner; 

public class StrictlyIdentical {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the first list: ");
		int size = input.nextInt(); 
		System.out.print("Enter list 1:");
		int[] first_list = new int[size]; 
		 
		
		for (int i = 0; i < first_list.length; i++) {
			
			first_list[i] = input.nextInt(); 
		}
		System.out.print("Enter list 2: "); 
		int[] second_list = new int[size];
		
		for (int i = 0; i < second_list.length; i++) {
			
			second_list[i] = input.nextInt(); 
		}
		
		if (equals(first_list, second_list)) {
			System.out.print("Strictly Identical");
		}
		else {
			System.out.print("Not strictly identical"); 
		}
		
		
	}
	
	public static boolean equals(int[] list1, int[] list2) {
		
		if (list1.length != list2.length) return false; 
		
		for (int i = 0; i < list1.length; i++) {
			if (list1[i] != list2[i]) return false; 
		}
		return true; 
	}
}
			
		
	
	

