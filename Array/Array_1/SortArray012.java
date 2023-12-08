package Array_1;

import java.util.Scanner;

public class SortArray012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        sortArr(nums);
    }
    public static void sortArr(int[] nums){
        int low = 0,mid = 0 , high = nums.length-1;
        while(high>=mid){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high]= temp;
                high--;
            }
        }
        for(int ele:nums){
            System.out.print(ele+" ");
        }
    }
}
