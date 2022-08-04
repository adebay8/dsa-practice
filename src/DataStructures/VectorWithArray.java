package DataStructures;

import java.lang.reflect.Array;

public class VectorWithArray<T> {
    private int size;
    private int capacity;
    private T[] vector;
    private final static int INCREMENT_FACTOR = 16;

    public VectorWithArray(Class<T> vectorClass) {
        this.size = 0;
        this.capacity = INCREMENT_FACTOR;
        this.vector = (T[]) Array.newInstance(vectorClass, INCREMENT_FACTOR);
    }

    public VectorWithArray(Class<T> vectorClass, int initialCapacity){
        this.vector = (T[]) Array.newInstance(vectorClass, initialCapacity);
        this.size = 0;
        this.capacity = initialCapacity;
    }

    public int size(){
        return this.size;
    }

    public int capacity(){
        return this.capacity;
    }

    public boolean is_empty(){
        return size == 0;
    }

    public T at(int index) {
        // reimplement to make use of pointers
        return vector[index];
    }

    public void insert(int index, int item){

    }
}
