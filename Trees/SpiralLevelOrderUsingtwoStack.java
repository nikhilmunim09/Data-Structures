import java.util.Stack;

public class SpiralLevelOrderUsingtwoStack {

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
            System.out.println("No element is present in the Tree.");
            return;
        }

        Stack <TreeNode> s1 = new Stack<>();
        Stack <TreeNode> s2 = new Stack<>();
        Boolean l_to_r = true;

        s1.push(root);

        while(!s1.isEmpty() || !s2.isEmpty())
        {
            if(l_to_r)
            {
                while(!s1.isEmpty())
                {
                    TreeNode temp = s1.pop();
                    System.out.print(temp.data+" ");
                    if(temp.left!=null)
                    {
                        s2.push(temp.left);
                    }
                    if(temp.right!=null)
                    {
                        s2.push(temp.right);
                    }
                }
                l_to_r=false;
            }
            else 
            {
                while(!s2.isEmpty())
                {
                    TreeNode temp = s2.pop();
                    System.out.print(temp.data+" ");
                    if(temp.right!=null)
                    {
                        s1.push(temp.right);
                    }
                    if(temp.left!=null)
                    {
                        s1.push(temp.left);
                    }
                }
                l_to_r = true;
            }
        }

    }
}
