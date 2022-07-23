package day3hw1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String[] takenCourses = {"JAVA+REACT","Angular"};
		Student ata = new Student("Ata","Yesilyurt",5,"123456789",24,6,takenCourses);
		StudentManager studentManager = new StudentManager();
		studentManager.add(ata);		
		Student zafer = new Student("Zafer","Altay",4,"123456789",27,7);
		studentManager.add(zafer);
		Student hilal = new Student("Hilal","Beklen",3,"00000000",20,4);
		studentManager.add(hilal);
		studentManager.delete(hilal);
		Instructor engin = new Instructor("Engin", "Demiroğ", 0, "5646546", 32, 88888, 1);
		List<Student> studentList = new ArrayList<Student>();
		InstructorManager mng = new InstructorManager();
		mng.add(engin);
		studentManager.delete(engin);
		//User,student ve instructor arasındaki referans bağını göstermek için örnekleri uzattım
		for(User studentInfo : studentList) {
			System.out.println(studentInfo);
		}

	}

}
