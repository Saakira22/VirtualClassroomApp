package virtualclassroom;

import java.util.HashMap;
import java.util.Map;

public class VirtualClassroomManager {
	private Map<String, Classroom> classrooms;
	private Map<String, String> studentClassMap;

	public VirtualClassroomManager() {
		classrooms = new HashMap<>();
		studentClassMap = new HashMap<>();
	}

	public void addClassroom(String className) {
		if (!classrooms.containsKey(className)) {
			classrooms.put(className, new Classroom(className));
			System.out.println("Classroom " + className + " has been created.");
		} else {
			System.out.println("Classroom " + className + " already exists.");
		}
	}

	public void removeClassroom(String className) {
		if (classrooms.containsKey(className)) {
			classrooms.remove(className);
			System.out.println("Classroom " + className + " has been removed.");
		} else {
			System.out.println("Classroom " + className + " does not exist.");
		}
	}

	public void addStudent(String studentID, String className) {
		if (classrooms.containsKey(className)) {
			Classroom classroom = classrooms.get(className);
			classroom.getStudents().add(studentID);
			studentClassMap.put(studentID, className);
			System.out.println("Student " + studentID + " has been enrolled in " + className + ".");
		} else {
			System.out.println("Classroom " + className + " does not exist.");
		}
	}

	public void scheduleAssignment(String className, String assignmentDetails) {
		if (classrooms.containsKey(className)) {
			Classroom classroom = classrooms.get(className);
			classroom.getAssignments().add(assignmentDetails);
			System.out.println("Assignment for " + className + " has been scheduled.");
		} else {
			System.out.println("Classroom " + className + " does not exist.");
		}
	}

	public void submitAssignment(String studentID, String className, String assignmentDetails) {
		if (studentClassMap.containsKey(studentID) && studentClassMap.get(studentID).equals(className)) {
			System.out.println("Assignment submitted by Student " + studentID + " in " + className + ".");
		} else {
			System.out.println("Student " + studentID + " is not enrolled in " + className + ".");
		}
	}

	public void listClassrooms() {
		System.out.println("List of Classrooms:");
		for (String className : classrooms.keySet()) {
			System.out.println(className);
		}
	}

	public void listStudents(String className) {
		if (classrooms.containsKey(className)) {
			Classroom classroom = classrooms.get(className);
			System.out.println("Students in " + className + ":");
			for (String student : classroom.getStudents()) {
				System.out.println(student);
			}
		} else {
			System.out.println("Classroom " + className + " does not exist.");
		}
	}
}