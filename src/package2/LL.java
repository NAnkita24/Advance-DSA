package package2;

public class LL {
	Node head=null;
	Node tail=null;
	int size;


	class Node{
		int data;
		Node next;

		Node (int data){
			this.data=data;
		}
	}

	void insertAtFirst(int val) {
		Node node=new Node(val);

		if (tail==null) {
			head = node;
			tail = node;
			size++;
			return;
		}
		node.next=head;
		head = node;
		size++;
	}

	void insertAtLast(int val) {
		Node node=new Node(val);

		if (head==null) {
			head = node;
			tail = node;
			size++;
			return;
		}
		tail.next=node;
		tail = node;
		size++;
	}

	void insertAtIndex(int index ,int val) {
		Node node=new Node(val);

		if(index==0) {
			insertAtFirst(val);
			return;
		}
		if (index==size-1) {
			insertAtLast(val);
			return;
		}

		Node temp=head;
		for (int i = 1; i <index; i++) {
			temp=temp.next;
		}

		node.next=temp.next;
		temp.next=node;

		size++;
	}

	int getSize() {
		return size;
	}

	void getValue(int index) {
		Node temp=head;
		for (int i = 1; i <= index; i++) {
			temp = temp.next;
		}
		System.out.print(temp.data+" ");
	}


	void getIndex(int value) {
		Node temp=head;
		for (int i = 0; i <size; i++) {
			if (value==temp.data) {
				System.out.println(i);
			}
			temp=temp.next;
		}
	}

	
	void display() {
		Node temp=head;
		while (temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("END\n");
	}


}
