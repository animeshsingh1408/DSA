class Solution {
    public int numOfSubarrays(int[] arr) {
        // int n=arr.length,s=0;
        // for(int i=0;i<n;i++){
        //     s+=arr[i];
        // }
        // int l=s;
        // int c=0;
        // if(s%2!=0)
        // c++;
        // for(int i=0;i<n;i++){
        //     l=l-arr[i];
        //     if(l%2!=0)
        //     c++;
        // }
        // l=s;
        // for(int i=n-1;i>0;i--){
        //     l=l-arr[i];
        //     if(l%2!=0)
        //     c++;
        // }
        // for(int i=1;i<n-1;i++){
        //     if(arr[i]%2!=0)
        //     c++;
        // }
        // return c;

        int mod=1000000007;

        long even=1;
        long odd=0;
        long sum=0;
        long count=0;

        for(int i:arr){
            sum+=i;
            if(sum%2==0){
            count = (count+odd)%mod;
            even++;
            }
            else{
                count = (count+even)%mod;
            odd++;
            }
        }
        return (int)count;
    }
}