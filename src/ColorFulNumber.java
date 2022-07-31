import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ColorFulNumber {

	public static void main(String[] args) {
		System.out.println("Ans: "+colorful(23));

	}
	public static int colorful(int A) {
		int a = A;
		int n = 0;
		Set<Long> set = new HashSet<>();
		ArrayList<Integer> l = new ArrayList<Integer>();

		while(a>0){
			l.add(a%10);
			a = a/10;
		}
		Collections.reverse(l);
		for(int i=0; i<l.size(); i++){
			long product = 1;
			for(int j=i; j<l.size(); j++){
				product *= l.get(j);
				if(!set.add(product)){
					return 0;
				}
			}
		}
		return 1;
	}



}
