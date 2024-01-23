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
		size++;

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

	void deleteAtFirst() {
		Node temp=head;
		head=temp.next;
		tail.next=head;
		if (head==null) {
			tail=null;
		}
		size--;
	}

	void deleteAtLast() {
		Node temp=getNode(size-2);
		temp.next=head;
		temp=tail;	
		if (tail==null) {
			head=null;
		}
		size--;
	}

	void deleteAtIndex(int index) {
		Node temp=getNode(index-1);
		if (index==0) {
			deleteAtFirst();
		}
		else if (index==size-1) {
			deleteAtLast();
		}
		temp.next=temp.next.next;
		size--;
	}

	int getIndex(int val) {
		Node temp=head;
		int count=0;
		 if (val==head.data) {
			return 0;
		}
		for (int i = 1; i < size; i++) {
			temp=temp.next;
			if (val==temp.data) {
				count++;
				return i;
			}
		}
		if (count==0) {
			return -1;
		}

		return count;
	}
	
	int getValue(int index) {
		Node temp=head;
		
		for (int i = 0; i <index; i++) {
			temp=temp.next;
		}
		
		return temp.data;
		
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
