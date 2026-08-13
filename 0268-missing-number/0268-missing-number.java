class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedsum = n * (n+1) / 2;
        int sum = 0 ;  int i = 0 ;
        while(i < nums.length ){
            sum += nums[i++];
        }

        return 
         expectedsum - sum ;
    }
}