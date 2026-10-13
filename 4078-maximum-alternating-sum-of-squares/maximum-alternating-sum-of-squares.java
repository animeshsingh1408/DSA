class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length,p=0;
        if(n%2==0)
        p=n/2;
        else
        p=(n/2)+1;
        for(int i=0;i<n;i++){
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        long s1=0,s2=0;
        for(int i=n-1;i>=n-p;i--){
            s1=s1+(nums[i]*nums[i]);
        }
        for(int i=n-p-1;i>=0;i--){
            s2+=(nums[i]*nums[i]);
        }
        return s1-s2;
    }
}