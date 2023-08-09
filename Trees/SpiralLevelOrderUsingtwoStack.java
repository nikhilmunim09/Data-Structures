import java.util.Stack;

public class SpiralLevelOrderUsingtwoStack {

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
            System.out.println("No element is present in the Tree.");
            return;
        }

        Stack <Node> s1 = new Stack<>();
        Stack <Node> s2 = new Stack<>();
        Boolean l_to_r = true;

        s1.push(root);

        while(!s1.isEmpty() || !s2.isEmpty())
        {
            if(l_to_r)
            {
                while(!s1.isEmpty())
                {
                    Node temp = s1.pop();
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
                    Node temp = s2.pop();
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
