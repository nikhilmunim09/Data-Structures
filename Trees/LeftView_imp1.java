class LeftView {

     int max_level_visited = 0;

    public void leftView(TreeNode root)
    {
        printleftview(root, 1);
        System.out.println();
    }

    public void printleftview(TreeNode node,int curr_level)
    {
        if(node==null)
        {
            return;
        }

        if(curr_level>max_level_visited)
        {
            System.out.print(node.data+" ");
            max_level_visited++;
        }

        printleftview(node.left,curr_level+1);
        printleftview(node.right,curr_level+1);

    }
}

class LeftView_imp1 {
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

        LeftView left = new LeftView();
        left.leftView(root);
    }
}
