import java.util.ArrayList;
import java.util.List;

public class MatrixPrefixSum {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		ArrayList<Integer> l3 = new ArrayList<Integer>();

		l1.add(1);
		l1.add(2);
		l1.add(3);
		A.add(l1);

		l2.add(4);
		l2.add(5);
		l2.add(6);
		A.add(l2);

		l3.add(7);
		l3.add(8);
		l3.add(9);
		A.add(l3);
		//solve(A);
		System.out.println("Matrix Ans: "+solve(A).get(1));

	}
	public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
		A.stream().forEach(e->System.out.print(" "+e));
		System.out.println();
		long n = A.size();
		long m = A.get(0).size();

		ArrayList<ArrayList<Integer>> rowPsm = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> psm = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> col = new ArrayList<>();


		for(int i=0; i<m; i++) {
			int a = A.get(0).get(i);
			col.add(a);
		}
		rowPsm.add(col);

		for(int i=1; i<n; i++) {
			ArrayList<Integer> rowWiseSum = new ArrayList<>();
			for(int j=0; j<m; j++) {
				rowWiseSum.add(A.get(i).get(j) + rowPsm.get(i-1).get(j));
			}
			rowPsm.add(rowWiseSum);
		}


		for(int i=0; i<n; i++) {
			ArrayList<Integer> rtemp = new ArrayList<>();
			int a = rowPsm.get(i).get(0);
			rtemp.add(a);
			psm.add(rtemp);
		}

		for(int i=0; i<n; i++) {
			ArrayList<Integer> colWiseSum = new ArrayList<>();
			colWiseSum.add(psm.get(i).get(0));
			for(int j=1; j<m; j++) {
				colWiseSum.add(rowPsm.get(i).get(j) + psm.get(i).get(j-1));
				psm.set(i, colWiseSum);
			}

		}
		return psm;

	}



}
