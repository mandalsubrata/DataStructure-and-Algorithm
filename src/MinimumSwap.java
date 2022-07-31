import java.util.ArrayList;
import java.util.Arrays;

public class MinimumSwap {

	public static void main(String[] args) {
//		A : [ 1, 12, 10, 3, 14, 10, 5 ]
//				B : 8

			ArrayList<Integer> a =	new ArrayList<>();
			a.add(1);
			a.add(12);
			a.add(10);
			a.add(3);
			a.add(14);
			a.add(10);
			a.add(5);
			int B=8;
			System.out.println("Ans: "+solve(a, B));
					

	}
	public static int solve(ArrayList<Integer> A, int B) {
		int n = A.size();
		int l =0;
		int r = 0;
		int totalLessNumber = 0;
		int ans = 0;

		for(int i=0; i<n; i++){
			if(A.get(i)<=B){
				totalLessNumber++;
			}
		}

		int badNumbersInWindow = 0;
		for(int i=0; i<totalLessNumber; i++){
			if(A.get(i)>B){
				badNumbersInWindow++;
			}
		}
		int minBadNumber = badNumbersInWindow;

		for(int i=0; i<n-totalLessNumber; i++){
			if(A.get(i)>B) badNumbersInWindow--;
			if(A.get(i+totalLessNumber)>B) badNumbersInWindow++;
			minBadNumber = Math.min(badNumbersInWindow,minBadNumber);
		}

		return minBadNumber;
	}


}
