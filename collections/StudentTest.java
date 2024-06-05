package com.ey.collections;

public class StudentTest {
	public static void main(String[] args) {
		StudentService ss= new StudentService();
		
		
		Address a1=new Address("chn");
		Student s1=new Student("rushil","deshwar",a1);
		
		Address a2=new Address("chn");
		Student s2=new Student("aditya","kumar",a2);
		
		System.out.println(ss.addProduct(s1));
		System.out.println(ss.addProduct(s2));

		ss.listStudents();
		
		System.out.println(ss.isvalidStudent(s1, s2));
		
	}


}
