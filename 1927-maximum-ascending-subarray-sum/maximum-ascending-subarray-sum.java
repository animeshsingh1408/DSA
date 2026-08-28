class Solution {
    public int maxAscendingSum(int[] nums) {
        // int s=0,max=Integer.MIN_VALUE,n=nums.length;
        // int i=0,j=1;
        // while(j<n){
        //     if(nums[i]<nums[j]){
        //         s+=nums[i];
        //     }
        //     else{
        //         s+=nums[i];
        //         max=Math.max(max,s);
        //         s=0;
        //     }
        //     i++;
        //     j++;
        // }
        // if(s!=0)
        //  max=Math.max(max,s);
        // return max;


        int n=nums.length,s=nums[0],max=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(nums[i-1]<nums[i]){
                s+=nums[i];
            }
            else{
                max=Math.max(max,s);
                s=0;
                s+=nums[i];
            }
        }
        if(s!=0)
        max=Math.max(max,s);
        return max;
    }
}