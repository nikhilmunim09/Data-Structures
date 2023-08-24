import java.util.LinkedList;
import java.util.Queue;

public class InvertTheTree {
    
    public static void invert(TreeNode root)
    {
        if(root == null)
        {
            return ;
        }

        Queue <TreeNode> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty())
        {
            TreeNode curr =q.poll();

            TreeNode temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;

            if(curr.left!=null) q.offer(curr.left);
            if(curr.right!=null) q.offer(curr.right);

        }
        
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        levelOrderTraversal(root);
        invert(root);
        levelOrderTraversal(root);
    }

    public static void levelOrderTraversal(TreeNode root)
    {
        Queue <TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            TreeNode temp = q.poll();
            if(temp.left!=null)
            {
                q.offer(temp.left);
            }
            if(temp.right!=null)
            {
                q.offer(temp.right);
            }
            System.out.print(temp.data+" ");
        }
        System.out.println();
    }
}
