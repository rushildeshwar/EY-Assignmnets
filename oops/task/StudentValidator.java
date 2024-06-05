package com.ey.oops.task;
import java.util.Calendar;
import java.util.Date;

public class StudentValidator {
	public boolean isValidStudentName(Student student) {
		return student.getStudentName().matches("[a-ZA-z]+");
	}
	public boolean isValidStudentBirthdate(Student student) {
		Calendar calendar=Calendar.getInstance();
		calendar.add(Calendar.YEAR, -5);
		Date fiveYearAgo=calendar.getTime();
		return student.getBirthDate().before(fiveYearAgo);
	}
	public boolean isValidStudentMarks(Integer[] marks) {
		if(marks!=null && marks.length==3) {
			for(int mark:marks) {
				if(mark<0||mark>100) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	public boolean isValidStudent(Student student) {
		return isValidStudentName(student) && isValidStudentBirthdate(student)&& isValidStudentMarks(student.getMarks());
	}
		
	
	

		
	
	
		
	

}
