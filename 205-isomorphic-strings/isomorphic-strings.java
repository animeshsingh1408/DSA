class Solution {
    public boolean isIsomorphic(String s, String t) {
        // HashSet<Character> set1= new HashSet();
        // HashSet<Character> set2= new HashSet();
        // for(int i=0;i<s.length();i++){
        //     set1.add(s.charAt(i));
        // }
        //  for(int i=0;i<t.length();i++){
        //     set2.add(t.charAt(i));
        // }
        // if(set1.size()==set2.size())
        // return true;
        // return false;

       HashMap<Character, Character> map1 = new HashMap<>();
HashMap<Character, Character> map2 = new HashMap<>();

for (int i = 0; i < s.length(); i++) {

    char a = s.charAt(i);
    char b = t.charAt(i);

    if (map1.containsKey(a) && map1.get(a) != b)
        return false;

    if (map2.containsKey(b) && map2.get(b) != a)
        return false;

    map1.put(a, b);
    map2.put(b, a);
}

return true;
    }
}