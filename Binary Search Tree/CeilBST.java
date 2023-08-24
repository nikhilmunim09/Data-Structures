public class CeilBST {
    
    public static TreeNode ceil(TreeNode node,int value)
    {
        TreeNode ceil = null;

        TreeNode temp = node;

        while(temp!=null)
        {
            //checking if floor is null then it means smaller data is not found yet.
            if(ceil==null)
            {
                if(temp.data>=value)
                {
                    ceil = temp;
                    System.out.println("Now ceil is : "+ceil.data);
                }
            }
            if(ceil!=null) 
            {
                if(temp.data>=value && temp.data<ceil.data)
                {
                    ceil = temp;
                    System.out.println("Now ceil is : "+ceil.data);
                }
            }
            
            if(value>temp.data)
            {
                temp = temp.right;
            }
            else if(value<temp.data)
            {
                temp = temp.left;
            }
            else 
            {
                //node.data is found equal to value, hence we dont need to check any further.
                break;
            }
        }

        return ceil;
    }

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(70);
        root.left = new TreeNode(50);
        root.right = new TreeNode(90);
        root.left.left = new TreeNode(30);
        root.left.right = new TreeNode(60);
        root.right.left = new TreeNode(80);
        root.right.right = new TreeNode(110);

        System.out.println(ceil(root,75).data);

    }
}
