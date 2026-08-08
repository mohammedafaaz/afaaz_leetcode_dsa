class Solution {
    public int maxSubArray(int[] nums) {
        int cur_sum = 0, max_sum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            cur_sum += nums[i];
            max_sum = Math.max(cur_sum, max_sum);

            if(cur_sum < 0){
                cur_sum = 0;
            }
        }
        return max_sum;
    }
}