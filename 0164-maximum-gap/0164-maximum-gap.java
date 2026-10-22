class Solution {
    public int maximumGap(int[] nums) {
        
        if(nums.length == 1) return 0 ;
        Arrays.sort(nums);
int max = 0 ;
        for(int i = nums.length-1 ; i > 0 ; i--){
            max = Math.max(max , nums[i] - nums[i-1]);
            
        }
        return max ;
    }
}