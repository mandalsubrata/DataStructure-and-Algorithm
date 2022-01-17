package com.mandal.array;

/*
 * Largest Sum Contiguous Subarray
 * Write an efficient program to find the sum of contiguous subarray within a one-dimensional array 
 * of numbers that has the largest sum. 
 * 
 * Input Array: [-1, -3, 4, -1, -2, 1, 5, -3]
 * Output: 4 + (-1) + (-2) + 1 + 5 = 7
 */

public class SumOfSubArray {

	int[] input = {-1, -3, 4, -1, -2, 1, 5, -3};
	int max = 0;
	int current = 0;

	//Kadane's Algorithm
	public int findLargestSum() {
		for(int i=0; i<input.length;i++) {
			current = current + input[i];
			if(current > max) {
				max = current;
			}
			if(current <0) {
				current = 0;
			}
		}

		System.out.println("Max = "+max);
		return max;
	}
}
