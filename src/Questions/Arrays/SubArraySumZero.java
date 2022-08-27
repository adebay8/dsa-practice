package Questions.Arrays;

import java.util.*;

public class SubArraySumZero {
    public static void main(String[] args) {
        int[] nums = new int[]{ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        System.out.println(isSubArraySumZero(nums));
        System.out.println(printAllSubarraySumZero(nums));
    }

    public static boolean isSubArraySumZero(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, -1);

        for (int i = 0; i< nums.length; i++){
            sum += nums[i];
            if (map.containsKey(sum)){
                return true;
            }
            map.put(sum, i);
        }
        return false;
    }

    private static<k,v> void insert(Map<k,List<v>> map, k key, v value){
        // if the key did not exist in the map, you want to add that key and then initiaise it with an empty array
        map.putIfAbsent(key,  new ArrayList());

        // add the value to the list of items in that key
        map.get(key).add(value);
    }

    public static List<String> printAllSubarraySumZero(int[] nums) {
        List<String> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;
        insert(map, 0, -1);

        for (int i = 0; i< nums.length;i++){
            sum += nums[i];
            if (map.containsKey(sum)){
                List<Integer> list = map.get(sum);

                for (int idx: list) {
                    result.add(Arrays.toString(Arrays.copyOfRange(nums, idx + 1, i+1)));
                }
            }
            insert(map, sum, i);
        }

        return result;
    }
}
