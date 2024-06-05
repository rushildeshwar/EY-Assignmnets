package com.ey.ui;
import java.util.Scanner;
public class Program8 {
	public static int calculateWordSum(String input) {
		String[] words=input.split(" ");
		String firstWord=words[0];
		String lastWord=words[words.length-1];
		if (firstWord.equals(lastWord)) {
			return firstWord.length();
		}else {
			return firstWord.length()+lastWord.length();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String s=sc.nextLine();
		
		int result=calculateWordSum(s);
		System.out.println(result);
		
		
	}

}
