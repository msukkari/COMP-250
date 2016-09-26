package linkedlist;

public class DLinkedList<E> {
	
	//Fields
	DNode<E> head;
	DNode<E> tail;
	int size;
	
	
	//Constructor
	DLinkedList(){
		head = null;
		tail = null;
		size = 0;
	}
	
	public void addFirst(DNode<E> newNode){
		if(head == null){
			size++;
			head = newNode;
		}
		else{
			newNode.next = head;
			head = newNode;
			size++;
		}
	}
}
