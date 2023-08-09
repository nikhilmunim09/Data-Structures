import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class SpiralLevelOrderUsingOneStack {

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);
        root.left.right.right = new TreeNode(9);
        root.right.left.right = new TreeNode(10);
        root.left.right.right.left = new TreeNode(11);
        root.right.left.right.right = new TreeNode(12);
        
        spiralLevelOrder(root);
       
    }

    public static void spiralLevelOrder(TreeNode root)
    {
        if(root==null)
        {
            System.out.println("No element present in the tree.");
        }

        Boolean l_to_r = true;
        Queue <TreeNode> q = new LinkedList<>();
        Stack <TreeNode> s = new Stack<>();

        q.add(root);

        while(!q.isEmpty())
        {
            int size = q.size();
            if(l_to_r)
            {
                for(int i = 0 ; i < size ; i++)
                {
                    TreeNode temp = q.poll();
                    System.out.print(temp.data+" ");
                    if(temp.left!=null)
                    {
                        q.offer(temp.left);
                    }
                    if(temp.right!=null)
                    {
                        q.offer(temp.right);
                    }
                }
                l_to_r = false;
            }
            else
            {
                for(int i = 0 ; i < size ; i++)
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
                    s.push(temp);
                }

                while(!s.isEmpty())
                {
                    System.out.print(s.pop().data+" ");
                }
                l_to_r = true;
            }
        }
    }
}