public class Sorting {
	int[] nums = {35,19,29,12,5};

	public int bubbleSort(int[] arr, int pos) {

		if(pos == 1)
			return 1;
		for(int i=0; i< pos-1;i++)
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i +1] = temp;
			}
		return bubbleSort(arr, pos -1);
	}

	public void ss(
			StringBuilder s) {
		s=s.append( "rakesh");
	}
	public void selectionSort(int arr[]) {
		int min;		
		for(int k= 0; k< arr.length ;k++) {
			min = k;
			for(int i=k+1;i<arr.length;i++) {
				if(arr[min] > arr[i]) {
					min = i;
				}
			}
			System.out.println("min= "+min);
			int temp = arr[min];
			arr[min] = arr[k];
			arr[k] = temp;
		}


	}

	public void quickSort(int[] arr, int low, int high) {
		int pivot = partition(arr, low, high);

		if(low < pivot-1) {
			quickSort(arr,low, pivot -1);
		}
		if(pivot < high) {
			quickSort(arr,pivot, high);
		}

	}

	private int partition(int[] arr, int low, int high) {
		int pivot = arr[(low + high) / 2];

		while(low <= high) {
			while(arr[low] < pivot){
				low++;
			}
			while(pivot < arr[high]) {
				high --;
			}

			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low ++;
			high --;
		}

		return low;
	}

	public int factorial( int n) {
		if (n==1)
			return 1;

		return factorial(n -1) * n;
	}

}
