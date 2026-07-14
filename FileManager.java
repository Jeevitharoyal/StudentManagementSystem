package com.studentmanagement;
import java.io.*;

public class FileManager {
	public static void saveStudents(StudentManager manager) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("students.dat"));
			out.writeObject(manager);
			out.close();
			System.out.println("Students saved successfully.");
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static StudentManager loadStudents() {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("students.dat"));
			StudentManager manager = (StudentManager)in.readObject();
			in.close();
			System.out.println("Students loaded successfully.");
			return manager;
		} catch (Exception e) {
			System.out.println("No saved data found.");
			return new StudentManager();
		}
	}

}
