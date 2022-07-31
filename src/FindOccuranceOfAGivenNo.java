
public class FindOccuranceOfAGivenNo {

	public static void main(String[] args) {
		int[] arr = {-5,-5,-3,0,0,1,1,5,5,5,5,5,5,5,8,10,10,15};
		int k = 5;
		int n= arr.length;
		int ansl = 0;
		int ansr = 0;
		int l = 0;
		int r = n-1;
		int mid = -1;
		while(l<=r) {
			mid = (l+r)/2;
			
			if(arr[mid] == k) {
				r=mid-1;
				ansl = mid;
			}
			if(arr[mid] <k) {
				l=mid+1;
			} 
			if(arr[mid] > k){
				r = mid-1;
				ansl = r;
			}
		}
		l = ansl;
		r = n-1;
		while(l<=r) {
			mid = (l+r)/2;
			if(arr[mid] == k) {
				l = mid+1;
				ansr = l;
			}
			if(arr[mid] <k) {
				l=mid+1;
			} 
			if(arr[mid] > k){
				r = mid-1;
				ansr = r;
			}
		}		
		System.out.println("ansl: "+ansl+" ansr: "+ansr+" len= "+(ansr-ansl+1));

	}

}
