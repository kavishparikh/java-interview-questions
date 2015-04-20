// APPROACH : Go down through left of tree, if the right is not null, push right to the stack

public static void flattenBInaryTree(TreeNode root) {
	TreeNode p = root;
	Stack<TreeNode> theStack = new Stack<TreeNode>();

	while(p != null || (!theStack.empty())) {
		if(p.right != null) {
			theStack.push(p.right);
		}

		if(p.left != null) {
			p.right = p.left;
			p.left = null;
		} else if(!theStack.empty()) {
			TreeNode temp = theStack.pop();
			p.right = temp;
		}
		p = p.right;
	}
}