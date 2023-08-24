public class InsertionIterative
{

    //this is static approach
    public static TreeNode insertionIterative(TreeNode root,int value)
    {
        if(root==null)
        {
            return new TreeNode(value);
        }

        TreeNode temp = root;
        TreeNode parent = null;

        while(temp!=null)
        {
            parent = temp;

            if(value>temp.data)
            {
                temp = temp.right;
            }
            else if(value<temp.data)
            {
                temp.lcount++;
                temp = temp.left;
            }
            else 
            {
                break;
            }
        }

        if(value>parent.data)
        {
            parent.right = new TreeNode(value);
        }
        else if(value<parent.data)
        {
            parent.left = new TreeNode(value);
        }
        else 
        {
            //value is already present in the tree.
        }
        

        return root;

    }

    public static void main(String[] args) {
        
        Tree tree = new Tree();
        /*tree.insertIterative(70);
        tree.insertIterative(50);
        tree.insertIterative(90);
        tree.insertIterative(30);
        tree.insertIterative(60);
        tree.insertIterative(80);
        tree.insertIterative(110);*/

        tree.root = insertionIterative(tree.root, 70);
        tree.root = insertionIterative(tree.root, 50);
        tree.root = insertionIterative(tree.root, 90);
        tree.root = insertionIterative(tree.root, 30);
        tree.root = insertionIterative(tree.root, 60);
        tree.root = insertionIterative(tree.root, 80);
        tree.root = insertionIterative(tree.root, 110);

        InOrder.inOrder(tree.root);

    }
}