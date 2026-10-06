class Solution {
    public int minAddToMakeValid(String s) {
        int open_needed = 0; 
        int additions = 0;   

        for (char c : s.toCharArray()) {
            if (c == '(') {
                open_needed++;
            } else if (c == ')') {
                if (open_needed > 0) {
                    open_needed--; 
                } else {
                    additions++;   
                }
            }
        }

        
        return additions + open_needed;
    }
}