package bst;

public class Node {
	int e;
	Node left;
	Node right;
	
	Node[] children;
	
	
	Node(int element){
		e = element;
	}
	
	public void testFunc(){
		for(Node child : this.children){
			// test
		}
	}
}
