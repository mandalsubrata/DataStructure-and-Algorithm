import java.util.ArrayList;

public class PairsWithGivenSum {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		//11 1 2 4 6 6 7 7 8 8 8 9 
		a.add(1);
		a.add(2);
		a.add(4);
		a.add(6);
		a.add(6);
		a.add(7);
		a.add(7);
		a.add(8);
		a.add(8);
		a.add(8);
		a.add(9);
		System.out.println("Ans: "+solve(null, 13));

	}
	
	    public static int solve(ArrayList<Integer> A, int B) {
	        int n = A.size();
	        int p1 = 0;
	        int p2 = 1;
	        long c = 0l;

	        while(p2<n && p1<n){
	            int s = A.get(p1) + A.get(p2);
	            if(s==B && p1!=p2){
	                c++;
	                p2++;
	            } else if(s>B){
	                p1++;
	                p2=p1+1;
	            } else {
	                p2++;
	                if(p2>=n-1){
	                    p1++;
	                    p2= p1+1;
	                }
	            }
	        }
	        return (int)((int)c%1000000007);
	    }
}
