package DataStructures.Trees;

class Node{
    int item;
    Node left,right;

    public Node(int key){
        item = key;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    BinaryTree(){
        root=null;
    }

    void postorder(Node node){
        if (node == null){
            return;
        }

        this.postorder(node.left);
        this.postorder(node.right);
        System.out.print(node.item + "->");
        
    }

    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(12);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(6);

        System.out.println("\nPostorder traversal");
        tree.postorder(tree.root);
    }
}
