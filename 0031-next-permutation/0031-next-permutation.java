class Solution {
    public void nextPermutation(int[] nums) {
        int p = -1;

        // Find pivot
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                p = i;
                break;
            }
        }

        // No pivot -> reverse entire array
        if (p == -1) {
            reverseArray(nums, 0, nums.length - 1);
            return;
        }

        // Find element greater than nums[p]
        for (int i = nums.length - 1; i > p; i--) {
            if (nums[i] > nums[p]) {
                int temp = nums[i];
                nums[i] = nums[p];
                nums[p] = temp;
                break;
            }
        }

        // Reverse the suffix
        reverseArray(nums, p + 1, nums.length - 1);
    }

    public void reverseArray(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}