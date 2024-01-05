package linkedList;

import java.util.concurrent.CountDownLatch;

public class Basics {

	public static void displayr(Node head) {
		if (head==null) {
			return;
		}
		displayr(head.next);
		System.out.print(head.data+" ");
	}

	
	public static void display(Node head) {
		while (head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	
	
	public static int length(Node head) {
		int count=0;
		while (head!=null) {
			count++;
			head=head.next;
		}
		return count;
	}

	
	public static class Node{
		int data;
		Node next;

		Node(int data){
			this.data=data;
		}
	}

	
	public static void main(String[] args) {
		Node a=new Node(4);
		//	System.out.println(a.next);
		Node b=new Node(5);
		Node c=new Node(6);
		Node d=new Node(7);
		Node e=new Node(8);

		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		display(a);
		System.out.println();
		displayr(a);
		System.out.println("\n"+length(a));

		//		System.out.println(a.next);
		//		System.out.println(b);
		//		System.out.println(c);
		//		System.out.println(c.next);
		//		System.out.println(d);
		//		System.out.println(e);

		//		Node temp=a;

		//		for (int i = 0; i <5; i++) {
		//			System.out.println(temp.data+" ");
		//			temp=temp.next;
		//		}

		//		while (temp!=null) {
		//			System.out.println(temp.data);
		//			temp=temp.next;
		//		}

	}
}
