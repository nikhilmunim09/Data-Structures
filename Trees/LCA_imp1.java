import java.util.ArrayList;

public class LCA_imp1 {

    static void findLCA(TreeNode root,int val1,int val2)
    {
        ArrayList <TreeNode> path1 = new ArrayList<>();
        ArrayList <TreeNode> path2 = new ArrayList<>();

        if(findPath(root, val1, path1) && findPath(root, val2, path2))
        {
            int LCA = path1.get(0).data;
            int i = 1;
            while(path1.get(i)==path2.get(i))
            {
                LCA = path1.get(i).data;
                i++;
            }
            System.out.println("LCA of "+val1+" and "+val2+" is : "+LCA);
        }
        else 
        {
            System.out.println("No common ancestor found.");
        }

    }

    static boolean findPath(TreeNode node,int val,ArrayList <TreeNode> path)
    {
        if(node==null)
        {
            return false;
        }

        path.add(node);

        if(node.data == val)
        {
            return true;
        }

        if(findPath(node.left, val, path) || findPath(node.right, val, path))
        {
            return true;
        }

        path.remove(path.size()-1);
        return false;

    }
    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(70);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(50);
        root.left.right = new TreeNode(10);
        root.left.left.left = new TreeNode(60);
        root.left.left.right = new TreeNode(40);
        root.left.right.right = new TreeNode(80);
        root.left.right.right.right = new TreeNode(100);
        root.left.left.left.left = new TreeNode(90);
        root.left.left.right.right = new TreeNode(110);

        /* 
        ArrayList <Node> path1 = new ArrayList<>();
        findPath(root, 100, path1);
        for(int i = 0 ; i < path1.size() ; i++)
        {
            System.out.print(path1.get(i).data+" ");
        }
        System.out.println();
        ArrayList <Node> path2 = new ArrayList<>();
        findPath(root, 110, path2);
        for(int i = 0 ; i < path2.size() ; i++)
        {
            System.out.print(path2.get(i).data+" ");
        }
        */

        findLCA(root, 100, 110);

    }
}
