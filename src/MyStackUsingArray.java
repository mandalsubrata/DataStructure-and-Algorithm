import java.util.Arrays;

public class MyStackUsingArray {
	private int size = 0;
	private int top = 0;
	private int[] stack;

	private MyStackUsingArray() {}
	public MyStackUsingArray(int size) {
		this.size = size;
		stack = new int[size];
	}

	public void push(int data) {
		if(top > size) {
			System.out.println("Stack is overflow");
			return;
		}
		stack[top] = data;
		top++;
	}

	public int pop() {
		if(top == 0) {
			System.out.println("Stack is underflow");
			return -1;
		}
		int delete = stack[--top];
		stack[top] = 0;
		//top --;
		return delete;
	}
	@Override
	public String toString() {
		return "MyStackUsingArray [size=" + top + ", stack=" + Arrays.toString(stack) + "]";
	}

}
