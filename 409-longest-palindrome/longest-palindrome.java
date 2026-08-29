class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
        if(map.containsKey(s.charAt(i))){
            map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }
        else
        map.put(s.charAt(i),1);
        }
        int sum=0,c=0;
         for(char key : map.keySet()) {

            int freq = map.get(key);

            if(freq % 2 == 0) {
                sum += freq;
            }
            else {
                sum += freq - 1;
                c = 1;
            }
        }
        return sum+c;
    }
}