import java.util.*;

public class LongestConsecutiveSeq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        int ans = longestConsecutive(nums);
        System.out.println(ans);
    }
    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
 
        if(n==0) return 0;
        Arrays.sort(nums);
 
        int lastSmaller = Integer.MIN_VALUE;
        int longest = 1;
        int count = 0;
 
        for(int i=0;i<n;i++){
            if(nums[i] - 1 == lastSmaller){
                count++;
                lastSmaller = nums[i];
            }else if(nums[i] != lastSmaller){
                count=1;
                lastSmaller = nums[i];
            }
            longest = Math.max(count,longest);
        }
        return longest;
     }
}
