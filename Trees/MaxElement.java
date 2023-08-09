public class MaxElement {

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

        System.out.println("Max element of the Tree is : "+maxElement(root));
        
    }
    public static int maxElement(Node node)
    {
        if(node==null)
        {
            return Integer.MIN_VALUE;
        }
        return Integer.max(node.data,Integer.max(maxElement(node.left),maxElement(node.right)));
    }
}
