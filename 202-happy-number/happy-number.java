class Solution {
    public boolean isHappy(int n) {
         long m=n;
         HashSet<Long> set = new HashSet<>();
         set.add(m);
         while(m>0){
            long s=0,temp=m;
            while(temp>0){
                long rem=temp%10;
                long p=rem*rem;
                s+=p;
                temp/=10;
            }
            if(s==1)
            return true;
           m=s;
            if(set.contains(m))
            return false;
             set.add(m);
         }
         return false;
    }  
}