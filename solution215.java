class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return k>nums.length?-1:nums[nums.length-k];
    }
}
