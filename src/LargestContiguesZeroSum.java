import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LargestContiguesZeroSum {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(-19);
		a.add(8);
		a.add(2);
		a.add(-8);
		a.add(19);
		a.add(5);
		a.add(-2);
		a.add(-23);
		//a.add(-4);
		System.out.println("Ans: "+lszero(a));

	}
	public static ArrayList<Integer> lszero(ArrayList<Integer> A) {
		int n = A.size();
		Map<Long,Integer> map = new HashMap<>();
		ArrayList<Integer> ans = new ArrayList<>();
		int s= -1;
		int e = -1;
		int maxLen = 0;
		long sum = 0;
		map.put(0l,-1);
		for(int i=0; i<n; i++){
			sum +=A.get(i);
			if(map.containsKey(sum)){
				int l = i - map.get(sum) +1;
				if(l>maxLen){
					maxLen = l;
					e = i;
					s = map.get(sum);
				}
			} else {
				map.put(sum,i);
			}

		}
		if(s>=0 && e>=0) {
			for(int i=s; i<e; i++){
				ans.add(A.get(i));
			}	
		}
		return ans;
	}


}
