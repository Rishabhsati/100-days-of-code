package Array_5;

import java.util.ArrayList;
import java.util.Scanner;

public class MajorityElement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        ArrayList<Integer> list = findMajorityElement2(nums);
        for(int ele:list){
            System.out.print(ele+" ");
        }
    }

    private static ArrayList<Integer> findMajorityElement2(int[] nums) {
        // Approach 1 using HasMap 
        // tc = O(n) , Sc = O(n)
        // HashMap<Integer,Integer> hmap = new HashMap<>();
        // List<Integer> list = new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //         int value = hmap.getOrDefault(nums[i],0);
        //         hmap.put(nums[i],value+1);
        // }
        // for(int key:hmap.keySet()){
        //     if(hmap.get(key) > (nums.length/3))
        //         list.add(key);
        // }
        // return list;

        // Approach 2 Extend version of Moore’s Voting Algorithm 
        // tc = O(n) , Sc = O(1)
        int cnt1 = 0 , cnt2 = 0;
        int ele1 = Integer.MIN_VALUE , ele2 = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i=0;i<n;i++){
            if(cnt1==0 && nums[i]!=ele2){
                cnt1++;
                ele1 = nums[i];
            }
            else if(cnt2==0 && nums[i]!=ele1){
                cnt2++;
                ele2 = nums[i];
            }
            else if(ele1 == nums[i]) cnt1++;
            else if(ele2 == nums[i]) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int i=0;i<n;i++){
            if(ele1 == nums[i]) cnt1++;
            if(ele2 == nums[i]) cnt2++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        if(cnt1 > (n/3)){
            list.add(ele1);
        }
        if(cnt2 > (n/3)){
            list.add(ele2);
        }
        return list;
    }
}
