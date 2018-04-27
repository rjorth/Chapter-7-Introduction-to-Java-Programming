import java.util.Scanner;
public class IdenticalContents {
	

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter list size: ");
		int size = input.nextInt(); 
		
		int[] first_list = new int [size];
		
		System.out.print("Enter first list: ");
		for (int i = 0; i < size; i++) {
			
			first_list[i] = input.nextInt(); 
		}
		int[] second_list = new int [size]; 
		
		System.out.print("Enter second list: ");
		for (int i = 0; i < size; i++) {
			
			second_list[i] = input.nextInt(); 
		}
		if (isIdentical(first_list, second_list)) {
			System.out.println("Identical");
		}
		else {
			System.out.print("Not indentical");
		}
	}
	
	public static boolean isIdentical(int[] list1, int[] list2) {
		
		if (list1.length != list2.length) return false; 
		
		for (int i = 0; i < list1.length; i++) {
			
			if (list1[i] == list2[i]); return true; 
		}
		return false; 
		
	}
	

}