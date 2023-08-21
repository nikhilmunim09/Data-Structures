public class Tree {

    TreeNode root;

    public void insertIterative(int value)
    {
        if(root==null)
        {
            root = new TreeNode(value);
            return;
        }

        TreeNode parent = null;
        TreeNode temp = root;

        while(temp!=null)
        {
            parent = temp;

            if(value>temp.data)
            {
                temp = temp.right;
            }
            else if(value<temp.data)
            {
                temp = temp.left;
            }
            else 
            {
                //if value is already found in the tree.
                return;
            }
            
        }

        if(value>parent.data)
        {
            parent.right=new TreeNode(value);
        }
        else
        {
            parent.left = new TreeNode(value);
        }

    }

    TreeNode deleteNode(TreeNode node,int value)
    {
        if(node==null)
        {
            return null;
        }
        else if(value>node.data) //if value is larger than current node data then it will be present in the right side of the tree.
        {
            node.right = deleteNode(node.right, value);
        }
        else if(value<node.data) //if value is larger than current node data then it will be present in the right side of the tree.
        {
            node.left = deleteNode(node.left, value);
        }
        else //value is found.
        {
            if(node.left==null)
            {
                TreeNode temp = node.right;
                node = null;
                return temp;
            }
            else if(node.right==null)
            {
                TreeNode temp = node.left;
                node = null;
                return temp;
            }
            else 
            {
                TreeNode successor = inorderSuccessor(node);
                node.data = successor.data;
                deleteNode(node.right,successor.data); // now we want to deleteNode the successor node and it will be present in right tree of the node.               
                return node; 
            }
        }

        return node;
    }

    TreeNode inorderSuccessor(TreeNode node)
    {
        TreeNode curr = node.right;
        while(curr!=null && curr.left!=null)
        {
            curr = curr.left;
        }
        return curr;
    }

}
