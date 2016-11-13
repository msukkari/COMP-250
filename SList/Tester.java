package linkedlists;

public class Tester {
	public static void main(String[] args) {
		
		SLinkedList<Integer> list = new SLinkedList<Integer>();
		
		list.addFirst(new SNode<Integer>(5));
		list.addFirst(new SNode<Integer>(2));
		list.addLast(new SNode<Integer>(12));
		list.addLast(new SNode<Integer>(0));
		list.addLast(new SNode<Integer>(9));
		list.addLast(new SNode<Integer>(15));
		list.addFirst(new SNode<Integer>(124));

		
		
		list.printList();
		list.remove(3);
		list.printList();
		list.add(3, 99);
		list.printList();
	}
}
