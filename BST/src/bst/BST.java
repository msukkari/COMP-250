package bst;

public class BST {
	public Node root;
	
	BST(){
		root = null;
	}
	
	public Node add(Node node, int val){
		if(node == null)
			node = new Node(val);
		else{
			if(val > node.e)
				node.right = add(node.right, val);
			else if(val < node.e)
				node.left = add(node.left, val);			
		}
		
		return node;
	}
	
	public void prePrint(Node node){
		if(node == null)
			return;
		else{
			System.out.print(node.e + " ");
			prePrint(node.left);
			prePrint(node.right);
		}
	}
	
	public void postPrint(Node node){
		if(node != null){
			postPrint(node.left);
			postPrint(node.right);
			System.out.print(node.e + " ");
		}
	}

	
}
