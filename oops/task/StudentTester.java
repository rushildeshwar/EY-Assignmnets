package com.ey.oops.task;
import java.util.Date;
import java.util.*;

public class StudentTester {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Student students[]=new Student[5];
		Integer a[]= {45,42,67};
		students[0]=new Student("ram1",new Date(7,8,9),a);
		students[0].getGrade();
		students[1]=new Student("ram2",new Date(8,9,10),a);
		students[1].getGrade();
		students[2]=new Student("ram3",new Date(9,10,11),a);
		students[2].getGrade();
		students[3]=new Student("ram4",new Date(10,11,12),a);
		students[3].getGrade();
		students[4]=new Student("ram5",new Date(11,12,13),a);
		students[4].getGrade();
		StudentService sc=new StudentService();
		sc.ShowStudentDetails(students);
		
		
		
		
		

}
}
