public class diamter_imp1 {

    public static int height(Node node)
    {
        if(node==null)
        {
            return 0;
        }

        return (Integer.max(height(node.left),height(node.right)))+1;
    }
    public static int diameter(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        int curr_diameter = height(root.left)+height(root.right)+1;
        int lc_diameter = diameter(root.left);
        int rc_diameter = diameter(root.right);

        return Integer.max(curr_diameter,Integer.max(lc_diameter, rc_diameter));
    }

    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(6);
        root.left.left.right = new Node(7);
        root.left.right.right = new Node(8);
        root.left.left.left.left = new Node(9);
        root.left.right.right.right = new Node(10);
        
        System.out.println(diameter(root));
    }
}
