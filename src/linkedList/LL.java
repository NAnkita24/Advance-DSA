package linkedList;

public class LL {

	Node head=null;
	Node tail=null;
	private int size=0;

	class Node{
		int data;
		Node next;

		Node(int data){
			this.data=data;
		}
	}

	void insertAtLast(int val) {
		Node temp=new Node(val);
		if (head==null) {
			head=temp;
		} 
		else {
			tail.next=temp;
		}
		tail=temp;
		size++;
	}

	public void insertAtFirst(int val) {
		Node node=new Node(val);
		if (tail==null) {
			tail=node;
		}
		else {
			node.next=head;
			head = node;
		}
		size++;
	}

	public void insertAtIndex(int index,int val){
		if (index == 0) {
			insertAtFirst(val);
			return;
		}
		if (index == size-1) {
			insertAtLast(val);
			return;
		}
		Node temp=head;
		for (int i = 1; i < index; i++) {
			temp=temp.next;
		}

		Node node=new Node(val);
		node.next=temp.next;
		temp.next=node;
		size++;
	}

	public int getSize() {
		return size;
	}

	public int getValue(int index) {

		Node temp=head;

		for (int i = 0; i <index; i++) {
			temp=temp.next;
		}
		return temp.data;
	}

	public void getIndex(int val) {
		Node temp=head;
		int count =0;
		int i = 0;
		for (i = 0; i <size; i++) {
			if (val==temp.data) {
				count++;
				break;
			}
			temp = temp.next;
		}
		if (count!=0) {
			System.out.println("Value is present at index "+i);
		}
		else {
			System.out.println("Value is not present");
		}

	}

	int deleteFirst() {
		int val=head.data;
		head = head.next;
		if (head==null) {
			tail=null;
		}
		size--;
		return val;
	}


	public void display() {
		Node node=head;

		while (node!=null) {
			System.out.print(node.data+"->");
			node=node.next;
		}
		System.out.print("END\n");
	}

	Node getNode(int index) {
		Node temp=head;
		for (int i = 0; i <index; i++) {
			temp=temp.next;
		}
		return temp;
	}

	public int deleteLast() {
		if (size == 1) {
			return deleteFirst();	
		}
		Node temp=getNode(size-2);
		int a = temp.next.data;

		tail=temp;
		temp.next=null;

		size--;
		return a;
	}

}
