package bst;

public class Tester {
	public static void main(String[] args) {
		BST tree = new BST();
		
		
		tree.root = tree.add(tree.root, 50);
		tree.root = tree.add(tree.root, 2);
		tree.root = tree.add(tree.root, 5);
		tree.root = tree.add(tree.root, 55);
		tree.root = tree.add(tree.root, 70);

		
		tree.prePrint(tree.root);
		
		tree.remove(tree.root, 50);
		System.out.println();
		tree.prePrint(tree.root);
	}
}
