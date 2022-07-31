import java.util.Arrays;
import java.util.List;

public class MedianOfTwoSortedArrayBS {

	public static void main(String[] args) {
		//8 -43 -25 -18 -15 -10 9 39 40
		//1 -2

		//System.out.println("Ans: "+findMedianSortedArrays(Arrays.asList(-3,-2,1,15), Arrays.asList(-31,-11)));
		System.out.println("Ans: "
				+findMedianSortedArrays(Arrays.asList(-43,-25,-18,-15,-10,9,39,40), Arrays.asList(-2)));


	}

	// DO NOT MODIFY BOTH THE LISTS
	public static double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
		double n1 = (double)a.size();
		double n2 = (double)b.size();
		if(n1 > n2){
			findMedianSortedArrays(b,a);
		}
		if (a.size() == 0 && b.size() == 0) {
			return 0;
		} 
		else if (a.size() == 0) {
			if (b.size() % 2 == 0) {
				return (b.get(b.size() / 2 - 1) + b.get(b.size() / 2)) / 2.0;
			} else {
				return (b.get(b.size() / 2));
			}
		} else if (b.size() == 0) {
			if (a.size() % 2 == 0) {
				return (a.get(a.size() / 2 - 1) + a.get(a.size() / 2)) / 2.0;
			} else {
				return (a.get(a.size() / 2));
			}
		}
		double l = 0;
		double r = n1;

		while(l<=r){
			double cut1 = (int)(l+r)/2;
			double cut2 = (n1+n2+1)/2-cut1;

			double l1 = Double.MIN_VALUE;
			double l2 = Double.MIN_VALUE;
			double r1 = Double.MAX_VALUE;
			double r2 = Double.MAX_VALUE;  

			if(cut1 > 0 && n1>0 && cut1<=n1){
				l1 = (double)a.get((int)cut1-1);
			}
			if(cut2 > 0 && n2>0 && cut2<=n2){
				l2 = (double)b.get((int)cut2-1);
			}
			if(cut1<n1 && cut1>0){
				r1 = (double)a.get((int)cut1);
			}
			if(cut2<n2 && cut2>0){
				r2 = (double)b.get((int)cut2);
			}

			if(l1<=r2 && l2<=r1){
				double k = n1+n2;
				if((k)%2==0){
					return (((double)Math.max(l1,l2) + (double)Math.min(r1,r2))/2.0);
				}
				return (double)Math.max(l1,l2);
			} else if(l1>r2){
				r=cut1-1;
			}else {
				l=cut1+1;
			}
		}

		return 0.0;
	}


}
