public class KthSmallestInBST {
    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(70);
        root.left = new TreeNode(50);
        root.right = new TreeNode(90);
        root.left.left = new TreeNode(30);
        root.left.right = new TreeNode(60);
        root.right.left = new TreeNode(80);
        root.right.right = new TreeNode(110);

        KthSmallest.kthSmallest(root, 3);

    }


}

class KthSmallest 
{
    public static void kthSmallest(TreeNode node,int k)
    {
        if(node!=null)
        {
            kthSmallest(node.left, k);
            k--;
            if(k==0)
            {
                System.out.println(node.data);
            }
            else 
            {
                kthSmallest(node.right, k);
            }
        }

    }
}
