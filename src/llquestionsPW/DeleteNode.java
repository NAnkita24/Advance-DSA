package llquestionsPW;

import llquestionsPW.DeleteNode.Node;

public class DeleteNode {
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

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		
		display(a);
		deleteNode(c);
		display(a);

	}


	private static void deleteNode(Node temp) {
		temp.val=temp.next.val;
		temp.next=temp.next.next;
	}


	static int getSize(Node head) {
		Node temp=head;
		int size = 0;
		while (temp!=null) {
			size++;
			temp = temp.next;
		}
		return size;
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