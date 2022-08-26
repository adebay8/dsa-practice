package Questions.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class PairWithSum {
    public static void main(String[] args) {
        int[] nums = new int[]{8, 7, 2, 5, 3, 1};
        System.out.println(findPairWithSumByBruteForce(nums, 10).toString());
        System.out.println(findPairWithSumBySorting(nums,10).toString());
    }

    public static ArrayList<String> findPairWithSumByBruteForce(int[] nums, int target){
        ArrayList<String> pairs = new ArrayList<>();

        for (int i=0;i<nums.length-i;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i] + nums[j] == target){
                    int[] pair = new int[]{nums[i], nums[j]};
                    pairs.add(Arrays.toString(pair));
                }
            }
        }

        return pairs;
    }

    public static ArrayList<String> findPairWithSumBySorting(int[] nums, int target) {
        ArrayList<String> pairs = new ArrayList<>();

        Arrays.sort(nums);
        int low = 0;
        int high = nums.length-1;


        while (low < high) {
            if (nums[low] + nums[high] == target) {
                int[] pair = new int[]{nums[low], nums[high]};
                pairs.add(Arrays.toString(pair));
            }

            if (nums[low] + nums[high] < target) low++;
            else high--;
        }

        return pairs;
    }
}
