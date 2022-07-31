import java.util.Arrays;
import java.util.Collections;

/**
 * Farmer John has built a new long barn with N stalls. 
 * Given an array of integers A of size N where each element of the array represents 
 * the location of the stall and an integer B which represents the number of cows.
 * His cows don't like this barn layout and become aggressive towards each other once 
 * put into a stall. To prevent the cows from hurting each other, John wants to assign 
 * the cows to the stalls, such that the minimum distance between any two of them is as 
 * large as possible. What is the largest minimum distance?
 * 
 * Problem Constraints
 * 2 <= N <= 100000
 * 0 <= A[i] <= 109
 * 2 <= B <= N
 *
 * The first argument given is the integer array A.
 * The second argument given is the integer B.
 *
 * Input
 * A = [1, 2, 3, 4, 5]
 * B = 3
 *
 * Output: 2
 * 
 *  @author subratamandal
 *  
 */
public class AggressiveCows {

	public static void main(String[] args) {
		//		int[] stalls = {1, 2, 3, 4, 5};
		//		int cow = 3;
		//		
		int[] stalls= {5, 17, 100, 11};
		int cow = 2;

		System.out.println("Ans: "+solve(stalls,cow));
	}

	private static int solve(int[] stalls, int cow) {
		Arrays.sort(stalls);
		int n = stalls.length;
		int minAdjDis = Integer.MAX_VALUE;
		for(int i=1; i<n; i++) {
			int v = stalls[i]-stalls[i-1];
			if(minAdjDis>v) {
				minAdjDis=v;
			}
		}
		int l=minAdjDis;
		int r=stalls[n-1]-stalls[0];
		int mid = -1;
		int ans = l;

		while(l<=r) {
			mid = (l+r)/2;
			if(check(mid,stalls,n,cow)) {
				l=mid+1;
				ans=mid;
			} else {
				r = mid-1;
			}
		}
		return ans;
	}

	private static boolean check(int dis, int[] stalls, int n, int cow) {
		int c=1;
		int lastCow = stalls[0];

		for(int i=1; i<n; i++) {
			if(stalls[i]-lastCow >= dis) {
				c++;
				lastCow=stalls[i];
				if(c==cow) {
					return true;
				}
			}
		}
		return false;
	}


}
