package llquestionsPW;

import llquestionsPW.Template.Node;

public class Cycle2 {

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
			temp=temp.next;
			System.out.print(temp.val+"->");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node a = new Node(10);
		Node b = new Node(20);
		Node c = new Node(30);
		Node d = new Node(40);
		Node e = new Node(50);
		Node f = new Node(60);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = b;

		detectCycle(a);
	}

	static void detectCycle(Node head){
		Node slow=head;
		Node fast=head;

		while (fast!=null && fast.next != null) {
			slow=slow.next;
			fast=fast.next.next;
			if (slow==fast) {
				System.out.println("Cycle present");
				break;
			}
		}
		
		slow=head;
		while (fast != null) {
			slow=slow.next;
			fast=fast.next;
			if(slow == fast) {
				break;
			}
		}
		System.out.println(slow.val);
	}

}