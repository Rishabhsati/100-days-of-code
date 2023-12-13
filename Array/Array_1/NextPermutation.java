package Array_1;

import java.util.Scanner;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        soln(nums);
    }

    public static void soln(int[] nums){
        int ind = -1;
        int n = nums.length;
        // find the next greater element 
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind = i;
                break;
            }
        }
        // if there is no greater element we will reverse the whole array 
        if(ind == -1){
            int end = n-1;
            int start = 0;
            while(end>start){
                int temp=nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        else{
            // if we found that index which is greater we will swap that index 
            for(int i=n-1;i>ind;i--){
                if(nums[i]>nums[ind]){
                int temp = nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                break;
                }
            }
            // after swaping that index the rest of the element will be in sorted manner to make it next Permutation
            int s = ind+1;
            int e = n-1;
            while(e>s){
                int t = nums[e];
                nums[e]=nums[s];
                nums[s]=t;
                s++;
                e--;
            }
        }
        // for printing the answer
        for(int ele:nums){
            System.out.print(ele+" ");
        }
    }
}
