package com.ey.ui;
public class Array {
	public static int maximum(int array[]) {
		int max=array[0];
		for(int x:array) {
			if (max<x) {
			max=x;
			}
		}
		return max;
		
	}
	public static int minimum(int array[]) {
		
		int min=array[0];
		for(int x:array) {
			if (x<min) {
				min=x;
			}
		}
		return min;
		
		
	}
	public static int sum(int array[]) {
		int sum=0;
		for(int x:array) {
			sum+=x;
		}
		return sum;
	}
	public static int average(int array[]) {
		int sum=0;
		for(int x:array) {
			sum+=x;
		}
		return sum/array.length;
	}	
	public static int[] ascending(int array[]) {
		int arr1[]=new int[array.length];
		System.arraycopy(array, 0, arr1,0, array.length);
		for(int i=0;i<=arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]>arr1[j]) {
					int temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		return arr1;
	}
	public static int[] descending(int array[]) {
		int arr1[]=new int[array.length];
		System.arraycopy(array, 0, arr1,0, array.length);
		for(int i=0;i<=arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]<arr1[j]) {
					int temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		return arr1;
	}
	public static int secondLargest(int array[]) {
		return ascending(array)[array.length-2];
	}
	public static int secondSmallest(int array[]) {
		return ascending(array)[1];
	}
	static void printarray(int arr[]) {
		for(int x:arr)
			System.out.print(x +" ");
	
	}
	
	public static void main(String[] args) {
		int arr[]= {3,5,8,6,7,1};
		
		System.out.println(maximum(arr));
		System.out.println(minimum(arr));
		System.out.println(sum(arr));
		System.out.println(average(arr));
		System.out.println("ASCENDING");
		printarray(ascending(arr));
		System.out.println();
		System.out.println("DESCENDING");
		printarray(descending(arr));
		System.out.println();
		System.out.println(secondLargest(arr));
		System.out.println(secondSmallest(arr));
	
	}

}