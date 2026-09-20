class Solution {
    public int buyChoco(int[] nums, int money) {
        Arrays.sort(nums);
        int sum=nums[0]+nums[1];
        if(money-sum>=0)
        return money-sum;
        return money;
    }
}