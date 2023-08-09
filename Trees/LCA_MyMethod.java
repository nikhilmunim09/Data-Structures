public class LCA_MyMethod {

    public static void LCA(Node root,int target1,int target2)
    {
        int result = findLCA(root, target1, target2);
        
        if(result==Integer.MAX_VALUE || result == Integer.MAX_VALUE-1 || result == Integer.MIN_VALUE)
        {
            System.out.println("No common ancestor found.");
            return;
        }

        System.out.println("LCA of "+target1+" and "+target2+" is : "+result);
    }

    public static int findLCA(Node node,int target1,int target2)
    {
        if(node==null)
        {
            return Integer.MIN_VALUE;
        }

        if(node.data==target1)
        {
            return Integer.MAX_VALUE;
        }
        if(node.data==target2)
        {
            return Integer.MAX_VALUE-1;
        }

        int leftSide = findLCA(node.left, target1, target2);
        int rightSide = findLCA(node.right, target1, target2);

        if( (leftSide==Integer.MAX_VALUE && rightSide == Integer.MAX_VALUE-1) || (rightSide == Integer.MAX_VALUE && leftSide == Integer.MAX_VALUE-1) )
        {
            System.out.println("LCA of "+target1+" and "+target2+" is : "+node.data);
            return node.data;
        }

        return Integer.max(leftSide, rightSide);


    }

    public static void main(String[] args) {
        
        Node root = new Node(70);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(50);
        root.left.right = new Node(10);
        root.left.left.left = new Node(60);
        root.left.left.right = new Node(40);
        root.left.right.right = new Node(80);
        root.left.right.right.right = new Node(100);
        root.left.left.left.left = new Node(90);
        root.left.left.right.right = new Node(110);

        LCA(root, 110, 100);
    }
}
