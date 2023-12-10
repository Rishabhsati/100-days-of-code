package Array_3;

import java.util.Scanner;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int ans = findDuplicate(nums);
        System.out.println(ans);
    }

    public static int findDuplicate(int[] nums) {
        // APPROACH 1 
        // Arrays.sort(nums);
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i-1]==nums[i]){
        //         return nums[i];
        //     }
        // }
        // return -1;

        // APPROACH 2 
        int slow = nums[0];
        int fast = nums[0];
        
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);

        fast = nums[0];
        while(fast!=slow){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
