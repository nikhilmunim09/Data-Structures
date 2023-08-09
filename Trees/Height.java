class Height {
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

        System.out.println(height(root));
    }

    public static int height(Node node)
    {
        if(node==null)
        {
            return 0;
        }

        int lheight = height(node.left);
        int rheight = height(node.right);

        if(lheight>rheight)
        {
            return lheight+1;
        }
        else 
        {
            return rheight+1;
        }

        //we can also write this function as 
        //return (Integer.max(height(node.left),height(node.right)))+1;

    }
}
