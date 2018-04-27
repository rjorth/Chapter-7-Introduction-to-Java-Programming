import java.util.Scanner; 

public class PatternRecognition {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int size = input.nextInt();
        int[] values = new int[size];
        System.out.print("Enter the values: ");
        for (int i = 0; i < size; i++) values[i] = input.nextInt();

        if (isConsecutiveFour(values)) {
            System.out.println("The list has consecutive fours");
        } else {
            System.out.println("The list has no consecutive fours");
        }


    }

    public static boolean isConsecutiveFour(int[] values) {

	int count = 1;
		
		for (int i = 0; i < values.length - 1; i++) {
			if (values[i] == values[i + 1]) 
				count++;
			
			if (count >= 4) 
				return true;
	
			if (values[i] != values[i + 1])
				count = 1;	
		}
		return false;
    }
}
