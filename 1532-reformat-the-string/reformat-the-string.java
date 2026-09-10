class Solution {
    public String reformat(String s) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            int p = s.charAt(i);

            if(p >= 97 && p <= 122) {
                sb1.append(s.charAt(i));
            } else {
                sb2.append(s.charAt(i));
            }
        }

        if(Math.abs(sb1.length() - sb2.length()) > 1)
            return "";

        if(sb2.length() > sb1.length()) {
            StringBuilder temp = sb1;
            sb1 = sb2;
            sb2 = temp;
        }

        StringBuilder sb3 = new StringBuilder();

        for(int i = 0; i < sb2.length(); i++) {
            sb3.append(sb1.charAt(i));
            sb3.append(sb2.charAt(i));
        }

        if(sb1.length() > sb2.length()) {
            sb3.append(sb1.charAt(sb1.length() - 1));
        }

        return sb3.toString();
    }
}