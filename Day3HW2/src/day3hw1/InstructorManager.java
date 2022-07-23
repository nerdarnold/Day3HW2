package day3hw1;

public class InstructorManager extends UserManager {

	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " instructor added " + instructor.getId() + " with that id");
	}

	public void update(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " instructor updated " + instructor.getId() + " with that id");
	}

	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " instructor deleted " + instructor.getId() + " with that id");
	}
}
