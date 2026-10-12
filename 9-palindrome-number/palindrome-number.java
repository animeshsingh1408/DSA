class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int p=rev(x,0);
        if(p==x)
        return true;
        return false;
    }
    public int rev(int n,int r){
        if(n==0)
        return r;
        r=r*10+n%10;
        return rev(n/10,r);
    }
}