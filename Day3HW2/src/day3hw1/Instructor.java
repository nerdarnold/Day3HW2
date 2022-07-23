package day3hw1;

public class Instructor extends User {
	private double salary;
	private int vacationDaysforaWeek;

	public Instructor(String firstName, String lastName, int id, String nationalId, int age, double salary,
			int vacationDaysforaWeek) {
		super(firstName, lastName, id, nationalId, age);
		this.salary = salary;
		this.vacationDaysforaWeek = vacationDaysforaWeek;
	}

}
