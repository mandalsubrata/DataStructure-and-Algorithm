package com.mandal.array;

public class EquilibriumIndexOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A1 = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10,
				-11, -12, -13, -14, -15, -16, -17, -18, -19,
				-20, -21, -22, -23, -24, -25, -26, -27, -28, 
				-29, -30, -31, -32, -33, -34, 69, 1, 2, 3, 4,
				5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
				18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
				30, 31, 32, 33, 34};
		
		int[]A = {-7, 1, 5, 2, -4, 3, 0};
		
		int len = A.length;
		System.out.println(">>>>>"+len);
		int[] ps = new int[len];
		int sumL=0,sumR =0;
		int max = Integer.MIN_VALUE;
		boolean result = false;
		int index = -1;

		ps[0] = A[0];
		for(int i=1; i<len; i++) {
			ps[i] = ps[i-1] + A[i];
		}
		
		for(int i=0; i<len; i++) {
			if(i==0) {
                sumL = 0;
            }else {
                sumL = ps[i-1];
            }
            if(i == len-1){
                sumR = 0;
            }else {
                sumR = ps[len-1] - ps[i];
            }
            if(sumL == sumR){
                if(max < sumR){
                    max = ps[i];
                    result = true;
                    index = i;
                }
            }
		}
		
        if(result){
            System.out.print("result :: "+index);
        } else {
        	System.out.print("No result :: -1");
        }
		
	}

}
