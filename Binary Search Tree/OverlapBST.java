import java.util.LinkedList;
import java.util.Queue;

public class OverlapBST {
    
    public static void overlap(TreeNode node1,TreeNode node2,TreeNode node3)
    {

        if(node1 == null && node2 == null)
        {
            node3 = null;
            return;
        }

        if(node1!=null && node2!=null)
        {
            node3.data = node1.data+node2.data;

            node3.left = new TreeNode(0);
            overlap(node1.left, node2.left, node3.left);
            node3.right = new TreeNode(0);
            overlap(node1.right, node2.right, node3.right);
        }
        else if(node1==null && node2 !=null)
        {
            node3.data = node2.data;
            node3.left = new TreeNode(0);
            overlap(node1, node2.left, node3.left);
            node3.right = new TreeNode(0);
            overlap(node1, node2.right, node3.right);

        }
        else if(node1 != null && node2 ==null)
        {
            node3.data = node1.data;

            node3.left = new TreeNode(0);
            overlap(node1.left, node2, node3.left);
            node3.right = new TreeNode(0);
            overlap(node1.right, node2, node3.right);


        }

        

    }

    public static void main(String[] args) {

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);
        root1.left.left.left = new TreeNode(14);
        root1.left.right.left = new TreeNode(13);
        root1.right.right = new TreeNode(6);

        TreeNode root2 = new TreeNode(7);
        root2.left = new TreeNode(8);
        root2.right = new TreeNode(9);
        root2.left.left = new TreeNode(10);
        root2.right.left = new TreeNode(11);
        root2.right.left.left = new TreeNode(12);

        TreeNode root3 = new TreeNode(0);
        overlap(root1, root2, root3);

        levelOrderTraversal(root3);

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
    }


}
