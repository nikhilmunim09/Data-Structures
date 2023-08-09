import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

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

        levelOrderTraversal(root);
    }
    public static void levelOrderTraversal(Node root)
    {
        Queue <Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
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
            System.out.print(temp.data+" ");
        }
    }
}
