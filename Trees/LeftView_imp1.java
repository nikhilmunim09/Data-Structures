class LeftView {

     int max_level_visited = 0;

    public void leftView(Node root)
    {
        printleftview(root, 1);
        System.out.println();
    }

    public void printleftview(Node node,int curr_level)
    {
        if(node==null)
        {
            return;
        }

        if(curr_level>max_level_visited)
        {
            System.out.print(node.data+" ");
            max_level_visited++;
        }

        printleftview(node.left,curr_level+1);
        printleftview(node.right,curr_level+1);

    }
}

class LeftView_imp1 {
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

        LeftView left = new LeftView();
        left.leftView(root);
    }
}
