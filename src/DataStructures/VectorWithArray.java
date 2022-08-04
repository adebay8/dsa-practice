package DataStructures;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VectorWithArray<T> {
    private int size;
    private int capacity;
    private T[] vector;
    private final static int INCREMENT_FACTOR = 1;
    private Class<T> vectorClass;

    public VectorWithArray(Class<T> vectorClass) {
        this.size = 0;
        this.capacity = INCREMENT_FACTOR;
        this.vectorClass = vectorClass;
        this.vector = (T[]) Array.newInstance(vectorClass, INCREMENT_FACTOR);
    }

    public VectorWithArray(Class<T> vectorClass, int initialCapacity){
        this.vector = (T[]) Array.newInstance(vectorClass, initialCapacity);
        this.size = 0;
        this.capacity = initialCapacity;
        this.vectorClass = vectorClass;
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

    public void insert(int index, T item){
        if (this.size == this.capacity) {
            T[] tempVector = (T[]) Array.newInstance(this.vectorClass, 2 * this.capacity);
            System.arraycopy(vector, 0, tempVector, 0, vector.length);

            this.capacity *= 2;
            this.vector = tempVector;
        }
        this.vector[index] = item;
        this.size += 1;
    }
}
