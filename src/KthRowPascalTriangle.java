import java.util.Arrays;

public class KthRowPascalTriangle {

	public static void main(String[] args) {
		System.out.println("Ans: "+Arrays.toString(getRow(3)));

	}
	public static int[] getRow(int A) {
		int n =A;
		int[][] ans = new int[n][n];
		for(int i=0; i<n; i++){
			for(int j= 0; j<=i; j++){
				if(i<1 || j <1){
					ans[i][j] =1;   
				} else {
					ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
				}
			}
		}

		int a[] = new int[n];
		for(int i=0; i<n; i++){
			a[i] = ans[n-1][i];
		}
		return a;
	}
}
