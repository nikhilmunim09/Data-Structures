class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    int lcount;

    TreeNode(int data)
    {
        this.data = data;
        left = right = null;
        lcount = 0;
    }
}

class Insertion {
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

        
    }
}
