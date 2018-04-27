import java.util.Scanner; 

public class SortStudents {
	
	//names will be the first element of the array, and scores are the second
	static final int NAMES = 0; 
	static final int SCORES = 1; 
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter the total number of students: "); 
		int classSize = input.nextInt(); 
		
		//this array will store two sets of values, the first set is for the students' names
		//the second set is for the students' scores
		//the size of the array is equal to the number of students in the class 
		String[][] students = new String[2][classSize]; 
		
		for (int i = 0; i < students[SCORES].length; i++) {
			
			System.out.print("Enter student #" + (i + 1) + " name: "); 
			students[NAMES][i] = input.next(); 
			System.out.print("Score: "); 
			students[SCORES][i] = input.next();
				
			}
		sortStudents(students); 
		printArray(students); 
			
		}
		
	
	
	public static void sortStudents(String[][] students) {
		
		//we are using the index of the array, which is why the loop must end
		//specifically at length .length - 1
		//because index begins are [0] 
		for (int i = 0; i < students[SCORES].length - 1; i++) {
			
			int index = i; 
			int min = new Integer(students[SCORES][i]);  
			String studentName = ""; 
			for (int j = i + 1; j < students[SCORES].length; j++) {
				
				if (min > Integer.parseInt(students[SCORES][j])) {
					min = Integer.parseInt(students[SCORES][j]); 
					studentName = students[NAMES][j]; 
					index = j; 
				}
			}
			if (index != i) {
				
				students[NAMES][index] = students[NAMES][i]; 
				students[SCORES][index] = students[SCORES][i]; 
				students[NAMES][i] = studentName; 
				students[SCORES][i] = Integer.toString(min); 
			}
		}
		
		
	}
	
	public static void printArray(String[][] array) {
		
		for (int i = array[SCORES].length - 1; i >= 0; i--) {
			
			System.out.println("Student: " + array[NAMES][i] + "\nScore: " + array[SCORES][i]); 
			
		}
		
		
	}

}
