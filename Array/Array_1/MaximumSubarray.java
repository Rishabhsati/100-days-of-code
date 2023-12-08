package Array_1;

import java.util.*;

public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int ans = soln(nums);
        System.out.println("Maximum subarray length : " + ans);
    }
    public static int soln(int [] nums){
        int sum = 0 , maxi = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            maxi = Math.max(sum,maxi);
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
}
