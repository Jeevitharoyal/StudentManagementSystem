package com.studentmanagement;
import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int studentId;
	private String studentName;
	private int age;
	private String course;
	private double marks;
	
	public Student(int studentId, String studentName, int age, String course, double marks) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.course = course;
		this.marks = marks;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getCourse() {
		return course;
	}
	
	public double getMarks() {
		return marks;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student ID : " + studentId + "\nName : " + studentName + "\nAge : " + age + "\nCourse : " + course + "\nMarks : " + marks;
	}
	

}
