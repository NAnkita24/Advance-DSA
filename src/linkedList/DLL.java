package linkedList;

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

	void deleteAtMiddle(int index) {
		Node temp=getNode(index-1);
		temp.next=temp.next.next;
		
		Node temp1=getNode(index+1);
		temp1.prev=temp;

		size--;
		
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
