
public class MyLinkList {
	private Node head = null;

	public void inseart(int data) {
		Node node = new Node();
		node.setData(data);
		node.setNext(null);

		if(head == null) {
			head = node;
		} else {
			Node n = head;
			while(n.getNext() != null) {
				n = n.getNext();
			}
			n.setNext(node);
		}
	}

	public void inseartAtStart(int data) {
		Node node = new Node();
		node.setData(data);
		node.setNext(null);

		if(head == null) {
			head = node;
		} else {
			node.setNext(head);
			head = node;

		}
	}

	public void inseartAt(int pos, int data) {
		Node node = new Node();
		node.setData(data);
		node.setNext(null);

		if(pos == 0) {
			inseartAtStart(data);
		} else {
			Node n = head;
			int count = 0;
			while(count < pos-1) {
				n = n.getNext();
				count++;
			}
			node.setNext(n.getNext());
			n.setNext(node);	
		}
	}

	public int getListSize() {
		Node n = head;
		int size = 0;
		if(head == null) {
			size = 0;
		}else {
			while(n.getNext() != null) {
				n = n.getNext();
				size++;
			}
		}

		System.out.println("List size is "+size);
		return size;
	}

	public void deleteAt(int pos) {
		if(getListSize() < pos) {
			System.out.println("Doesn't exist position");
			return;
		}
		if(pos == 0) {
			head = head.getNext();
		} else {
			Node n = head;
			Node n1;
			int count = 0;
			while(count < pos -1) {
				n = n.getNext();
				count++;
			}
			n1 = n.getNext();
			n.setNext(n1.getNext());
		}
	}

	public void showList() {
		Node node = head;

		if(node.getNext() == null) {
			System.out.println(node);
		}else {
			while(node.getNext() != null) {
				System.out.println(node);
				node = node.getNext();
			}
			System.out.println(node);
		}
	}
}
