/*
*	Give a recursive algorithm SumDepths(...) for computing the sum
*	of the depths of all nodes in a rooted tree.
*/


// Node is assumed to have array of children
public int SumDepths(Node node, int depth){
	if(node == null)
		return 0;
	
	int sum = depth;
	
	for(Node child : node.children){
		sum += SumDepths(child, depth + 1);
	}

return sum;
}

