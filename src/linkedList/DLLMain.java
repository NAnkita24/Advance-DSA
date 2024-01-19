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
	dl.display();
	dl.deleteAtMiddle(3);
	dl.display();
}
}
