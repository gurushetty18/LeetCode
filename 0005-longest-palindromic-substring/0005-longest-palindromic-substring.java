class Solution {
    public static Boolean ispalindrom(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sb = s.substring(i, j);

                if (ispalindrom(sb) && sb.length() > res.length()) {
                    res = sb;  
                }
            }
        }
        return res;
    }
}
