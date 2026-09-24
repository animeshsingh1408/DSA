class Solution:
    def smallestIndex(self, nums: List[int]) -> int:
        for i in range(len(nums)):
            sum=0
            while(nums[i]>0):
                rem=nums[i]%10
                sum+=rem
                nums[i]=nums[i]//10
            if(sum==i):
                return i
        return -1