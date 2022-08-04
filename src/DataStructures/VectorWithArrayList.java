package DataStructures;

import java.util.ArrayList;

public class VectorWithArrayList<T> {
    public int capacity;
    public int size;
    public ArrayList<T> vector;
    public static final int INCREMENT_FACTOR = 16;
    /*
    * Mutable array with automatic resizing
    * */

    public VectorWithArrayList(int size){
//        this.arr = new T[]{};
        this.vector = new ArrayList<T>();
        this.capacity = size + INCREMENT_FACTOR;
        this.size = size;
    }

//    public static void main(String[] args) {
//        ArrayList<Integer> test = new ArrayList<>();
//        test.set(0,10);
//    }

    public void insert(int index, T item) {
        try {
                 vector.set(index,item);
        } catch (IndexOutOfBoundsException indexOutofBounds) {
            if (index >= 0 && index < size) {
                vector.add(index, item);
            }
            if (index >= 0 && index >= size && index < capacity){
                vector.add(index, item);
                size += 1;
                if (size == capacity) capacity += INCREMENT_FACTOR;
            }
            if (index > capacity) throw new IndexOutOfBoundsException();
        }
    }

    protected int size() {
        return size;
    }

    protected  int capacity(){
        return capacity;
    }

    protected boolean is_empty(){
        return true;
    }
}
