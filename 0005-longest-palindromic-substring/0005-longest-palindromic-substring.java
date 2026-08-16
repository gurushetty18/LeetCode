class Solution {
    // Helper to expand around a center and return the palindrome
    private String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // substring after expansion
        return s.substring(left + 1, right);
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        String res = "";
        for (int i = 0; i < s.length(); i++) {
            // Odd length palindrome
            String odd = expandAroundCenter(s, i, i);
            // Even length palindrome
            String even = expandAroundCenter(s, i, i + 1);

            // Pick the longer one
            String current = odd.length() > even.length() ? odd : even;

            if (current.length() > res.length()) {
                res = current;
            }
        }
        return res;
    }
}
