package com.ey.exception2;
import java.util.Stack;

class Contactclass{
	String fname;
	
	String lname;
	String gender;
	int number;
	public Contactclass(String fname,  String lname, String gender, int number) {
		super();
		this.fname = fname;
	
		this.lname = lname;
		this.gender = gender;
		this.number = number;
	}
	@Override
	public String toString() {
		return "Contactclass [fname=" + fname + ", lname=" + lname + ", gender=" + gender
				+ ", number=" + number + "]";
	
}

public class StackEx {
	public static void main(String[] args) {
		Contactclass c1=new Contactclass("rushil",  "deshwar", "male", 123456);
		
		Stack<Contactclass> s=new Stack<>();
		s.push(c1);
		System.out.println(s);
		//s.pop();
		try {
			s.pop();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Contactclass c2=new Contactclass("rushil", "deshwar",  "male", 123456);
		
		try {
			s.push(c2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			
			s.push(c2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(s);
	}

}
}


