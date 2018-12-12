
public class Driver {
	public static void main(String[] args) {
		DLList l=new DLList();
		l.append(2);
		l.Insert(5);
		l.Insert(6);
		l.Insert(7);
		l.Insert(9);
		System.out.println("The doubly inserted  Linked list ");
		l.print();
		l.InsertAfter(DLList.Head.next, 11);
		l.print();
		l.deleteNode(DLList.Head, DLList.Head);
		//l.InsertPos(4, 1);
		l.print();

	}
}

