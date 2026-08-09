class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int max_water = 0;

        while(left < right){
            int w = right - left;
            int ht = Math.min(height[left], height[right]);
            int curr_water = w*ht;
            max_water = Math.max(max_water, curr_water);

            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return max_water;
    }
}