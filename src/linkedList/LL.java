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
	
	

	public void display() {
		Node node=head;
		
		while (node!=null) {
			System.out.print(node.data+"->");
			node=node.next;
		}
		System.out.print("END\n");
	}

}
