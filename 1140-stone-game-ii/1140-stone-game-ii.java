class Solution {
    Integer[][] memo;
    int[] suffixSum;

    public int stoneGameII(int[] piles) {
        int n = piles.length;
        memo = new Integer[n][n + 1];
        suffixSum = new int[n];
        
       
        suffixSum[n - 1] = piles[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + piles[i];
        }
        
        return dp(piles, 0, 1);
    }

    private int dp(int[] piles, int i, int M) {
        if (i >= piles.length) return 0;
   
        if (i + 2 * M >= piles.length) {
            return suffixSum[i];
        }
        if (memo[i][M] != null) {
            return memo[i][M];
        }

        int maxStones = 0;
       
        for (int x = 1; x <= 2 * M; x++) {
           
            int opponentStones = dp(piles, i + x, Math.max(M, x));
            maxStones = Math.max(maxStones, suffixSum[i] - opponentStones);
        }

        return memo[i][M] = maxStones;
    }
}