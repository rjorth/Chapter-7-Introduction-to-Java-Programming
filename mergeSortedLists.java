import java.util.Scanner; 

public class mergeSortedLists {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of list: ");
		int size = input.nextInt(); 
		System.out.print("Enter first list");
		int[] first_list = new int[size];
		for (int i = 0; i < size; i++) {
			
			first_list[i] = input.nextInt(); 
			
		}
		System.out.print("Enter second list");
		int[] second_list = new int[size]; 
		for (int i = 0; i < size; i++) {
			
			second_list[i] = input.nextInt(); 
		}
		
		int[] list3 = merge(first_list, second_list); 
		for (int e : list3) {
			System.out.print(" " + e);
			
		}
		System.out.println(); 
		
		

	}
	
	public static int[] merge(int[] list1, int[] list2) {
		
		int[] list3 = new int[list1.length + list2.length];
		
		for (int i = 0; i < list1.length; i++) {
			list3[i] = list1[i]; 
		}
		for (int i = 0, jj = list1.length; i < list2.length; i++, jj++) {
			
			list3[jj] = list1[i]; 
		}
		sort(list3); 
		
		return list3; 
		
	}
	public static void sort(int[] list) {
		
		for (int i = 0; i < list.length - 1; i ++) {
			 
			int min = list[i]; 
			int minIndex = i; 
			
			for (int jj = i + 1; jj < list.length; jj++) {
				if (list[jj] < min) {
					min = list[jj]; 
					minIndex = jj; 
				}
			}
			if (minIndex != i) {
				list[minIndex] = list[i]; 
				list[i] = min; 
			}
		}
	}

}
