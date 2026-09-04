class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length,a=-1,b=nums[n-1];
        int[] max= new int[n];
        int[] min= new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>a){
                a=nums[i];
            }
            max[i]=a;
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]<b){
                b=nums[i];
            }
            min[i]=b;
        }
         for(int i=0;i<n;i++){
            if(max[i]-min[i]<=k){
                return i;
            }
         }
         return -1;
    }
}