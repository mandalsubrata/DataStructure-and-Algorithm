import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class CountRectangle {

	public static void main(String[] args) {
		
		//for(int i=0; i<6; i++)
		System.out.println(">>>"+" "+6%5);
		 ArrayList<Integer> A= new ArrayList<Integer>();
		 A.add(1);
		 A.add(1);
		 A.add(2);
		 A.add(2);
		 ArrayList<Integer> B= new ArrayList<Integer>();
		 B.add(1);
		 B.add(2);
		 B.add(1);
		 B.add(2);
		System.out.println("Ans total Rectangle: "+solve(A, B));

	}

	public static class Pair {
		int key;
		int value;
		public Pair() {
		}
		public Pair(int key, int value) {
			super();
			this.key = key;
			this.value = value;
		}
		public int getKey() {
			return key;
		}
		public void setKey(int key) {
			this.key = key;
		}
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		
	}
	public static int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
		int n = A.size();
		int c = 0;
		
		Set<Pair> set = new TreeSet<>((p1,p2)->{
			int x1 = p1.getKey();
			int y1 = p1.getValue();
			int x2 = p2.getKey();
			int y2 = p2.getValue();
			return Integer.compare(x1+y1, x2+y2);
		});

		for(int i=0; i<n; i++){
			set.add(new Pair(A.get(i),B.get(i)));
		}

		for(int i=0; i<n; i++) {
			for( int j=i+1; j<n; j++){
				int x1 = A.get(i);
				int y1 = B.get(i);
				int x2 = A.get(j);
				int y2 = B.get(j);

				if(x1==x2 || y1==y2){
					continue;
				}
				Pair point1 = new Pair(x1,y2);
				Pair point2 = new Pair(x2,y1);

				if(set.contains(point1) && set.contains(point2)){
					c++;
				}
			}
		}
		return c/2;
	}

}
