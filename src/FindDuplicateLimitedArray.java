package examples;

import java.util.stream.IntStream;

public class FindDuplicateLimitedArray {
    public static int findDuplicateUsingHash(int[] nums){
        boolean[] visited = new boolean[nums.length + 1];

        for (int value: nums){
            if (visited[value]){
                return value;
            }
            visited[value] = true;
        }
        return -1;
    }

    public static int findDuplicateUsingArrayIndices(int[] nums){
        int duplicate = -1;

        for (int i:nums){
            int val = (i < 0) ? -i : i;

            if (nums[val] > 0){
                nums[val] = -nums[val];
            }else{
                duplicate = val;
                break;
            }
        }

        for (int i=0; i<nums.length;i++){
            if (nums[i] < 0){
                nums[i] = -nums[i];
            }
        }

        return duplicate;
    }

    public static int findDuplicateUsingXOR(int[] nums){
        int xor = 0;

        for (int value:nums){
            xor ^= value;
        }

        for (int i = 1;i<=nums.length - 1;i++){
            xor ^= i;
        }

        return xor;
    }

    public static int findDuplicateUsingSum(int[] nums){
        int actual_sum = IntStream.of(nums).sum();
        int expected_sum = nums.length * (nums.length - 1) / 2;

        return actual_sum - expected_sum;

    }

    public static void main(String[] args){
        int[] arr = new int[]{ 1, 2, 3, 4, 2 };

        System.out.println("The duplicate element found by hash is " + findDuplicateUsingHash(arr));
        System.out.printf("The duplicate element found by indices is %d\n", findDuplicateUsingArrayIndices(arr));
        System.out.printf("The duplicate element found by xor is %d\n", findDuplicateUsingXOR(arr));
        System.out.printf("The duplicate element found by difference in sum is %d", findDuplicateUsingSum(arr));
    }
}
