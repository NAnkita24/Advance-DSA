package linkedList;

import java.util.Iterator;

import javax.xml.transform.Templates;

public class DLL {
	Node head=null;
	Node tail=null;
	int size=0;

	class Node{
		Node next;
		Node prev;
		int data;

		Node(int data){
			this.data=data;
		}
	}

	void addAtFirst(int val){
		Node node=new Node(val);
		if (head==null) {
			head=node;
			tail=node;
			node.next=null;
			node.prev=null;
			size++;
			return;

		}

		node.next = head;
		head.prev=node;
		node.prev=null;
		head = node;
		size++;

	}

	void addAtLast(int val){
		Node node=new Node(val);
		if (tail==null) {
			head=node;
			tail=node;
			node.next=null;
			node.prev=null;
			size++;
			return;

		}		
		tail.next = node;
		tail=node.prev;
		node.next=null;
		tail = node;
		size++;

	}

	Node getNode(int index) {
		Node temp=head;
		for (int i = 0; i <index; i++) {
			temp=temp.next;
		}
		return temp;
	}

	void addAtIndex(int index,int val) {
		Node node =new Node(val);
		Node temp=getNode(index-1);

		node.next=temp.next;
		temp.next.prev=node;

		temp.next=node;
		node.prev=temp;
		size++;
	}

	void deleteAtFirst() {
		Node temp=head;

		temp.next.prev=null;
		head = temp.next;
		size--;

	}

	void deleteAtLast() {
		Node temp=getNode(size-2);
		temp.next=null;
		tail.prev = null;
		temp = tail;
		size--;
	}

	void deleteAtIndex(int index) {
		Node temp=getNode(index-1);
		temp.next=temp.next.next;

		Node temp1=getNode(index+1);
		temp1.prev=temp;

		size--;

	}

	int getIndex(int val) {
		Node temp=head;
		int count=0;
		
		if (val==head.data) {
			return 0;
		}
		for (int i = 1; i <size; i++) {
			temp=temp.next;
			if (val==temp.data) {
				count++;
				return i;
			}
		}
		if (count==0) {
			return -1;
		} 
		return count;
	}
	
	int getValue(int index) {
		Node temp=head;
		for (int i = 0; i <index; i++) {
			temp=temp.next;
		}
		
		return temp.data;
	}

	void display() {
		Node temp=head;
		while(temp != null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("END");
	}
}
