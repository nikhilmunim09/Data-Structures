public class PrintNodesAtDistanceK {
    
    public static void printDown(Node node,int k)
    {
        if(node==null)
        {
            return;
        }
        if(k==0)
        {
            System.out.print(node.data+" ");
            return;
        }
        k = k-1;
        printDown(node.left,k);
        printDown(node.right,k);
    }

    public static int printAtK(Node node,int target ,int k)
    {
        if(node==null)
        {
            return Integer.MIN_VALUE;
        }
        if(node.data==target)
        {
            printDown(node, k);
            return k-1;
        }
        int left=printAtK(node.left, target, k);
        int right=printAtK(node.right, target, k);
        if(left==0 || right ==0)
        {
            System.out.print(node.data+" ");
        }
        if(left==Integer.MIN_VALUE && right==Integer.MIN_VALUE)
        {
            return Integer.MIN_VALUE;
        }
        if(right!=Integer.MIN_VALUE)
        {
            printDown(node.left,right-1);
            return right - 1;
        }
        if(left!=Integer.MIN_VALUE)
        {
            printDown(node.right,left-1);
            return left - 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.right.left = new Node(7);
        root.right.right.right = new Node(8);
        root.right.right.right.right = new Node(9);

        printAtK(root, 5 , 5);
    }
}
