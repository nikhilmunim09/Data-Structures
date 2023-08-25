

public class BST_PQ1 {
    
    /*Given the root node of a BST and two integers Lower Range and Upper Range, return the 
     sum of values of all nodes with a value in the inclusive range [lower, upper] */

    public static int sumInRange(TreeNode node,int low,int high)
    {
        if(node==null)
        {
            return 0;
        }

        int sum = 0;
        
        //if nod.data is smaller than or equal to low then we dont have to check its left side
        if(node.data<=high && node.data>=low)
        {
            sum+=node.data;
        }

        //if node.data is higher than or equal to high then we dont have to check its right side.
        if(!(node.data <= low))
        {
            sum+=sumInRange(node.left, low, high);
        }

        if(!(node.data>=high))
        {
            sum+=sumInRange(node.right, low, high);
        }

        return sum;
    }

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(70);
        root.left = new TreeNode(50);
        root.right = new TreeNode(90);
        root.left.left = new TreeNode(30);
        root.left.right = new TreeNode(60);
        root.right.left = new TreeNode(80);
        root.right.right = new TreeNode(110);

        System.out.println(sumInRange(root, 30, 80));

    }

}
