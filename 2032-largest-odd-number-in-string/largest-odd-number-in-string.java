class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        for(int i=n-1;i>=0;i--){
            int p='0'-num.charAt(i);
            if(p%2!=0){
                return num.substring(0, i+1);
            }
        }
        return "";
    }
}