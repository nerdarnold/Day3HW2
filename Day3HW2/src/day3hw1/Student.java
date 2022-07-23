package day3hw1;

public class Student extends User {
	private int grade;
	private String[] takenCourses;

	public Student(String firstName, String lastName, int id, String nationalId, int age) {
		super(firstName, lastName, id, nationalId, age);
	}

	public Student(String firstName, String lastName, int id, String nationalId, int age, int grade,
			String[] takenCourses) {
		super(firstName, lastName, id, nationalId, age);
		this.takenCourses = takenCourses;
		this.grade = grade;
	}

	public Student(String firstName, String lastName, int id, String nationalId, int age, int grade) {
		super(firstName, lastName, id, nationalId, age);
		this.grade = grade;
	}

	public String[] getTakenCourses() {
		return takenCourses;
	}

	public void setTakenCourses(String[] takenCourses) {
		this.takenCourses = takenCourses;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}
