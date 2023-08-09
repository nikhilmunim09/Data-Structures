class sizeOfBinaryTree {
    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(90);
        root.left.right.left = new Node(60);
        root.left.right.right = new Node(70);
        root.left.right.left.left = new Node(80);
        root.left.right.left.right = new Node(100);

        System.out.println("Size of the Tree is : "+size(root));
    }
    public static int size(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        int left = size(node.left);
        int right = size(node.right);

        return left+right+1;
    }
}