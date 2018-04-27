
public class RunTime {

	static final int size = 100000; 
	
	public static void main(String[] args) {
		
		int[] numbers = new int[size]; 
		int key = (int)(Math.random() * size); 
		
		for (int i = 0; i < size; i++) {
			numbers[i] = (int)(Math.random() * size); 
			
		}
		long start = System.currentTimeMillis(); 
		int index = linearSearch(numbers, key); 
		long endTime = System.currentTimeMillis() - start; 
		System.out.println("LinearSearch - Total time of search is: " + endTime + " index = " + index);
		
		
		start = System.currentTimeMillis(); 
		System.out.println("Sorting array..."); 
		sort(numbers);
		System.out.println("Finished sorting."); 
		int index2 = binarySearch(numbers, key); 
		endTime = System.currentTimeMillis() - start; 
		System.out.println("Binary - Total time of search is: "  + endTime + " index = " + index2);
		
		

	}
	
	public static int[] sort(int[] numbers) {
		
		for (int i = 0; i < numbers.length - 1; i++) {
			
			int swapIndex = i; 
			int min = numbers[i]; 
			for (int k = i + i; k < numbers.length; k++) {
				
				if (min > numbers[k]) {
					min = numbers[k];
					swapIndex = k; 
				}
			}
			if (swapIndex != i) {
				
				numbers[swapIndex] = numbers[i]; 
				numbers[i] = min; 
				
			}
		}
		
		return numbers; 
		
	}
	
	public static int linearSearch(int[] numbers, int key) {
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == key) 
				return i; 
		}
		return -1; 
		
		
	}
	
	public static int binarySearch(int[] numbers, int key) {
		
		int min = 0; 
		int max = numbers.length; 
		
		while (max >= min) {
			
			int mid = (min + max) / 2; 
			if (key > numbers[mid]) {
				
				min = mid + 1; 
			}
			else if (key == numbers[mid]) {
				
				return mid; 
			}
			else {
				max = min - 1; 
			}
		}
		return -min - 1; 
		
	}
	


}
