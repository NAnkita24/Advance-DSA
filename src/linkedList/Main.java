package linkedList;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		
		LL list = new LL();
		list.insertAtLast(4);
		list.insertAtLast(6);
		list.insertAtFirst(9);
		list.insertAtFirst(26);
		list.display();
		list.insertAtIndex(4,89);
		list.display();
		list.getSize();
		System.out.println(list.getValue(2));
		System.out.println(list.getValue(0));
		System.out.println(list.getValue(4));
		list.getIndex(4);

	}
}
