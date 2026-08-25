class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0, sum = 0, length = Integer.MAX_VALUE;

        while(right<nums.length){
            sum += nums[right];

            while(sum >= target){
                length = Math.min(length, right-left+1);
                sum -= nums[left];
                left++;
            }

            right++;
        }

        return length == Integer.MAX_VALUE ? 0 : length;
    }
}