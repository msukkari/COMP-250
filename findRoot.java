/*
*	Write a recursive algorithm findRoot(node), whose input is a node
*	in a tree and whose output is the root node of the tree.
*
*	Assume that each node in the tree has a field named parent
*
*/


public node findRoot(Node node){
	if(node == null || node.parent == null)
		return node;

	return findRoot(node.parent);
}