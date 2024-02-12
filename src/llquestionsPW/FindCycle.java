package llquestionsPW;

import java.util.Iterator;

public class FindCycle {
	Node head;
	static class Node{
		int val;
		Node next;

		public Node(int val) {
			this.val = val;
		}

		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}

	}

	public static void main(String[] args) {
		Node a = new Node(50);
		Node b = new Node(51);
		Node c = new Node(88);
		Node d = new Node(59);
		Node e = new Node(17);
		Node f = new Node(26);
		Node g = new Node(6);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = g;
		g.next = d;

		System.out.println(findcyl(a));

	}

	private static boolean findcyl(Node head) {
		Node slow=head;
		Node fast=head;

		while (fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if (slow == fast) {
				return true;
			}
		}		
		return false;
	}

	static void display(Node head){
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val+"->");
			temp = temp.next;
		}
		System.out.println("END\n");
	}

}
