import java.util.Scanner; 

public class EliminateDuplicates {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers: "); 
		
		int[] numbers = new int[10]; 
		
		for (int i = 0; i < numbers.length; i++) {
			
			numbers[i] = input.nextInt(); 
		}
		
		System.out.println("The distinct numbers are: "); 
		toString(eliminateDuplicates(numbers), 10); 
		
		
		

	}
	
	public static int[] eliminateDuplicates(int[] list) {
		
		int[] temp = new int[list.length]; 
		int tempIndex = 0; 
		for (int i = 0; i < list.length; i++) {
			
			boolean isDuplicate = false; 
			for (int j = 0; j < list.length; j++) {
				if (temp[j] == list[i]) {
					isDuplicate = true; 
				}
				
			}
			if (!isDuplicate) {
				
				temp[tempIndex++] = list[i]; 
			}
		}
		int[] distinct = new int[tempIndex]; 
		for (int i = 0; i < tempIndex; i++) {
			distinct[i] = temp[i]; 
		}
		return distinct; 
	}
	
	public static void toString(int[] array, int numPerLine) {
		
		for (int i = 0; i < array.length; i++) {
			
			
			System.out.printf("%2d ", array[i]); 
			if ((i + 1) % numPerLine == 0) 
				System.out.println(""); 
		
		}
	}

}
