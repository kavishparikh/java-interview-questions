class TreeNode {
	int value;
	TreeNode left;
	TreeNode right;

	public TreeNode(int value) {
		value = value;
	}
}

// somewhere in public static void main(String[] args) { }

public static void main(String[] args) {
	boolean isValid = validate(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
}

public static boolean validate(TreeNode root, int min, int max) {
	if(root == null)
		return true;

	if(root.value <= min || root.value >= max)
		return false;

	return validate(root.left, min, root.value) && validate(root.right, root.value, max);
}