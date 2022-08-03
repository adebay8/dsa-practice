package Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PrintPascalsTriangle {
    public static void main(String[] args) {
        pascalsTriangle(100);
    }

    public static int[][] pascalsTriangle(int n) {
        int[][] pt = new int[n][];

        for (int i=0;i<n;i++){
            pt[i] = new int[i+1];
            pt[i][0] = 1;

            for (int j=1;j<i;j++){
                pt[i][j] = pt[i-1][j-1] + pt[i-1][j];
            }

            pt[i][i] = 1;
            System.out.println(Arrays.toString(pt[i]));

        }


        return pt;
    }
}
