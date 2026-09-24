class Solution:
    def dominantIndex(self, nums: list[int]) -> int:
        max=-1
        smax=-2
        for i in range(len(nums)):
            if nums[i]>max:
                smax=max
                ans=i
                max=nums[i]
            elif nums[i]>smax:
                smax=nums[i]
        if max>=2*smax:
            return ans
        return -1