public class SearchingInTrees2 {
    
    public static TreeNode search(TreeNode root,int val)
    {

        TreeNode temp = root;

        while(temp!=null)
        {
            if(temp.data==val)
            {
                return temp;
            }
            else if(val>temp.data)
            {
                temp = temp.right;
            }
            else
            {
                temp = temp.left;
            }
        }

        return null;

    }

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(70);
        root.left = new TreeNode(50);
        root.right = new TreeNode(90);
        root.left.left = new TreeNode(30);
        root.left.right = new TreeNode(60);
        root.right.left = new TreeNode(80);
        root.right.right = new TreeNode(110);

        if(search(root, 80)!=null)
        {
            System.out.println("Value found");
        }
        else 
        {
            System.out.println("Value not found.");
        }
    }

}
