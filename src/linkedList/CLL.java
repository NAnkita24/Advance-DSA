package linkedList;

public class CLL {
	Node head;
	Node tail;
	int size=0;

	class Node{
		Node next;
		int data;

		public Node(int data) {
			this.data=data;
		}
	}

	void addAtFirst(int data) {
		Node node = new Node(data);
		if (head==null) {
			head=node;
			tail=node;
			head.next=tail;
			size++;
			return;
		}
		tail.next=node;
		node.next=head;
		head=node;

	}

	public void addAtIndex(int index, int data) {
		if (index == 0) {
			addAtFirst(data);
			return;
		} else if(index == size-1){
			addAtLast(data);
			return;
		}
		Node node =new Node(data);
		Node temp=getNode(index-1);
		node.next=temp.next;
		temp.next=node;
		size++;
	}

	Node getNode(int index) {
		Node temp =head;

		for (int i = 0; i <index; i++) {
			temp=temp.next;
		}
		return temp;
	}

	void addAtLast(int data) {
		Node node =new Node(data);

		if (tail==null) {
			head=node;
			tail=node;
			head.next=tail;
			size++;
			return;
		}

		tail.next=node;
		node.next=head;
		tail = node;
		size++;
	}

	void display() {
		Node temp=head;
		do {
			System.out.print(temp.data+"->");
			temp=temp.next;
		} 
		while(temp  != head) ;

		System.out.print("END\n");
	}

}
