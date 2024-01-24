package llquestionsPW;

public class FindEndNode {
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
		findNode(a,3);

	}

	private static void findNode(Node head,int index) {
		int size=0;
		Node temp=head;
		while (temp!=null) {
			temp=temp.next;
			size++;
		}

		int itr=size-index+1;
		temp=head;
		for (int i = 0; i <itr-1; i++) {
			temp=temp.next;
		}
		System.out.println(temp.val);
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