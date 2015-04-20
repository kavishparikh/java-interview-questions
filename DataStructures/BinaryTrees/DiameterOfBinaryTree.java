public static int getDiameter(TreeNode root) {        
    if (root == null)
        return 0;

    int rootDiameter = maximumDepth(root.left) + maximumDepth(root.right) + 1;
    
    int leftDiameter = getDiameter(root.left);
    int rightDiameter = getDiameter(root.right);

    return Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
}

public static int maximumDepth(TreeNode root) {
    if (root == null)
        return 0;

    return Math.max(maximumDepth(root.left), maximumDepth(root.right)) + 1;
}