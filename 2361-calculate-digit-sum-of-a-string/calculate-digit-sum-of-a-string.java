class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder();
        int p=0,c=0;
        while(sb.length()>k){
        for(int i=0;i<sb.length();i++){
            p=p+ (int)(sb.charAt(i)-'0');
            c++;
            if(c==k ||i==sb.length()-1){
            sb2.append(p);
            c=0; 
            p=0;
            }
        }
        sb.setLength(0);
        sb.append(sb2);
        sb2.setLength(0);
    }
    
    return sb.toString();
    }
}