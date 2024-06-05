package com.ey.ui;
import java.util.Scanner;

public class Program7 {
	public static String concatenateLastLetters(String sentence) {
		String[] words=sentence.split("\\s");
		StringBuilder result=new StringBuilder();
		for(String word:words) {
			if(!word.isEmpty()) {
				char lastLetter=Character.toUpperCase(word.charAt(word.length()-1));
				result.append(lastLetter);
			}
		}
		return result.toString();
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence=sc.nextLine();
		sc.close();
		String concatenatedString=concatenateLastLetters(sentence);
		System.out.println("concatenated string"+concatenatedString);
		
	}

}
