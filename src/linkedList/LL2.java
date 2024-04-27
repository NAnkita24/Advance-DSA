package linkedList;

public class LL2 {
	Node head;
	Node tail;

	public class Node{
		Node next;
		int val;

		public Node(int val) {
			this.next=next;
			this.val=val;
		}
	}
	
	public int insertAtFirst(int val) {
		Node node=new Node(val);
		if (head==null) {
			head=node;
			tail=node;
			return val;
		}

		node.next=head;
		head=node;
		return val;
		
	}
	
	public int insertAtLast(int val) {
		Node node=new Node(val);
		if (tail==null) {
			insertAtFirst(val);
		}

		tail.next=node;
		tail=node;
		return val;
		
	}
	
	public int insertAtIndex(int idx,int val) {
		if (idx == 0) {
			return insertAtFirst(val);
		}
		Node node=new Node(val);
		Node temp=head;
		for (int i = 0; i < idx-1; i++) {
			temp=temp.next;
		}
		node.next=temp.next;
		temp.next=node;
		return val;
		
	}
	
	public int deleteAtFirst() {
		Node temp=head;
		int a = temp.val;
		
		head = temp.next;
		return a;
	}
	
	public int deleteAtLast() {
		Node temp=head;
		int a = temp.val;

		while (temp.next.next!=null) {
			temp=temp.next;
		}
		tail=temp;
		return a;
	}

	
	public void display() {
		Node temp=head;
		while (temp!=null) {
			System.out.print(temp.val+"->");
			temp=temp.next;
		}
		System.out.println("END");
	}
	
	public static void main(String[] args) {
		LL2 ll = new LL2();
		ll.insertAtFirst(10);
		ll.insertAtFirst(20);
//		ll.insertAtFirst(30);
//		ll.insertAtFirst(40);
//		ll.insertAtFirst(50);
		ll.display();
		ll.insertAtLast(1);
		ll.insertAtLast(2);
//		ll.insertAtLast(3);
//		ll.insertAtLast(4);
		ll.display();
		
		ll.insertAtIndex(2, 99);
		ll.display();
		ll.insertAtIndex(4, 89);
		ll.display();
//		ll.insertAtIndex(0, 79);
//		ll.display();
//		ll.insertAtIndex(12, 69);
//		ll.display();
		
		ll.deleteAtFirst();
		ll.display();
		ll.deleteAtLast();
		ll.display();
		
		
		
	}
	
}
