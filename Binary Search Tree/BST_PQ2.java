public class BST_PQ2 {
    
    /*   You are given the root of a BST and an integer val. Find the node in the BST that the node's value equals val 
         and return the subtree rooted with that node. If such a node does not exist, return null. */
         
    public static TreeNode searchNode(TreeNode node,int val)
    {
        if(node==null)
        {
            return null;
        }

        if(val>node.data)
        {
            return searchNode(node.right, val);
        }
        else if(val<node.data)
        {
            return searchNode(node.left, val);
        }
        else 
        {
            return node;
        }
    }

}
