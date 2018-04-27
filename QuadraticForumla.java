import java.util.Scanner; 

public class QuadraticForumla {
	
	public static void main(String[] args) {
		
		double[] equation = new double[3]; 
		double[] roots = new double[3]; 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c: "); 
		for (int i = 0; i < equation.length; i++) {
			equation[i] = input.nextDouble();
			
		}
		
		int num_roots = solveQ(equation, roots); 
		
		if (num_roots == 0) {
			System.out.print("No real roots.\n");
			
		}
		else printRoots(roots, num_roots); 
		
	}

	private static void printRoots(double[] roots, int number_of_roots) {
		
		for (int i = 0; i < number_of_roots; i++) {
			System.out.println("Root " + (i + 1) + " = " + roots[i]);  
				
			
		}
		
	}
	
	public static int solveQ(double[] equation, double[] roots) {
		
		double a = equation[0]; 
		double b = equation[1]; 
		double c = equation[2];
		double evaluate = b * b - 4.0 * a * c; 
		
		if (evaluate > 0.0) {
			roots[0] = (-b + Math.pow(evaluate,  0.5)) / (2.0 * a); 
			roots[1] = (-b - Math.pow(evaluate,  0.5)) / (2.0 * a); 
			return 2; 
		}
		else if (evaluate == 0.0) {
			roots[0] = -b / (2.0 * a); 
			return 1; 
		}
		return 0; 
	}
	

}

