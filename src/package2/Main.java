package package2;

public class Main {
	public static void main(String[] args) {
		LL l=new LL();
		l.insertAtFirst(5);
		l.insertAtFirst(15);

		l.insertAtLast(8);
		l.insertAtLast(18);

		l.insertAtIndex(2, 2);
		l.insertAtIndex(4, 12);
		l.display();

//		System.out.println(l.getSize());
//		l.getIndex(8);
		l.deleteFirst();
		l.display();

//		l.getValue(0);
//		l.getValue(1);
//		l.getValue(2);
//		l.getValue(3);

	}
}
