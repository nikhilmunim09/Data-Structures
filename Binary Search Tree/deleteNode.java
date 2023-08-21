import java.util.LinkedList;
import java.util.Queue;

class delete {
    
    static TreeNode deleteNode(TreeNode node,int value)
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
                node.right = deleteNode(node.right,successor.data); // now we want to deleteNode the successor node and it will be present in right tree of the node.               
                return node; 
            }
        }

        return node;
    }

    static TreeNode inorderSuccessor(TreeNode node)
    {
        TreeNode curr = node.right;
        while(curr!=null && curr.left!=null)
        {
            curr = curr.left;
        }
        return curr;
    }
}

class deleteNode {
    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(70);
        root.left = new TreeNode(50);
        root.right = new TreeNode(90);
        root.left.left = new TreeNode(30);
        root.left.right = new TreeNode(60);
        root.right.left = new TreeNode(80);
        root.right.right = new TreeNode(110);

        levelOrderTraversal(root);

        delete.deleteNode(root,70);

        levelOrderTraversal(root);

    }

    public static void levelOrderTraversal(TreeNode root)
    {
        Queue <TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            TreeNode temp = q.poll();
            if(temp.left!=null)
            {
                q.offer(temp.left);
            }
            if(temp.right!=null)
            {
                q.offer(temp.right);
            }
            System.out.print(temp.data+" ");
        }

        System.out.println();
    }
}
