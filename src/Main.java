import java.util.Arrays;

import com.mandal.array.SumOfSubArray;

public class Main {

	public static void main(String[] args) {
		MyLinkList linkList = new  MyLinkList();

		System.out.println("List size: "+linkList.getListSize());
		linkList.inseart(2);
		linkList.inseart(23);
		linkList.inseart(256);
		linkList.inseart(2123);
		System.out.println("List size: "+linkList.getListSize());
		linkList.inseartAtStart(9999);
		linkList.inseartAt(2, 555);
		linkList.showList();
		linkList.deleteAt(2);
		System.out.println("List size: "+linkList.getListSize());
		linkList.showList();
		linkList.deleteAt(20);

		MyStackUsingLinkList stack = new MyStackUsingLinkList();
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.push(100);

		stack.showstack();

		stack.pop();

		stack.showstack();


		MyStackUsingArray stackUsingArray = new MyStackUsingArray(5);
		System.out.println("stack details: "+stackUsingArray);
		System.out.println("pop="+ stackUsingArray.pop());

		stackUsingArray.push(5);
		stackUsingArray.push(22);
		System.out.println("stack details: "+stackUsingArray);
		stackUsingArray.push(5892);
		stackUsingArray.push(510);

		System.out.println("stack details: "+stackUsingArray);
		System.out.println("pop="+ stackUsingArray.pop());
		System.out.println("stack details: "+stackUsingArray);

		SumOfSubArray subArray = new SumOfSubArray();
		subArray.findLargestSum();


		Sorting sorting = new Sorting();
		int[] arr = {35,19,29,12,5};

		System.out.println("before selection  "+Arrays.toString(arr));
		sorting.selectionSort(arr);
		System.out.println("after "+Arrays.toString(arr));

		System.out.println("post selection  "+Arrays.toString(arr));
		sorting.bubbleSort(arr, arr.length);
		System.out.println("2 "+Arrays.toString(arr));

		System.out.println("post selection  "+Arrays.toString(arr));
		sorting.quickSort(arr, 0, arr.length-1);
		System.out.println("2 "+Arrays.toString(arr));

		DynamicProgramming dynamicProgramming = new DynamicProgramming();
		dynamicProgramming.findAllpalindrom("abccbcmmmadammm");
		dynamicProgramming.findLargestpalindrom("abccbcmmmadammm");


	}
}
