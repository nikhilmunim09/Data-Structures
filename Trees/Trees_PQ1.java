import java.util.*;

public class Trees_PQ1 {
    public static ArrayList<Integer> inOrder(TreeNode root)
    {
        
        ArrayList <Integer> list = new ArrayList<>();
        //checking if root is null or not
        if(root==null)
        {
            System.out.println("No element present in the Tree.");
            return list;
        }

        Stack <TreeNode> s = new Stack<>();
        TreeNode temp = root;
        while(temp!=null || !s.isEmpty())
        {
            //adding element untill the node has left child.
            //if temp is null then we will not add it.
            while(temp!=null)
            {
                s.push(temp);
                temp = temp.left;
            }

            //popping the last element in the stack and adding its right child.
            //if right child is null it will not be added to the stack and last element will be popped.

            temp = s.pop();
            
            list.add(temp.data);

            temp = temp.right;
        }

        return list;

    }

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

        
        ArrayList <Integer> list = new ArrayList<>();
        list = inOrder(root);
        for(Integer i : list)
        {
            System.out.print(i+" ");
        }
    }
}
