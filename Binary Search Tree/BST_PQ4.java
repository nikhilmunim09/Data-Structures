import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BST_PQ4 {
    
    /*     Given two binary search trees root1 and root2, 
           return a list containing all the integers from both trees sorted in ascending order. */

    public static List<Integer> merge(TreeNode root1,TreeNode root2)
    {
        List <Integer> list = new ArrayList<>();
        TreeNode temp1 = root1;
        TreeNode temp2 = root2;

        Stack <TreeNode> s1 = new Stack<>();
        Stack <TreeNode> s2 = new Stack<>();

        while(!s1.isEmpty() && !s2.isEmpty() || temp1!=null || temp2!=null)
        {
            while(temp1!=null)
            {
                s1.push(temp1);
                temp1 = temp1.left;
            }

            while(temp2!=null)
            {
                s2.push(temp2);
                temp2 = temp2.left;
            }

            temp1 = s1.peek();
            temp2 = s2.peek();

            if(temp1.data<temp2.data)
            {
                System.out.println("Adding "+temp1.data+" from tree1 to the list");
                list.add(s1.pop().data);
                temp1 = temp1.right;
                temp2 = null;
            }
            else 
            {
                System.out.println("Adding "+temp2.data+" from tree2 to the list");
                list.add(s2.pop().data);
                temp2 = temp2.right;
                temp1 =  null;
            }
        }

        TreeNode temp = null ;
        if(!s1.isEmpty()) temp = s1.peek().left; 
             
        

        while(!s1.isEmpty() || temp != null)
        {
            while(temp!=null)
            {
                s1.push(temp);
                temp = temp.left;
            }

            temp = s1.pop();

            System.out.println("Adding "+temp.data+" from tree1 to the list");


            list.add(temp.data);

            temp = temp.right;

        }

        if(!s1.isEmpty()) temp = s2.peek().left;
        while(!s2.isEmpty())
        {
            while(temp!=null)
            {
                s2.push(temp);
                temp = temp.left;
            }

            temp = s2.pop();

            System.out.println("Adding "+temp.data+" from tree2 to the list");
            list.add(temp.data);

            temp = temp.right;

        }

        return list;
    }

    public static void main(String[] args)
     {
        Tree tree1 = new Tree();
        tree1.insertIterative(4);
        tree1.insertIterative(1);
        tree1.insertIterative(7);
        tree1.insertIterative(0);
        tree1.insertIterative(3);
        tree1.insertIterative(8);
        tree1.insertIterative(2);
        tree1.insertIterative(13);
        tree1.insertIterative(15);
        
        Tree tree2 = new Tree();
        tree2.insertIterative(6);
        tree2.insertIterative(4);
        tree2.insertIterative(8);
        tree2.insertIterative(7);
        tree2.insertIterative(2);
        tree2.insertIterative(5);
        tree2.insertIterative(10);
        tree2.insertIterative(12);


        List <Integer> list = merge(tree1.root, tree2.root);

        for(Integer x : list)
        {
            System.out.print(x+" ");
        }
    }
}
