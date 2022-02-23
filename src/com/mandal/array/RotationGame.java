package com.mandal.array;

import java.util.Scanner;

public class RotationGame {

	public static void main(String[] args) {
		
		System.out.println("Enter no of array size: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements of the array\n");
		for(int i=0; i<n;i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("Enter value for k: \n");
		int k = s.nextInt();
		
		//reverse array
		
		reverse(arr);
		
		//reverse 0-k-1 length of array
		if(k>n) {
			k = k%n;
		}
		reverse(0,k-1,arr);
		
		//reverse k to n-1 length array
		reverse(k,arr.length-1,arr);
		
		System.out.println("OUTPUT");
		for(int i=0; i<n;i++) {
			System.out.print(" "+arr[i]);
		}

	}
	
	public static void reverse(int start, int end, int[] a) {
		while(start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void reverse(int[] arr) {
		int i = 0;
		int j = arr.length-1;
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
