public class LCA_MyMethod {

    public static void LCA(TreeNode root,int target1,int target2)
    {
        int result = findLCA(root, target1, target2);
        
        if(result==Integer.MAX_VALUE || result == Integer.MAX_VALUE-1 || result == Integer.MIN_VALUE)
        {
            System.out.println("No common ancestor found.");
            return;
        }

        System.out.println("LCA of "+target1+" and "+target2+" is : "+result);
    }

    public static int findLCA(TreeNode node,int target1,int target2)
    {
        if(node==null)
        {
            return Integer.MIN_VALUE;
        }

        if(node.data==target1)
        {
            return Integer.MAX_VALUE;
        }
        if(node.data==target2)
        {
            return Integer.MAX_VALUE-1;
        }

        int leftSide = findLCA(node.left, target1, target2);
        int rightSide = findLCA(node.right, target1, target2);

        if( (leftSide==Integer.MAX_VALUE && rightSide == Integer.MAX_VALUE-1) || (rightSide == Integer.MAX_VALUE && leftSide == Integer.MAX_VALUE-1) )
        {
            System.out.println("LCA of "+target1+" and "+target2+" is : "+node.data);
            return node.data;
        }

        return Integer.max(leftSide, rightSide);


    }

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(70);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(50);
        root.left.right = new TreeNode(10);
        root.left.left.left = new TreeNode(60);
        root.left.left.right = new TreeNode(40);
        root.left.right.right = new TreeNode(80);
        root.left.right.right.right = new TreeNode(100);
        root.left.left.left.left = new TreeNode(90);
        root.left.left.right.right = new TreeNode(110);

        LCA(root, 110, 100);
    }
}
