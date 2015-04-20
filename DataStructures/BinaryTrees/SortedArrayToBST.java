// class TreeNode

// APPROACH : do it recursively

public static void main(String[] args) {
	int[] num = {1, 2, 3, 4, 5, 6, 7, 8}
	TreeNode tree = sortedArrayToBST(num, start, end);
	// start = num[] array start index
	// end = num[] array end index
}

public static TreeNode sortedArrayToBST(int[] num, int start, int end) {
	int mid = (start + end)/2;
	TreeNode root = new TreeNode(num[mid]);

	root.left = sortedArrayToBST(num, start, mid-1);
	root.right = sortedArrayToBST(num, mid+1, end);

	return root;
}