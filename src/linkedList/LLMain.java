package linkedList;

public class LLMain {
	public static void main(String[] args) {
		
		LL list = new LL();
		list.insertAtLast(4);
		list.insertAtLast(6);
		list.insertAtFirst(9);
		list.insertAtFirst(26);
		list.insertAtIndex(4,89);
		list.display();
		
//		System.out.println(list.deleteFirst());
//		System.out.println(list.deleteFirst());
//		System.out.println(list.deleteFirst());
//		System.out.println(list.deleteFirst());
//		System.out.println(list.deleteFirst());
//		System.out.println(list.deleteLast());
//		System.out.println(list.deleteLast());
//		System.out.println(list.deleteLast());
		System.out.println(list.deleteAtIndex(2));
		list.display();
		
//		list.getSize();
//		System.out.println(list.getValue(2));
//		System.out.println(list.getValue(0));
//		System.out.println(list.getValue(4));
//		list.getIndex(4);

	}
}
