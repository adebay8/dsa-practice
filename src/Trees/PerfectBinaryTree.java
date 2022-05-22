package Trees;

public class PerfectBinaryTree {
    static class Node{
        int key;
        Node left,right;
    }

    static int depth(Node node){
        int d = 0;
        while (node != null){
            d++;
            node = node.left;
        }
        return d;
    }

    static boolean is_perfect(Node root, int d, int level){
        if (root == null){
            return true;
        }
        if ((root.left == null) && (root.right == null)) return (d == level+1);
        if ((root.left != null) && (root.right!=null)) return is_perfect(root.left, d, level+1) && is_perfect(root.right,d,level+1);

        return false;
    }
}
