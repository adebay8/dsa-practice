import DataStructures.VectorWithArray;

public class Test {
    public static void main(String[] args) {
        VectorWithArray<Integer> vector = new VectorWithArray<>(Integer.class);

//        System.out.printf("capacity %d\n",vector.capacity());
//        System.out.printf("size %d\n",vector.size());
//        System.out.printf("is empty %b\n",vector.is_empty());

        vector.insert(0,0);
        vector.insert(1,1);
        vector.insert(2,2);
        vector.insert(3,3);
        vector.insert(4,4);
    }
}
