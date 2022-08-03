package Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairSum {

    public static void findPairSumByBrute(int[] nums, int target){
        for (int i=0; i<nums.length-1; i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i] + nums[j] == target) {
                    System.out.println("Pair found (" + nums[i] + "," + nums[j] + ")");
                    return;
                }
            }
        }
        System.out.println("No pair found");
    }

    public static void findSumPairBySorting(int[] nums, int target){
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length - 1;

        while (low < high){
            if (nums[low] + nums[high] == target){
                System.out.println("Pair found (" + nums[low] + "," + nums[high] + ")");
                return;
            }

            if (nums[low] + nums[high] > target){
                high--;
            }else{
                low++;
            }
        }
        System.out.println("No pair found");
    }

    public static void findSumPairByHashMap(int[] nums, int target){
        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int i=0; i<nums.length; i++){
            if (numsMap.containsKey(target-nums[i])){
                System.out.println("Pair found (" + nums[numsMap.get(target-nums[i])] + "," + nums[i] + ")");
                return;
            }

            numsMap.put(nums[i], i);
        }
    }

    public static void main(String[] args){
        int[] arr = new int[]{8, 7, 2, 5, 3, 1};
        int target = 10;

        findPairSumByBrute(arr, target);
        findSumPairBySorting(arr, target);
        findSumPairByHashMap(arr, target);

    }
}
