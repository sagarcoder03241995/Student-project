

package sdbms;
import java.util.Scanner;
public class Registration {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("welcome to SDBMS");
	System.out.println("----------------");
	
	
	//UPCASTING --> ABSTRACTION
	StudentManagementSystem obj=new StudentManagementSystemImpl();	

	// menu driven program

	while(true) {
		System.out.println("1:ADD STUDENT\n2:REMOVE STUDENT");
		System.out.println("3:REMOVE ALL STUDENTS\n4:DISPLAY STUDENT");
		System.out.println("5:DISPLAY ALL STUDENTS\n6:UPDATE STUDENT");
		System.out.println("7:COUNT STUDENTS\n8:SORT STUDENT\n9:EXIT");
		System.out.println("enter choice:");
		int choice =scan.nextInt();
		
		switch(choice) {
		case 1:
			obj.addStudent();
			break;
			
		case 2:
			obj.removeStudent();
			break;
			
		case 3:
			obj.removeAllStudent();
			break;
			
		case 4:
			obj.displayStudent();
			break;
			
		case 5:
			obj.displayAllStudents();
			break;
			
		case 6:
			obj.updateStudent();
			break;
			
		case 7:
			obj.countStudents();
			break;
			
		case 8:
			obj.sortStudents();
			break;
			
		case 9:
			System.out.println("thank you!!");
			System.exit(0);
			
			default:
				System.out.println("invalid choice, kindly enter a valid choice.");
	}
	System.out.println("----------");
}
}
}
