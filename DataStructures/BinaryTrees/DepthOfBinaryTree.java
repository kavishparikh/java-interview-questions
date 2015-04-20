
// RECURSIVE SOLUTIONS

// maximum depth of binary tree
public static int maximumDepth(TreeNode root) {
	if(root == null) {
		return 0;
	}
	return 1 + Math.max(maximumDepth(root.left), maximumDepth(root.right));
}


// minimum depth of binary tree
public static int minimumDepth(TreeNode root) {
	if(root == null) {
		return 0;
	}
	return 1 + Math.min(minimumDepth(root.left), minimumDepth(root.right));
}


// ITERATIVE SOLUTION
public static int maximumDepthIterative(TreeNode root) {
	if(root == null)
		return 0;

	int length = 0;
	LinkedList<TreeNode> que = new LinkedList<TreeNode>();

	if(root != null) {
		que.addLast(root);
		que.addLast(null); // nodes level breaker
	}

	while(!que.isEmpty()) {
		TreeNode current = que.removeFirst();
		if(curr == null) {
			++length;
			if(!que.isEmpty())
				que.addLast(null);
		}
		if(curr.left != null)
			que.addLast(curr.left);
		if(curr.right != null)
			que.addLast(curr.right);
	}
	return length;
}


