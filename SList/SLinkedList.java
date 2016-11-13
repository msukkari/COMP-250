package linkedlists;

public class SLinkedList<E> {
	
	//Fields
	SNode<E> head;
	SNode<E> tail;
	int size;
	
	
	//Constructor
	SLinkedList(){
		head = null;
		tail = null;
		size = 0;
	}
	
	
	//Methods
	
	void addFirst(SNode<E> newNode)
	{
		if(size == 0){
			head = newNode;
			tail = newNode;
			size++;
		}
		else{
			newNode.next = head;
			head = newNode;
			
			size++;
		}
	}
	
	void addLast(SNode<E> newNode){
		if(size == 0){
			head = newNode;
			tail = newNode;
			size++;
		}
		else{
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}
	
	void printList()
	{
		SNode<E> tmp;
		tmp = head;
		System.out.print("(");
		while(tmp.next != null)
		{
			System.out.print(tmp.e + ",");
			tmp = tmp.next;
		}
		System.out.print(tmp.e);
		System.out.println(")");
	}
	
	public int getIndexOf(E element){
		SNode<E> cur = head;
		int index = 0;
		
		while(cur.next != null && cur.e != element){
			cur = cur.next;
			index++;
		}
		
		if(cur.e == element)
			return index;
		else
			return -1;
		
	}
	
	public void reverse(){
		SNode<E> prev, cur, next;
		
		if(head != null){
			prev = null;
			cur = head;
		}
		else{
			System.out.println("List is empty");
			return;
		}
		
		while(cur != null){
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		
		tail = head;
		head = prev;
		
	}
	
	public void remove(int i){ //assuming you're not removing first or last
		SNode<E> tmp = head;
		int counter = 0;
		size--;
		while(counter != (i-1)){
			counter++;
			tmp = tmp.next;
		}
		
		SNode<E> nodeToRemove = tmp.next;
		tmp.next = nodeToRemove.next;
		nodeToRemove.next = null;
	}
	
	public void add(int i , E e){
		SNode<E> nodeToAdd = new SNode<E>(e);
		SNode<E> tmp = head;
		size++;
		int counter = 0;
		while(counter != (i-1)){
			tmp = tmp.next;
			counter++;
		}
		
		nodeToAdd.next = tmp.next;
		tmp.next = nodeToAdd;
	}
	
}
