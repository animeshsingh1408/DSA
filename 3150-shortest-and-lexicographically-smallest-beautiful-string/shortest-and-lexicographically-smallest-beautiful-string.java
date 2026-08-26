class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
         int a = 0;
        while (a < n && s.charAt(a) == '0') {
            a++;
        }

        if (a == n) {
            return "";
        }
        int min=0,max=0,res=Integer.MAX_VALUE;
        for(int i=a;i<n;i++){
            if(s.charAt(i)=='0')
            continue;
            int c = 0;
            for(int j=i;j<n;j++){
                char p=s.charAt(j);
                if(p=='1'){
                    c++;
                }
                    if(c==k){
                        int start = i;
                    while (start < j && s.charAt(start) == '0') {
                        start++;
                    }
                     int length = j - start + 1;

                    if (length < res) {
                        res = length;
                        min = start;
                        max = j;
                    }
                    else if (length == res) {

                        // Lexicographically smaller substring
                        String current = s.substring(start, j + 1);
                        String previous = s.substring(min, max + 1);

                        if (current.compareTo(previous) < 0) {
                            min = start;
                            max = j;
                        }
                    }

                        
                        break;
                }
            }
        }
         if (res == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(min, max + 1);
    }
}