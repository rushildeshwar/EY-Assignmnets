package com.ey.ui;
import java.util.Scanner;


public class Program3 {
	public static String getCapatalized(String sentence) {
		String[] words=sentence.split("\\s+");
		StringBuilder capatalizedSentence=new StringBuilder();
		for(String word:words) {
			if (word.length()>0) {
				capatalizedSentence.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
				
			}
			
		}
		return capatalizedSentence.toString().trim();
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String sentence=sc.nextLine();
		String result=getCapatalized(sentence);
		System.out.println(result);
	}

}
