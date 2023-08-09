class sizeOfBinaryTree {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        root.right.right = new TreeNode(90);
        root.left.right.left = new TreeNode(60);
        root.left.right.right = new TreeNode(70);
        root.left.right.left.left = new TreeNode(80);
        root.left.right.left.right = new TreeNode(100);

        System.out.println("Size of the Tree is : "+size(root));
    }
    public static int size(TreeNode node)
    {
        if(node==null)
        {
            return 0;
        }
        int left = size(node.left);
        int right = size(node.right);

        return left+right+1;
    }
}