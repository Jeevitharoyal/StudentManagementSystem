package com.studentmanagement;
import java.util.ArrayList;
import java.io.Serializable;

public class StudentManager implements Serializable {
	private static final long serialVersionUID = 1L;
	private ArrayList<Student> students = new ArrayList<>();
	
	public void addStudent(Student student) {
		students.add(student);
		System.out.println("Student added successfully.");
	}
	public Student searchStudent(int studentId) {
		for(Student student : students) {
			System.out.println("Checking ID: "+ student.getStudentId() );
			if(student.getStudentId() == studentId) {
				return student;
			}
		}
		return null;
	}
	public void updateStudent(int studentId, String name, int age, String course, double marks) {
		Student student = searchStudent(studentId);
		if(student != null) {
			student.setStudentName(name);
			student.setAge(age);
			student.setCourse(course);
			student.setMarks(marks);
			System.out.println("Student updated successfully.");
		}else {
			System.out.println("Student not found.");
		}
	}
	
	public void deleteStudent(int studentId) {
		Student student = searchStudent(studentId);
		if(student != null) {
			students.remove(student);
			System.out.println("student deleted successfully.");
		}else {
			System.out.println("Student not found.");
		}
	}
	
	public void displayAllStudents() {
		if(students.isEmpty()) {
			System.out.println("No students found.");
			return;
		}
		for(Student student : students) {
			System.out.println(student);
			System.out.println("----------------------------------------------");
		}
			
	}
	


}
