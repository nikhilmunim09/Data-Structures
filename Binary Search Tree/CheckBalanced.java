class IsBalanced {
    
    static boolean balanced = true;

    public static int checkBalanced(TreeNode node)
    {
        if(node==null)
        {
            return 0;
        }

        int leftHeight = checkBalanced(node.left);
        int rightHeight = checkBalanced(node.right);

        if(leftHeight-rightHeight>1 || rightHeight-leftHeight>1)
        {
            balanced = false;
            System.out.println("The tree is not balanced");
        }

        return Integer.max(leftHeight, rightHeight)+1;

    }

}

class checkBalanced {

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.right = new TreeNode(5);
        root.right.left = new TreeNode(10);
        
        IsBalanced.checkBalanced(root);

    }
}
