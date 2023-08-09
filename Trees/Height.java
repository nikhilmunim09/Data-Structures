class Height {
    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.right.left = new TreeNode(7);
        root.right.right.right = new TreeNode(9);
        root.right.right.right.right = new TreeNode(10);

        System.out.println(height(root));
    }

    public static int height(TreeNode node)
    {
        if(node==null)
        {
            return 0;
        }

        int lheight = height(node.left);
        int rheight = height(node.right);

        if(lheight>rheight)
        {
            return lheight+1;
        }
        else 
        {
            return rheight+1;
        }

        //we can also write this function as 
        //return (Integer.max(height(node.left),height(node.right)))+1;

    }
}
