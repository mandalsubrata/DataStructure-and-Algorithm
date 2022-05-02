package com.mandal.array;

import java.util.ArrayList;

/**
 * Little Ponny is given an array, A, of N integers. 
 * In a particular operation, he can set any element of the array equal to -1.
 * He wants your help for finding out the minimum number of operations required 
 * such that the maximum element of the resulting array is B. If it is not possible then return -1.
 * @author subratamandal
 *
 */
public class LittlePonnyAndMaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int solve(ArrayList<Integer> A, int B) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count =0;
		for(int i=0; i<A.size(); i++) {
			if(A.get(i) == B) {
				count++;
			}
		}
		if(count == 0) {
			return -1;
		}
		for(int i=0; i<A.size(); i++) {
	
			if(A.get(i) > B) {
				list.add(A.get(i));
			}
		}
		return list.size() > 0?1:-1;
	}
}
