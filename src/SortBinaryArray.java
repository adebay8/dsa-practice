package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortBinaryArray {
    public static void sortByCountingZeros(int[] nums){
        int zeros = 0;

        for (int value: nums){
            if (value == 0){
                zeros++;
            }
        }

        int k=0;

        while(zeros-- != 0){
            nums[k++] = 0;
        }

        for (int i=k; i<nums.length;i++){
            nums[i] = 1;
        }
    }

    public static void swap(int[] nums, int i, int j){
        int item = nums[i];
        nums[i] = nums[j];
        nums[j] = item;
    }

    public static void sortBySwappingZerosandOnes(int[] nums){
        int k=0;

        for (int i=0; i<nums.length;i++){
            if (nums[i] == 0){
                swap(nums, i, k);
                k++;
            }
        }

        while (k<nums.length){
            
        }
    }

    public static void main(String[] args){
        int[] A = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };

        sortByCountingZeros(A);

        // print the rearranged array
        System.out.println(Arrays.toString(A));
    }
}
