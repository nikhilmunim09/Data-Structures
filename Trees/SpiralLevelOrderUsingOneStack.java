import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class SpiralLevelOrderUsingOneStack {

    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.right.right = new Node(9);
        root.right.left.right = new Node(10);
        root.left.right.right.left = new Node(11);
        root.right.left.right.right = new Node(12);
        
        spiralLevelOrder(root);
       
    }

    public static void spiralLevelOrder(Node root)
    {
        if(root==null)
        {
            System.out.println("No element present in the tree.");
        }

        Boolean l_to_r = true;
        Queue <Node> q = new LinkedList<>();
        Stack <Node> s = new Stack<>();

        q.add(root);

        while(!q.isEmpty())
        {
            int size = q.size();
            if(l_to_r)
            {
                for(int i = 0 ; i < size ; i++)
                {
                    Node temp = q.poll();
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
                    Node temp = q.poll();
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