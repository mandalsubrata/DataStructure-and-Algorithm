import java.util.ArrayList;

public class ThreeSumZero {

	public static void main(String[] args) {
		int[] a = {-1,0,1,2,-1,4};
		ArrayList<ArrayList<Integer>> l = solve(a);
		l.stream().forEach(System.out::print);

	}

	private static ArrayList<ArrayList<Integer>> solve(int[] a) {
		int n = a.length;
		int p1=0,p2=0,p3=0;
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		
		while(p1<n) {
			if(p1==0 || (p1>0 && a[p1] != a[p1-1])) {
				p2=p1+1;
				p3=n-1;
				int x = 0 - a[p1];
				
				while(p2<p3) {
					int y = a[p2];
					int z = a[p3];
					
					if(y+z == x) {
						ArrayList<Integer> l = new ArrayList<Integer>();
						l.add(a[p1]);
						l.add(y);
						l.add(z);
						
						while(p2<p3 && (a[p2] == a[p2+1])) {
							p2++;
						}
						while(p2<p3 && (a[p3] == a[p3-1])) {
							p3--;
						}
						ans.add(l);
						p2++;
						p3--;
						
					} else if(y+z > x) {
						p3--;
					} else {
						p2++;
					}
				}
			}
			p1++;
		}
		
		return ans;
	}


}
