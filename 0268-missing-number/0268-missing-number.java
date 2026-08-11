class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int exp_sum = n*(n + 1) / 2;
        int actual_sum = 0;

        for(int i = 0; i < n; i++){
            actual_sum += nums[i];
        }
        
        int ans = exp_sum - actual_sum;
        return ans;
    }
}