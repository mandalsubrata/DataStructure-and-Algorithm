import java.util.ArrayList;
import java.util.List;

public class MyStackUsingLinkList {
	List<Integer> list = new ArrayList<Integer>();
	int top = 0;

	public void push(int data) {
		if(list.isEmpty()) {
			list.add(top, data);
		}else {
			list.add(++top, data);
		}
	}

	public int pop() {

		if(list.isEmpty()) {
			System.out.println("Stack is empty");
		}
		int dd = list.remove(top);
		System.out.println("tobe delete = "+dd);
		top--;
		return dd;
	}

	public void showstack() {
		list.stream().forEach(System.out::println);
	}
}
