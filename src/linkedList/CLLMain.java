package linkedList;

public class CLLMain {
	public static void main(String[] args) {
		CLL cll=new CLL();
		cll.addAtLast(9);
		cll.addAtLast(18);
		cll.addAtLast(78);
		cll.addAtFirst(44);
		cll.addAtIndex(2,22);
		cll.addAtIndex(4,32);
		cll.addAtIndex(0,2);
		cll.addAtIndex(10,99);
		cll.display();
		cll.deleteAtFirst();
		cll.deleteAtLast();
		cll.deleteAtIndex(4);
		cll.display();
		System.out.println(cll.getIndex(78));
		System.out.println(cll.getValue(4));
		
	}
}
