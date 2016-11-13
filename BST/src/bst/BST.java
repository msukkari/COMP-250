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
	
	public Node remove(Node node, int val){
		if(node == null){
			return node;
		}
		
		if(val > node.e)
			node.right = remove(node.right, val);
		else if(val < node.e)
			node.left = remove(node.left, val);
		else if(node.right == null)
			node = node.left;
		else if(node.left == null)
			node = node.right;
		else{
			node.e = findMin(node.right).e;
			node.right = remove(node.right, node.e);
		}
		
		
		return node;
	}
	
	public Node findMin(Node node){
		if(node.left == null || node == null)
			return node;
		else
			return findMin(node.left);
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
