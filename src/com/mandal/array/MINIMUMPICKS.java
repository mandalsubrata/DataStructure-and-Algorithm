package com.mandal.array;

import java.util.ArrayList;
import java.util.List;

public class MINIMUMPICKS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(17);
		l.add(100);
		l.add(1);
		solve(l);

	}
	public static  int solve(ArrayList<Integer> A) {

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for(int i=0; i<A.size(); i++) {
			if(A.get(i) % 2 == 0) {
				if(A.get(i) > max) {
					max = A.get(i);
				}
			}else {
				if(min > A.get(i)) {
					min = A.get(i);
				}
			}
		}
		return max - min;

	}
}
