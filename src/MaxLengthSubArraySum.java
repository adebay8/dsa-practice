package examples;

import java.util.HashMap;
import java.util.Map;

public class MaxLengthSubArraySum {
    public static void findMaxLengthSubArraySumByBrute(int[] nums, int target_sum){
        int len = 0;
        int ending_index = -1;

        for (int i=0; i<nums.length;i++){
            int current_sum = 0;

            for (int j=i; j<nums.length; j++){
                current_sum += nums[j];

                if (current_sum == target_sum && len < j-i+1){
                    len = j-i+1;
                    ending_index=j;
                }
            }
        }

        System.out.printf("[%d,...,%d]\n", ending_index-len+1, ending_index);
    }

    public static void findMaxLengthSubArrayUsingMap(int[] nums, int target_sum){
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int len = 0;
        int current_sum = 0;
        int ending_index = -1;

        for (int i=0; i<nums.length;i++){
            current_sum += nums[i];
            map.putIfAbsent(current_sum, i);

            if (map.containsKey(current_sum-target_sum) && len < i-map.get(current_sum-target_sum)){
                len=i-map.get(current_sum-target_sum);
                ending_index=i;
            }
        }

        System.out.printf("[%d,...,%d]\n", ending_index-len+1, ending_index);
    }

    public static void main(String[] args){
        int[] arr = new int[]{ 5, 6, -5, 5, 3, 5, 3, -2, 0 };
        int target = 8;

        findMaxLengthSubArraySumByBrute(arr, target);
        findMaxLengthSubArrayUsingMap(arr, target);
    }
}
