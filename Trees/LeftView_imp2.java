import java.util.LinkedList;
import java.util.Queue;

class LeftView2 {

    public void leftView2(TreeNode root)
    {
        if(root==null)
        {
            System.out.println("No element is present in the root.");
            return;
        }
        Queue <TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i = 0 ; i < size ; i++)
            {
                TreeNode temp = q.poll();
                if(i==0)
                {
                    System.out.print(temp.data+" ");
                }

                if(temp.left!=null)
                {
                    q.offer(temp.left);
                }
                if(temp.right!=null) 
                {
                    q.offer(temp.right);
                }
            }
         }
         System.out.println();
    }
}

class LeftView_imp2 {
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

        LeftView2 left2 = new LeftView2();
        left2.leftView2(root);
    }
}
