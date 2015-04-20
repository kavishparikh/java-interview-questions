// Class TreeNode

// somewhere in main method 
public static void main(String[] args) {
	boolean hasSum = hasPathSum(root, sum);
}

// solved the prblem by recursion

public static boolean hasPathSum(TreeNode root, int sum) {
	if(root == null) {
		return false;
	}

	if(root.value == sum && (root.left == null  && root.right == null)) {
		return true;
	}

	return hasPathSum(root.left, sum - root.value) || hasPathSum(root.right, sum - root.value);
}