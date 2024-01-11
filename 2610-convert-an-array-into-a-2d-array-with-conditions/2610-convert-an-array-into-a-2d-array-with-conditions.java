class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;
        int freq[] = new int[len+1];
        for(int i:nums){
            if(freq[i] >= ans.size()){
                ans.add(new ArrayList<>());
            }
            ans.get(freq[i]).add(i);
            freq[i]++;
        }
        return ans;
    }
}