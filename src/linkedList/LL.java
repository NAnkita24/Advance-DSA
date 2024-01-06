package linkedList;

import java.security.PublicKey;

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

	public int getSize() {
		return size;
	}

	public int getValue(int index) {

		Node temp=head;

		for (int i = 0; i <index; i++) {
			temp=temp.next;
		}
		return temp.data;
	}

	public void getIndex(int val) {
		Node temp=head;
		int count =0;
		int i = 0;
		for (i = 0; i <size; i++) {
			if (val==temp.data) {
				count++;
				break;
			}
			temp = temp.next;
		}
		if (count!=0) {
			System.out.println("Value is present at index "+i);
		}
		else {
			System.out.println("Value is not present");
		}

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
