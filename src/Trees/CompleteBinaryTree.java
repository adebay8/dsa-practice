package Trees;

public class CompleteBinaryTree {
    class Node{
        int data;
        Node left,right;

        Node(int item){
            data=item;
            left = right = null;
        }
    }

    class BinaryTree{
        Node root;
        int countNumNodes(Node root){
            if (root == null) return 0;
            return (1+countNumNodes(root.left) + countNumNodes(root.right));
        }

        boolean checkComplete(Node root, int index, int numberNodes){
            if (root == null){
                return true;
            }

            if (index >= numberNodes) return false;

            return false;
        }
    }
}
