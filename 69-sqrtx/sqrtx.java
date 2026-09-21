class Solution {
    public int mySqrt(int x) {
        int s=1;
        int e=x;
        while(s<=e)
        {
            int m=s+(e-s)/2;
            long v=(long)m*m;
            if(v==x){
                return m;
            }
            else if(v<x)
            s=m+1;
            else
            e=m-1;
        }
        return e;
        
    }
}