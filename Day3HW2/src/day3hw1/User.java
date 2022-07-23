package day3hw1;
//BASE CLASS FOR HUMANITY
public class User {
	private String firstName;
	private String lastName;
	private int id;
	private String nationalId;
	private int age;


	public User(String firstName, String lastName, int id, String nationalId, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.nationalId = nationalId;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
