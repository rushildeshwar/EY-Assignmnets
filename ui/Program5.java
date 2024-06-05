package com.ey.ui;
import java.util.Scanner;

public class Program5 {
	public static boolean validatePan(String pan) {
		if(pan.length()!=8) {
			return false;
		}
		for (int i=0;i<3;i++) {
			if(!Character.isUpperCase(pan.charAt(i))) {
				return false;
			}
		}
		for(int i=3;i<7;i++) {
			if(!Character.isDigit(pan.charAt(i))) {
				return false;
					
			}
		}
		if(!Character.isUpperCase(pan.charAt(7))) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pan");
		String pan=sc.nextLine();
		boolean isValid=validatePan(pan);
		if(isValid) {
			System.out.println("valid");
		}
		else {
			System.out.println("Invalid");
		}
	}

}
