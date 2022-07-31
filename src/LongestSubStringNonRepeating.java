import java.util.HashSet;
import java.util.Set;

public class LongestSubStringNonRepeating {

	public static void main(String[] args) {
		String[] str = { "abcabcbb","bbbbb","pwwkew","dvdf","anviaj"};
		for(String s: str) {
			System.out.println("Ans: "+lengthOfLongestSubstring(s));
		}


	}
	public static int optimalSolution(String s) {
		int c=0;
		int n = s.length();
		int max = 0;
		Set<Character> set = new HashSet<Character>();
		
		int i = 0;
		while(!set.add(s.charAt(i))) {
			max++;
		}
		
		for(int k= i; k<n; k++) {
			
		}
		
				
		return c;
	}
	public static int lengthOfLongestSubstring(String s) {
		int n = s.length();
		int max = 0;
		Set<Character> set = new HashSet<Character>();
		if(n==0){
			return 0;
		}
		for(int i=0; i<n; i++){
			int c =1;
			char ch1 = s.charAt(i);
			set.add(ch1);
			for(int j=i+1; j<n; j++){
				char ch2 = s.charAt(j);
				if(!set.add(ch2)) {
					break;
				}
			}
			c = set.size();
			set.clear();
			if(max< c){
				max = c;
			}
		}
		return max;
	}


}
