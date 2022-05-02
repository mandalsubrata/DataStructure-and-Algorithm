package matrix;

import java.util.ArrayList;

public class AddTwoMatrix {
	public static void main(String[] args) {

	}

	public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
		int n = A.size();
		ArrayList<ArrayList<Integer>> l = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<n; i++){
			ArrayList<Integer> l1 = new ArrayList<Integer>();
			for(int j=0; j<n; j++) {
				int sum = A.get(i).get(j) + B.get(i).get(j);
				l1.add(sum);
			}
			l.add(l1);
			
		}
		return l;
	}
}
