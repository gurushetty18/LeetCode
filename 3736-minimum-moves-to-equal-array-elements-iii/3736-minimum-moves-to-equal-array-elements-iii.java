class Solution {
    public int minMoves(int[] nums) {
        int moves = 0 ;
        int maxElement =Integer.MIN_VALUE;
        for(int n : nums){
            maxElement = Math.max(maxElement , n);
            
        }

        for(int num : nums){

            moves += maxElement - num ;
        }
        return moves ;
    }
}