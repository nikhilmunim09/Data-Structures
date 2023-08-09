import java.util.*;

public class Trees_PQ1 {
    public static ArrayList<Integer> inOrder(Node root)
    {
        
        ArrayList <Integer> list = new ArrayList<>();
        //checking if root is null or not
        if(root==null)
        {
            System.out.println("No element present in the Tree.");
            return list;
        }

        Stack <Node> s = new Stack<>();
        Node temp = root;
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
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.right.left = new Node(7);
        root.right.right.right = new Node(9);
        root.right.right.right.right = new Node(10);

        
        ArrayList <Integer> list = new ArrayList<>();
        list = inOrder(root);
        for(Integer i : list)
        {
            System.out.print(i+" ");
        }
    }
}
