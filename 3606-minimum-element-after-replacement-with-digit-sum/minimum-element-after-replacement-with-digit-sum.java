class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i: nums){
            int p=i;
            int s=0;
            while(p>0){
                s=s+(p%10);
                p=p/10;
            }
            if(min>s)
            min=s;
        }
        return min;
    }
}