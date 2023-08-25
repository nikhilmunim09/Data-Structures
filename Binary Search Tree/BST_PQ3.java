import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST_PQ3 {

    /*    Given the root of a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the 
          original BST is changed to the original key plus the sum of all keys greater than the original key in BST 
     */
    
    public static void greaterTree(TreeNode root)
    {
        if(root==null)
        {
            System.out.println("Tree is empty");
            return;
        }

        Stack <TreeNode> s = new Stack<>();

        int sum = 0; 

        TreeNode temp = root;

        while(!s.isEmpty() || temp!=null)
        {

            while(temp!=null)
            {
                s.push(temp);
                temp = temp.right;
            }

            temp = s.pop();

            int temp1 = temp.data;

            temp.data += sum;

            sum += temp1;

            temp = temp.left;

        }
    }

    public static void main(String[] args) {
        
        Tree tree = new Tree();
        tree.insertIterative(4);
        tree.insertIterative(1);
        tree.insertIterative(6);
        tree.insertIterative(0);
        tree.insertIterative(2);
        tree.insertIterative(5);
        tree.insertIterative(7);
        tree.insertIterative(8);
        tree.insertIterative(3);


        levelOrderTraversal(tree.root);

        greaterTree(tree.root);
        System.out.println();

        levelOrderTraversal(tree.root);
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
