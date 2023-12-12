package Array_4;

import java.util.Scanner;

public class MajorityElement1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int ans  = findMajority(nums,n);
        if(ans != -1){
            System.out.println("Element that occurs greater than n/2 times : "+ans);
        }
        System.out.println("No element found that occurs greater than n/2 times ");
    }

    private static int findMajority(int[] nums,int n) {
        int ele = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            if(count==0){
                ele = nums[i];
                count++;
            }
            else if(ele==nums[i]) count++;
            else count--;
        }
        count = 0;
        for(int i=0;i<n;i++){
            if(ele==nums[i]) count++;
        }

        if(count > (n/2)){
            return ele;
        }
        return -1;
    }
}
