package linkedList;

public class DLLMain {
public static void main(String[] args) {
	DLL dl=new DLL();
	
	dl.addAtFirst(34);
	dl.addAtFirst(4);
	dl.addAtFirst(56);
	dl.addAtLast(78);
	dl.addAtLast(8);
	dl.addAtLast(7);
	dl.addAtIndex(3,26);
	dl.display();
//	dl.deleteAtFirst();
//	dl.deleteAtLast();
//	System.out.println(dl.getIndex(4));
	System.out.println(dl.getValue(6));
	System.out.println(dl.getValue(0));
	System.out.println(dl.getValue(2));
	System.out.println(dl.getValue(4));
	dl.display();
}
}
