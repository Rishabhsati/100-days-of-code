// https://leetcode.com/problems/3sum/description/

package Array_5;

import java.util.*;

public class Array3Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        List<List<Integer>> result = threeSum(nums);
        // Sort all lists inside the list first
        for (int i = 0; i < result.size(); i++) {
            Collections.sort(result.get(i));
        }
        // Sort the list
        Collections.sort(result, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> l1, List<Integer> l2) {
                for (int i = 0; i < l1.size(); i++) {
                    if (l1.get(i) < l2.get(i))
                        return -1;
                    else if (l1.get(i) > l2.get(i))
                        return 1;
                }
                return 0;
            }
        });
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0)
                    j++;
                else if (sum > 0)
                    k--;
                else {
                    List<Integer> curr = new ArrayList<>();
                    curr.add(nums[i]);
                    curr.add(nums[j]);
                    curr.add(nums[k]);
                    list.add(curr);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1])
                        j++;
                    while (k >= 0 && nums[k] == nums[k + 1])
                        k--;
                }
            }
        }
        return list;
    }
}
