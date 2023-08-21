public class InsertionRecursive {
    
    public static TreeNode insertionRecursive(TreeNode node,int value)
    {
        if(node==null)
        {
            return new TreeNode(value);
        }

        //this is how we can ignore same values.
        if(node.data==value)
        {
            return node;
        }

        if(value>node.data)
        {
            node.right = insertionRecursive(node.right, value);
        }
        else 
        {
            node.left = insertionRecursive(node.left, value);
        }

        return node;
    }

    public static void main(String[] args) {
        
        Tree tree = new Tree();
        tree.root = insertionRecursive(tree.root,70);
        tree.root = insertionRecursive(tree.root,50);
        tree.root = insertionRecursive(tree.root,90);
        tree.root = insertionRecursive(tree.root,30);
        tree.root = insertionRecursive(tree.root,60);
        tree.root = insertionRecursive(tree.root,80);
        tree.root = insertionRecursive(tree.root,110);

        InOrder.inOrder(tree.root);

    }

}
