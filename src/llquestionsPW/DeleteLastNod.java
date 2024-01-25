package llquestionsPW;

public class DeleteLastNod {
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
		deleteNode(a,2);
		display(a);

	}


	private static void deleteNode(Node head,int index) {
		Node slow=head;
		Node fast=head;
		for (int i = 0; i <index; i++) {
			fast=fast.next;
		}
		
		while (fast!=null) {
			fast=fast.next;
			slow=slow.next;
		}
		
		slow.val=slow.next.val;
		slow.next=slow.next.next;
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