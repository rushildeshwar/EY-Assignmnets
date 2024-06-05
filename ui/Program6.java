package com.ey.ui;

import java.util.Scanner;

public class Program6{
	public static String reshape(String input ,char seperator) {
		StringBuilder reversed=new StringBuilder(input).reverse();
		StringBuilder reshapedString=new StringBuilder();
		for(int i=0;i<reversed.length();i++) {
			reshapedString.append(reversed.charAt(i));
			if(i<reversed.length()-1) {
				reshapedString.append(seperator);
		}
	}
	return reshapedString.toString();
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String input=sc.nextLine();
		System.out.println("enter a char");
		char seperator=sc.next().charAt(0);
		String result=reshape(input,seperator);
		System.out.println(result);
	}

}
