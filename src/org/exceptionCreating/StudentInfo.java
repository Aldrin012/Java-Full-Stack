package org.exceptionCreating;

import java.util.Scanner;

public class StudentInfo {
	int id;
	String name;
	
	StudentInfo(int id, String name) {
		this.id = id;
		this.name = name;	
	}
	
	public StudentInfo() {
		System.out.println("Default");
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	private void find() throws StudentNotFoundExcetion {
		try {
			throw new StudentNotFoundExcetion();
		} catch (StudentNotFoundExcetion e) {
			System.out.println("Student id not available.");
		}
	}
	
	public static void main(String[] args) throws StudentNotFoundExcetion {
		System.out.println("Hello");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of students to be entered:");
		int n = sc.nextInt();
		StudentInfo[] s = new StudentInfo[n];
		int id = 1;
		sc.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println("Student name(id-"+id+"):");
			String name = sc.nextLine();
			s[i] = new StudentInfo(id,name);
			id++;
		}
		System.out.println("Enter id to search for student:");
		int m = sc.nextInt();
		int i1 = 0;
		for (int i = 0; i < n; i++) {
			int j = s[i].getId();
			if(m == j) {
				System.out.println(s[i].getName());
				i1++;
			}
		}
		if(i1 ==0) {
			s[0].find();
		}
	}
}
