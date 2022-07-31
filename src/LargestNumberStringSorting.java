import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LargestNumberStringSorting {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		//a.add(8);
		//a.add(89);
		// 3, 30, 34, 5, 9 
		//9 5 34 3 30
		a.add(3);
		a.add(30);
		a.add(34);
		a.add(5);
		a.add(9);
		System.out.println("\n"+largestNumber(a));

	}
	public static String largestNumber(final List<Integer> A) {
		StringBuilder sb = new StringBuilder();
		Integer[] csort = new Integer[A.size()];
		
		for(int i=0; i<A.size(); i++) {
			csort[i] = A.get(i);
		}

		Arrays.sort(csort,(a,b)->{
			String s1 = ""+a+b;
			String s2 = ""+b+a;
			return s2.compareTo(s1);
		});
		
		if(csort[0] == 0 && csort.length == 0) {
			return "0";
		}
				
		for(int i=0; i<csort.length; i++) {
			sb.append(csort[i]);
		}
		return sb.toString();
		
	}

}
