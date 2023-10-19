package Recursion;

import java.io.*;
import java.util.*;

class Test{
    static boolean targetSum(int start, int[] nums, int target) {
        //write code here
        if(target==0){
            return true;
        }
        if(start==nums.length){
            return false;
        }
        boolean include= targetSum(start+1,nums,target-nums[start]);
        boolean exclude= targetSum(start+1,nums,target);

        return include||exclude;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(targetSum(0, arr, target));
        sc.close();
    }
}
