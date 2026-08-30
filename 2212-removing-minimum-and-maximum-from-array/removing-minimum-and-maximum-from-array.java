class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int max=nums[0],min=nums[0],maxi=0,mini=0;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                maxi=i;
            }
            if(nums[i]<min){
                min=nums[i];
                mini=i;
            }
        }
        int p=Math.max(maxi,mini)+1;
        System.out.println(p);
        int q=Math.min(maxi,mini);
        q=n-q;
        int a=Math.min(maxi,mini)+1;
        int b=Math.max(maxi,mini);
        b=n-b;
        int r=a+b;
        int t=Math.min(p,q);
        System.out.println(t);
        return Math.min(r,t);

    }
}