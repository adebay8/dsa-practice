package examples;

import java.util.*;

public class SubArraySumZero {
    public static Boolean hasZeroSumSubArray(int[] nums){
        Set<Integer> numSet = new HashSet<>();

        numSet.add(0);
        int sum = 0;

        for (int i = 0; i<nums.length; i++){
            sum += nums[i];

            if (numSet.contains(sum)){
                return true;
            }

            numSet.add(sum);
        }

        return false;
    }

    public static void printAllSubarrayBruteForce(int[] nums){
        for (int i=0;i<nums.length;i++){
            int sum = 0;
            for (int j=i; j<nums.length;j++){
                sum += nums[j];
                if (sum == 0){
                    System.out.printf("Subarray [%d,...,%d],  ", i, j);
                }
            }
        }
    }

    private static<K, V> void insert(Map<K, List<V>> map, K key, V value){
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(value);
    }

    public static void printAllSubArrayHashMap(int[] nums){
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        int sum = 0;

        insert(sumMap,0, -1 );

        for (int i =0; i<nums.length;i++){
            sum += nums[i];

            if (sumMap.containsKey(sum)){
                for (int value: sumMap.get(sum)){
                    System.out.printf("Subarray [%d,...,%d],  ",value+1, i);
                }
            }

            insert(sumMap, sum, i);
        }
    }

    public static void main(String args[]){
        int[] array = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };

//      the problem deals with subarrays that are contiguous

        if (hasZeroSumSubArray(array)) {
            System.out.println("Subarray exists");
        }
        else {
            System.out.println("Subarray does not exist");
        }

        System.out.println("Print all sub array by brute force");
        printAllSubarrayBruteForce(array);
        System.out.println("\n");

        System.out.println("Print all sub array using multimap");
        printAllSubArrayHashMap(array);
        System.out.println("\n");



    }
}
