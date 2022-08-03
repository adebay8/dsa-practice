package DataStructures.FibonacciHeap;

public class FibonacciHeap {
    Node min;
    int n;
    boolean trace;
    Node found;

    public boolean get_trace(){
        return this.trace;
    }

    public void set_trace(boolean x){
        this.trace = x;
    }

    public static FibonacciHeap create_heap(){
        return new FibonacciHeap();
    }

    public FibonacciHeap(){
        min = null;
        n = 0;
        trace = false;
    }

    private void insert(Node x){
        if (min == null){
            min = x;
            x.set_left(min);
            x.set_right(min);
        }else{
            x.set_right(min);
            x.set_left(min.get_left());
            min.get_left().set_right(x);
            min.set_left(x);
            if (x.get_key() < min.get_key()){
                min = x;
            }
        }
    }

    public void insert(int key){
        insert(new Node(key));
    }

    private void display(Node c){
        System.out.print("(");
        if (c == null){
            System.out.print(")");
            return;
        }else{
            Node temp = c;
            do {
              System.out.print(temp.get_key());
              Node k = temp.get_child();
              display(k);
              System.out.print("->");
              temp = temp.get_right();
            }while(temp != c);
            System.out.print(")");
        }
    }

    public void display(){
        display(min);
        System.out.println();
    }

    public static void merge_heap(FibonacciHeap H1, FibonacciHeap H2, FibonacciHeap H3){
        H3.min = H1.min;

        if (H1.min != null && H2.min != null){
            Node t1 = H1.min.get_left();
            Node t2 = H2.min.get_left();
            H1.min.set_left(t2);
        }
    }


}
