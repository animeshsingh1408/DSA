class Solution {
    public int getLucky(String l, int k) {
        int n=l.length(),s=0;
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<n;i++){
            int p=(int)l.charAt(i)-96;
            while(p>=10){
                int rem=p%10;
                s+=rem;
                p=p/10;
            }
            s+=p;
        }
        while(k>1){
           int ans=0;
            while(s>0){
                int rem=s%10;
                ans+=rem;
                s=s/10;
            }
            s=ans;
            k--;
        }
        return s;
    }
}