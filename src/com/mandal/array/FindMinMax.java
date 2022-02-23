package com.mandal.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindMinMax {
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(2);
		l.add(1);
		
		System.out.println("solve"+solve(l));
		
		System.out.println("Enter no of array size: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements of the array\n");
		for(int i=0; i<n;i++) {
			arr[i] = s.nextInt();
		}
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(""+max+" "+min);
	}
	

	// DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static ArrayList<Integer> solve(final List<Integer> A) {
    	ArrayList<Integer> a = new ArrayList<Integer>();
    	
    	for(int i=a.size()-1;i>0;i--) {
    		a.add(A.get(i));
    	}
    	return a;
    }


}
