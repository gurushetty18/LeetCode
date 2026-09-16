class Solution {
    public boolean judgeSquareSum(int c) {
        int start = 0;
        int end = (int)Math.sqrt(c); 

        while (start <= end) {
            long target = (long)start * start + (long)end * end; 
            if (target == c) {
                return true;
            }
            if (target < c) {
                start++;
            } else {
                end--;
            }
        }
        return false;
    }
}
