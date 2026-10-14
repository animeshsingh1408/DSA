public class Solution {
    public bool IsPowerOfTwo(int n) {
        if(n<=0)
    return false;
    int p=n & n-1;
    if(p==0)
    return true;
    return false;
    }
}