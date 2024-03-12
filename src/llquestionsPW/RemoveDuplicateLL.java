package llquestionsPW;

import llquestionsPW.RemoveDuplicateLL.Node;

public class RemoveDuplicateLL {

	static class Node{
		int val;
		Node next;
		
		public Node(int val) {
			this.val=val;
		}
	}
	
	public static void display(Node head) {
		Node temp=head;
		while (temp!=null) {
			System.out.print(temp.val+"->");
			temp=temp.next;
		}
		System.out.print("END\n");
	}
	
	public static void main(String[] args) {
		Node a = new Node(10);
		Node b = new Node(20);
		Node c = new Node(20);
		Node d = new Node(40);
		Node e = new Node(50);
		Node f = new Node(60);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;

		display(a);
		remove(a);
		display(a);

	}
	
	public static void remove(Node head) {
		Node temp=head;
		
		while (temp!=null && temp.next!=null) {
			if (temp.val==temp.next.val) {
				temp.next=temp.next.next;
			}
			temp=temp.next;
		}
	}
}