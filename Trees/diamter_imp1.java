public class diamter_imp1 {

    public static int height(TreeNode node)
    {
        if(node==null)
        {
            return 0;
        }

        return (Integer.max(height(node.left),height(node.right)))+1;
    }
    public static int diameter(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }

        int curr_diameter = height(root.left)+height(root.right)+1;
        int lc_diameter = diameter(root.left);
        int rc_diameter = diameter(root.right);

        return Integer.max(curr_diameter,Integer.max(lc_diameter, rc_diameter));
    }

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(6);
        root.left.left.right = new TreeNode(7);
        root.left.right.right = new TreeNode(8);
        root.left.left.left.left = new TreeNode(9);
        root.left.right.right.right = new TreeNode(10);
        
        System.out.println(diameter(root));
    }
}
