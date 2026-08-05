class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int i,j;
        Arrays.sort(nums);
        if(n==1){
            return nums[0];
        }

        for(i=0;i<n-1;i+=2){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return nums[n-1];
    }
}