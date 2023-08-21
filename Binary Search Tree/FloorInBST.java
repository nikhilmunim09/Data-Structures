public class FloorInBST {
    public static TreeNode floor(TreeNode node,int value)
    {
        TreeNode floor = null;

        TreeNode temp = node;

        while(temp!=null)
        {
            //checking if floor is null then it means smaller data is not found yet.
            if(floor==null)
            {
                if(temp.data<=value)
                {
                    floor = temp;
                }
            }
            else 
            {
                if(temp.data>floor.data && temp.data<=value)
                {
                    floor = temp;
                }
            }
            if(value<node.data)
            {
                temp = temp.left;
            }
            else if(value>node.data)
            {
                temp = temp.right;
            }
            else 
            {
                //node.data is found equal to value, hence we dont need to check any further.
                break;
            }
        }

        return floor;

    }

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(70);
        root.left = new TreeNode(50);
        root.right = new TreeNode(90);
        root.left.left = new TreeNode(30);
        root.left.right = new TreeNode(60);
        root.right.left = new TreeNode(80);
        root.right.right = new TreeNode(110);

        System.out.println(floor(root,55).data);

    }
}
