package com.studentmanagement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentManager manager = FileManager.loadStudents();
		while(true) {
			System.out.println("\n=======Student Management System========");;
			System.out.println("1. Add Student");
			System.out.println("2. Display All  Students");
			System.out.println("3.Search Student ");
			System.out.println("4. Update Student");
			System.out.println("5. Delete Student ");
			System.out.println("6. Save Students");
			System.out.println("7. Load Students");
			System.out.println("8. Exit");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter StudentId: ");
				int id = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Enter Student Name: ");
				String name = sc.nextLine();
				System.out.print("Enter Age: ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Course: ");
				String course = sc.nextLine();
				System.out.println("Enter Marks: ");
				double marks = sc.nextDouble();
				
				Student student = new Student(id, name, age, course, marks);
				manager.addStudent(student);
				break;
			case 2:
				manager.displayAllStudents();
				break;
			case 3:
				System.out.print("Enter Student ID: ");
				int searchId = sc.nextInt();
				Student searchStudent = manager.searchStudent(searchId);
				if(searchStudent != null) {
					System.out.println(searchStudent);
				}
				else {
					System.out.println("Student not found.");
				}
				break;
			case 4:
				System.out.print("Eneter Student ID to Update: ");
				int updateId = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter New Name: ");
				String newName = sc.nextLine();
				System.out.print("Enter New Age: ");
				int newAge = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter New Course: ");
				String newCourse = sc.nextLine();
				System.out.print("Enter New Marks: ");
				double newMarks = sc.nextDouble();
				manager.updateStudent(updateId, newName, newAge, newCourse, newMarks);
				break;
			case 5:
				System.out.print("Enter Student Id to Delete: ");
				int deleteId = sc.nextInt();
				
				manager.deleteStudent(deleteId);
				break;
			case 6:
				FileManager.saveStudents(manager);
				break;
			case 7:
				manager = FileManager.loadStudents();
				break;
			default:
				System.out.println("Invalid Choice!");
			}
		}

	}

}
