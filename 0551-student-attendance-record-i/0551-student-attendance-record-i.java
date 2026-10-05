class Solution {
    public boolean checkRecord(String s) {
        int absents = 0;
        int consecutiveLates = 0;

        for (char c : s.toCharArray()) {
            if (c == 'A') {
                absents++;
                consecutiveLates = 0;
                if (absents >= 2) {
                    return false; 
                }
            } else if (c == 'L') {
                consecutiveLates++;
                if (consecutiveLates >= 3) {
                    return false; 
                }
            } else { 
                consecutiveLates = 0; 
            }
        }

        return true;
    }
}