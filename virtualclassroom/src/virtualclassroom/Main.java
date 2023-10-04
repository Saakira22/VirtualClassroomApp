package virtualclassroom;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		VirtualClassroomManager manager = new VirtualClassroomManager();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\nVirtual Classroom Manager Menu:");
			System.out.println("1. Add Classroom");
			System.out.println("2. Add Student");
			System.out.println("3. Schedule Assignment");
			System.out.println("4. Submit Assignment");
			System.out.println("5. List Classrooms");
			System.out.println("6. List Students in Classroom");
			System.out.println("7. Remove Classroom");
			System.out.println("8. Quit");

			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character

			switch (choice) {
			case 1:
				System.out.print("Enter the classroom name: ");
				String className = scanner.nextLine();
				manager.addClassroom(className);
				break;
			case 2:
				System.out.print("Enter student ID: ");
				String studentID = scanner.nextLine();
				System.out.print("Enter classroom name: ");
				className = scanner.nextLine();
				manager.addStudent(studentID, className);
				break;
			case 3:
				System.out.print("Enter classroom name: ");
				className = scanner.nextLine();
				System.out.print("Enter assignment details: ");
				String assignmentDetails = scanner.nextLine();
				manager.scheduleAssignment(className, assignmentDetails);
				break;
			case 4:
				System.out.print("Enter student ID: ");
				studentID = scanner.nextLine();
				System.out.print("Enter classroom name: ");
				className = scanner.nextLine();
				System.out.print("Enter assignment details: ");
				assignmentDetails = scanner.nextLine();
				manager.submitAssignment(studentID, className, assignmentDetails);
				break;
			case 5:
				manager.listClassrooms();
				break;
			case 6:
				System.out.print("Enter classroom name: ");
				className = scanner.nextLine();
				manager.listStudents(className);
				break;
			case 7:
				System.out.print("Enter the classroom name: ");
				className = scanner.nextLine();
				manager.removeClassroom(className);
				break;
			case 8:
				System.out.println("Exiting Virtual Classroom Manager.");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}
		}
	}
}