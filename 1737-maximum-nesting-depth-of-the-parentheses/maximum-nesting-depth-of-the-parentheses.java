class Solution {
    public int maxDepth(String s) {
        int c=0,ans=-1;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(')
            c++;
            else if(s.charAt(i)==')')
            c--;
            ans=Math.max(ans,c);
        }
        return ans;
    }
}