
// RECURSIVE SOLUTION

public static boolean isSymmetric(TreeNode root) {
	if(root == null)
		retun true;
	return isSymmetric(root.left, root.right);
}

public static boolean isSymmetric(TreeNode leftNode, TreeNode rightNode) {
	if(leftNode == null && rightNode == null) {
		return true;
	} else if(leftNode == null || rightNode == null) {
		return false;
	}

	if(leftNode.value != rightNode.value)
		return false;

	if(!isSymmetric(leftNode.left, rightNode.right))
		return false;
	if(!isSymmetric(leftNode.right, rightNode.left))
		return false;

	return true;
}