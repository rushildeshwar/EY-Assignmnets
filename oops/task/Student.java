package com.ey.oops.task;
import java.util.Date;
import java.util.Arrays;

public class Student {
	private Integer admissionCode;
	private String studentName;
	private Date birthDate;
	private Integer[] marks;
	private String grade;
	public static Integer admissionCounter=1;
	private static String schoolName;
	static{
		schoolName="Hyderabad Public School";
	}
	public Student() {
		this.admissionCode=admissionCounter+100;
	}
	public Student(String studentName,Date birthDate){
		this.studentName=studentName;
		this.birthDate=birthDate;
	}
	public Student(String studentName,Date birthDate,Integer[] marks) {
		this(studentName,birthDate);
		this.marks=marks;
	}
	public Integer getAdmissionCode() {
		return admissionCode;
	}
	public void setAdmissionCode(Integer admissionCode) {
		this.admissionCode = admissionCode;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Integer[] getMarks() {
		return marks;
	}
	public void setMarks(Integer[] marks) {
		this.marks = marks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade() {
		int totalMarks=this.marks[0]+this.marks[1] + this.marks[2];
		if(totalMarks>=240 && totalMarks<=300)
			grade="Excellent";
		if(totalMarks>=180 && totalMarks<=239)
			grade="Good";
		if(totalMarks>=150 && totalMarks<=179)
			grade="Average";
		else
			grade="Fail";
		this.grade = grade;
	}
	public static Integer getAdmissionCounter() {
		return admissionCounter;
	}
	public static void setAdmissionCounter(Integer admissionCounter) {
		Student.admissionCounter = admissionCounter;
	}
	public static String getSchoolName() {
		return schoolName;
	}
	public static void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
	}
	@Override
	public String toString() {
		return "Student [admissionCode=" + admissionCode + ", studentName=" + studentName + ", birthDate=" + birthDate
				+ ", marks=" + Arrays.toString(marks) + ", grade=" + grade + "]";
	}
	
	
}
