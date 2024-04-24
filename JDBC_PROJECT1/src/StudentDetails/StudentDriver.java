package StudentDetails;

import java.util.Scanner;

public class StudentDriver {

	public static void main(String[] args) throws Exception {
		
		Student sd = new Student();
		
		Scanner scan = new Scanner(System.in);
		Student.getConnection();
		int choice = 0;
		while(choice != 6)
		{
			System.out.println("1. Add Student");
			System.out.println("2. Get Student Name upon ID ");
			System.out.println("3. Display Student Details upon Name");
			System.out.println("4. Display Student Table");
			System.out.println("5. Remove Student");
			System.out.println("6. Exit");
			System.out.println("Enter your choice");
			choice = scan.nextInt();
			scan.nextLine();	
			switch(choice)
			{
				case 1 ->
					sd.addStudent();
				case 2 ->
					sd.getStudentName();
				case 3 ->
					sd.getDetails();
				case 4 ->
					sd.getTable();
				case 5 ->
					sd.removeStudent();
				case 6 ->
					System.out.println("Thanks for using me...!");
				default -> 
					System.out.println("Invalid choice...!");
			}
		}
	}
}
