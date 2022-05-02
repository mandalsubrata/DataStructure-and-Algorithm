package com.mandal.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FirstMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 20 
		ArrayList<Integer> A = new ArrayList<Integer>();
    	A.add(1);
    	A.add(2);
    	A.add(3);
    	A.add(4);
    	A.add(5);
    	A.add(6);
    	A.add(7);
    	A.add(8);
    	A.add(9);
    	A.add(10);
    	A.add(11);
    	A.add(12);
    	A.add(13);
    	A.add(14);
    	A.add(15);
    	A.add(16);
    	A.add(17);
    	A.add(20);
		System.out.println("Result: "+ FirstMissingNumber.firstMissingPositive(A));
	}

    public static int firstMissingPositive(ArrayList<Integer> A) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<=A.size(); i++){
                map.put(i,i);
        }

        A.stream().sorted();
        for(int i=0; i<A.size(); i++){
            if(A.get(i) > 0 && i!=0 && !map.containsKey(i)){
            	if(i==0) {
            		return 1;
            	}
                return map.get(i);
            }
        }

        return A.size()+1;
    }
}
