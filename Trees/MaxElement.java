public class MaxElement {

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

        System.out.println("Max element of the Tree is : "+maxElement(root));
        
    }
    public static int maxElement(TreeNode node)
    {
        if(node==null)
        {
            return Integer.MIN_VALUE;
        }
        return Integer.max(node.data,Integer.max(maxElement(node.left),maxElement(node.right)));
    }
}
