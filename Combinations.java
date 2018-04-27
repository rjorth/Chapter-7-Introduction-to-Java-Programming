import java.util.Scanner;
public class Combinations {

	public static void main(String[] args) {
		
		int[] numbers = new int[10];
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) numbers[i] = input.nextInt();

        for (int i = 0; i < 10; i++) {

            for (int k = 0; k < 10; k++) {
                if (k != i) {
                    System.out.print(numbers[i] + "-" + numbers[k] + " ");
                }
            }
            System.out.println("");
        }
    
	}
}
