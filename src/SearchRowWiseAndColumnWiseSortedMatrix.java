import java.util.ArrayList;
import java.util.Arrays;

public class SearchRowWiseAndColumnWiseSortedMatrix {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		ArrayList<Integer> l3 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		
		a.add(l1);
		
		l2.add(4);
		l2.add(5);
		l2.add(6);
		a.add(l2);
		
		l3.add(7);
		l3.add(8);
		l3.add(9);
		a.add(l3);
		
		a.stream().forEach(e->{
			e.stream().forEach(i->{
				System.out.print(" "+i);
			});
			System.out.println("");
		});
		
		
		System.out.println("Ans: "+Arrays.toString(solve(a, 2)));

	}
	public static int[] solve(ArrayList<ArrayList<Integer>> A, int B) {
		int i = 0;
		int j = A.get(0).size()-1;
		
		while (i<A.get(0).size() && j>=0) {
			int k = A.get(i).get(j);
			if(B==k) {
				return new int[] {i+1,j+1}; 
			} else if(B>k) {
				i++;
			}else {
				j--;
			}
		}
		return new int[] {-1,-1};
	}
}

