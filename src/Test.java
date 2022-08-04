import DataStructures.VectorWithArray;

public class Test {
    public static void main(String[] args) {
        VectorWithArray<Integer> vector = new VectorWithArray<>(Integer.class);

        System.out.printf("capacity %d\n",vector.capacity());
        System.out.printf("size %d",vector.size());
    }
}
