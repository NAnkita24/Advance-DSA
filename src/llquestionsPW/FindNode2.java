package llquestionsPW;

public class FindNode2 {
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
		findNode2(a,3);

	}

	private static void findNode2(Node head,int index) {
		Node slow=head;
		Node fast=head;
		for (int i = 0; i <index; i++) {
			fast=fast.next;
		}
		
		while (fast!=null) {
			fast=fast.next;
			slow=slow.next;
		}
		System.out.println(slow.val);
		
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