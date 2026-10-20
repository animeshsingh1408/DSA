class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n=strs.length;
        String a=strs[0];
        String b=strs[n-1];
        int i=0,j=0;
        StringBuilder sb = new StringBuilder();
        while((i<a.length() && j<b.length()) && a.charAt(i)==b.charAt(j)){
            sb.append(a.charAt(i));
            i++; j++;
        }
        return sb.toString();
    }
}