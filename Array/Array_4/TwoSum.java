package Array_4;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] ans = findTwoSum(nums,target);
        System.out.println(ans[0] + " " +ans[1]);
    }

    // If Array is sorted than we can use the two pointer method for the optimal soln
    // private static int[] findTwoSum(int[] nums, int target) {
    //     int start =0;
    //     int end = nums.length - 1;
    //     while(start<end){
    //         if(nums[start]+nums[end]>target) end--;
    //         if(nums[start]+nums[end]<target) start++;
    //         else return new int[]{start,end};
    //     }
    //     return new int[]{-1,-1};
    // }

    // If Array is not sorted we can use hashmap to store the sum
    private static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int diff = target - num;
            if(hmap.containsKey(diff)){
                return new int[]{hmap.get(diff),i};
            }
            hmap.put(num,i);
        }
        return new int[]{-1,-1};
    }
}
