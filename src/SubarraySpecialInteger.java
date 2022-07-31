import java.util.ArrayList;

public class SubarraySpecialInteger {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);
		int B = 10;
		System.out.println("Ans; "+solve(A, B));
	}
	public static int solve(ArrayList<Integer> A, int B) {
		int n = A.size();
		int s = 0;
		int max = 0;
		
		for(int k=0; k<n; k++) {
			int sum = 0;
			for(int i =0; i<n; i++) {
				
			}
		}

		for(int start=0; start<n; start++){
			System.out.println("Start="+start);
			for(int end=start; end<n; end++){
				System.out.println("End="+end);
				s = 0;
				for(int k = start; k<=end; k++){
					s += A.get(k);
					System.out.print(" "+A.get(k));
				}
				System.out.println();
				int len = end-start+1;
				System.out.println("len="+len);
				if(s<=B){
					if(len>max){
						max = len;
					}
				}else {
					break;
				}
				System.out.println("Max="+max);
			}
		}
		return max;
	}

}
