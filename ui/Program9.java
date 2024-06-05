package com.ey.ui;
import java.util.Scanner;
public class Program9 {
	public static String convertFormat(String inp) {
		if(inp==null ||inp.length()!=12||!inp.matches("\\d{3}-\\d{3}-\\d{4}")) {
			return"Invalid";
		}
		String digits=inp.replace("-", "");
		StringBuilder  res=new StringBuilder();
		res.append(digits.substring(0,2)).append("-");
		res.append(digits.substring(2,4)).append("-");
		res.append(digits.substring(4,7)).append("-");
		res.append(digits.substring(7));
		return res.toString();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 digit number:");
		String inp=sc.nextLine();
		String res=Program9.convertFormat(inp);
		System.out.println("converted format:"+res);
	}

}
