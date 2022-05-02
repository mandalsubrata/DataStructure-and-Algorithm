package com.mandal.array;

import java.util.Scanner;

public class SearchElement {
/**
 *You are given an integer T (Number of test cases). For each test case, you are given array A and an integer B. 
 *You have to tell whether B is present in array A or not.
 * @param args
 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("no of T:\n");
		int t = s.nextInt();
		
		for(int i=0; i<t; i++) {
			System.out.println("Enter size of array");
			int n = s.nextInt();
			int[] arr = new int[n];
			System.out.println("Enter element of array");
			for(int j=0;j<n;j++) {
				arr[j] = s.nextInt();
			}
			System.out.println("Enter B");
			int b = s.nextInt();
			System.out.print(""+ searchElement(arr,b));
		}
	}
	
	public static int searchElement(int[] arr, int b) {
		if(arr.length == 0 ) {
			return 0;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == b) {
				return 1;
			}
		}
		return 0;
	}

}
