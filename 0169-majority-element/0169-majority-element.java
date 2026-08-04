class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        int mj = n/2;

        if (n==1){
            return nums[0];
        }

        for(int val : nums){
            int freq = 0;
            for(int ele : nums){
                if (val == ele){
                    freq++;
                }
            }
            if (freq > mj){
                return(val);
            }
        }
        return -1;
        }
        
    }