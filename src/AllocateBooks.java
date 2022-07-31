import java.util.ArrayList;

public class AllocateBooks {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(12);
		a.add(34);
		a.add(67);
		a.add(90);
		System.out.println("Ans: "+books(a, 2));

	}

	public static int books(ArrayList<Integer> A, int B) {
		int n = A.size();
		if(B>n){
			return -1;
		}
		int l = Integer.MIN_VALUE;
		int r = 0;
		// Collections.sort(A);
		for(int i=0; i<n; i++){
			int v = A.get(i);
			r+=v;
			if(v>l){
				l=v;
			}
		}
		int mid = -1;
		int ans = r;
		int c =1;

		System.out.println(">>l= "+l+" r="+r);
		while(l<=r){
			System.out.println("\n");
			System.out.println("Case : "+c++);
			System.out.println("l= "+l+" r="+r);
			mid = (l+r)/2;
			System.out.println("mid="+mid);
			if(check(mid,A,n,B)){
				r=mid-1;
				ans=mid;
				System.out.println("true ans="+ans+" r="+r);
			} else {
				l=mid+1;
				System.out.println("false ans="+ans+" l="+l);
			}
		}
		return ans;
	}

	public static boolean check(int page, ArrayList<Integer> A, int n, int B) {
		int b=0;
		int lastBookPage = 0;
		for(int i=0; i<n; i++){
			lastBookPage += A.get(i);
			System.out.println("lastBookPage="+lastBookPage+" A.get(i)="+A.get(i));
			if(lastBookPage >page){
				b++;
				lastBookPage = A.get(i);
			}
		}
		System.out.println("post lastBookPage="+lastBookPage);
		if(lastBookPage !=0)
			b++;
		System.out.println("b="+b);
		if(b<=B){
			return true;
		}
		return false;
	}

}
