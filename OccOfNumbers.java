import java.util.Scanner; 

public class OccOfNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		int[] nums = new int[100]; 
		int values; 
		int count = 0; 
		System.out.print("Only enter integers between 1 and 100: "); 
		
		do {
			values = input.nextInt(); 
			nums[count] = values; 
			count += 1; 
		}
		while (values != 0);
		
		countOcc(nums); 

	}
	
	public static void countOcc(int[] nums) {
		
		for (int i = 1; i <= 100; i++) {
			int count = 0; 
			for (int j = 0; j < nums.length - 1; j++) {
				if (nums[j] == i)
					count += 1; 
			}
			if (count != 0) 
				System.out.printf("%d occurs %d %s%n", i, count, 
						count > 1 ? "times" : "time"); 
		}
	}

}
