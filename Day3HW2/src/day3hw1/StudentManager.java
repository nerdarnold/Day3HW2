package day3hw1;


public class StudentManager extends UserManager {

	public void add(Student student) {
		System.out.println(student.getFirstName() + " student added " + student.getId() + " with that id");
	}

	public void update(Student student) {
		System.out.println(student.getFirstName() + " student updated " + student.getId() + " with that id");
	}

	public void delete(Student student) {
		System.out.println(student.getFirstName() + " student deleted " + student.getId() + " with that id");
	}

}
