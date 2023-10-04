package virtualclassroom;

import java.util.ArrayList;
import java.util.List;

class Classroom {

	// "Private" access modifier is used for maintaining the sensitive data
	private String name;
	private List<String> students;
	private List<String> assignments;

	// Constructor for Classroom Class
	public Classroom(String name) {
		this.name = name;
		this.students = new ArrayList<>();
		this.assignments = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getStudents() {
		return students;
	}

	public void setStudents(List<String> students) {
		this.students = students;
	}

	public List<String> getAssignments() {
		return assignments;
	}

	public void setAssignments(List<String> assignments) {
		this.assignments = assignments;
	}

}