package com.ey.ui;
import java.util.Scanner;

public class Program4 {
	public static int floatMaxDistance(int arr[],int length){
		int maxDifference=0;
		int index=-1;
		for(int i=0;i<length-1;i++) {
			int difference=Math.abs(arr[i]-arr[i+1]);
			if (difference>maxDifference) {
				maxDifference=difference;
				index=arr[i]>arr[i+1]?i:i+1;
				
			}
			
		}
		return index;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();		
		}
		int resultIndex=floatMaxDistance(array,n);
		System.out.println("ans"+resultIndex);
		}
	

}
