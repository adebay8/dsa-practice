package DataStructures.FibonacciHeap;

public class Node {
    Node parent;
    Node left;
    Node right;
    Node child;
    int degree;
    boolean mark;
    int key;

    public Node(){
        this.degree = 0;
        this.mark = false;
        this.parent = null;
        this.left = this;
        this.right = this;
        this.child = null;
        this.key = Integer.MAX_VALUE;
    }

    Node(int x){
        this();
        this.key = x;
    }

    public void set_parent(Node x){
        this.parent = x;
    }

    public Node get_parent(){
        return this.parent;
    }

    public void set_left(Node x){
        this.left = x;
    }

    public Node get_left(){
        return this.left;
    }

    public void set_right(Node x){
        this.right = x;
    }

    public Node get_right(){
        return this.right;
    }

    public void set_child(Node x){
        this.child = x;
    }

    public Node get_child(){
        return this.child;
    }

    public void set_degree(int x){
        this.degree =x;
    }

    public int get_degree(){
        return this.degree;
    }

    public void set_key(int x){
        this.key=x;
    }

    public int get_key(){
        return this.key;
    }
}
