package com.mandal.array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * You are given an integer T denoting the number of test cases. For each test case, you are given an integer array A.
 * You have to put the odd and even elements of array A in 2 separate arrays and print the new arrays.
 * NOTE: Array elements should have same relative order as in A.
 * @author subratamandal
 *
 */
public class SeparateOddEven {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(5);
		a.add(53);
		a.add(55);
		a.set(0, null);
		
		
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
			print(arr);
		}
	}
	
	public static void print(int[] arr) {
		StringBuilder even = new StringBuilder();
		StringBuilder odd = new StringBuilder();
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				even.append(arr[i]+" ");
			}else {
				odd.append(arr[i]+ " ");
			}
		}
		System.out.println(even.toString());
		System.out.println(odd.toString());
	}

}
