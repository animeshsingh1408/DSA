class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int n=nums.length;
        long[] sum=new long[n];
        long[] mul=new long[n];
       
        for(int i=1;i<n;i++){
           sum[i] = sum[i - 1] + nums[i - 1];
        }
        long p = 1;
        mul[n - 1] = 1;

        long LIMIT = 100000000000000L;

    

        for(int i=n-2;i>=0;i--){
             if (p > LIMIT / nums[i+1]) {
                p = LIMIT + 1;
            } else {
                p *= nums[i+1];
            }

            mul[i] = p;
        }
        for(int i=0;i<n;i++){
            if(sum[i]==mul[i])
            return i;
        }
        return -1;
    }
}


  /*  Why LIMIT / nums[i]?

      Instead of doing:
      p * nums[i]
      and then discovering that it overflowed, we check beforehand:
      if (p > LIMIT / nums[i])
      If that's true, the product would exceed LIMIT.   */