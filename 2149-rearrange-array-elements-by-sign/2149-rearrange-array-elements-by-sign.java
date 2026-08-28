class Solution {
    public int[] rearrangeArray(int[] nums) {

        if(nums.length <= 0) return new int[0];

        int n = nums.length;
        int[] arr = new int[n];
        int positive = 0 ; int negative = 1 ;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] > 0){
                arr[positive] = nums[i] ;
                positive+=2;
            }
            else{
                arr[negative] = nums[i] ;
                negative+=2;
            }
        }
        return arr ;
    }
}