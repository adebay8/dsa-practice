package DataStructures.LinkedList;

public class LinkedList {
    Node head;

    public LinkedList(){
        this.head = null;
    }

    public void insert_beginning (Node node){
        if (this.head != null){
            Node current = this.head;
            node.next = current;
        }
        this.head = node;
    }

    public void insert_end(Node node){
       if (this.head == null){
           this.head = node;
       }else{
           Node current = this.head;
           while (current.next != null){
               current = current.next;
           }
           current.next = node;
       }
    }

    public void print_list (){
       Node current  = this.head;
       while(current != null){
           System.out.print("Node("+current.data + ") --> ");
           current = current.next;
       }
    }

    public static void main(String[] args){
        Node element = new Node("1");
        Node element2 = new Node("2");
        Node element3 = new Node("3");
        Node element4 = new Node("4");

        LinkedList ll = new LinkedList();
//        ll.insert_beginning(element);
//        ll.insert_beginning(element2);
//
        ll.insert_end(element4);
        ll.insert_beginning(element3);
//        ll.insert_end(element2);
//        ll.insert_end(element3);


        ll.print_list();
    }
}
