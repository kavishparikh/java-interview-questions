public static void traverseSpiral(TreeNode root) {
    Stack<TreeNode> st1 = new Stack<TreeNode>();
    Stack<TreeNode> st2 = new Stack<TreeNode>();

    st1.push(root);

    while(st1.size() > 0 || st2.size() > 0) {
        
        while(st1.size() > 0) {
            TreeNode n = st1.pop();
            n.printNode();
            if(n.right != null)
                st2.push(n.right);
            if(n.left != null)
                st2.push(n.left);
        }

        while(st2.size() > 0) {
            TreeNode n = st2.pop();
            n.printNode();
            if(n.left != null)
                st1.push(n.left);
            if(n.right != null)
                st1.push(n.right);
        }
    }
}