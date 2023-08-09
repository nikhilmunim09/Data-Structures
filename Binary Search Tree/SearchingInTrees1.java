public class SearchingInTrees1 {
    
    public static TreeNode search(TreeNode node,int value)
    {

        if(node==null || node.data==value)
        {
            return node;
        }
        else if(value>node.data)
        {
             return search(node.right, value);
        }
        else
        {
             return search(node.left, value);
        }

    }

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(70);
        root.left = new TreeNode(50);
        root.right = new TreeNode(90);
        root.left.left = new TreeNode(30);
        root.left.right = new TreeNode(60);
        root.right.left = new TreeNode(80);
        root.right.right = new TreeNode(110);

        if(search(root, 5)!=null)
        {
            System.out.println("Value found");
        }
        else 
        {
            System.out.println("Value not found.");
        }
    }

}
