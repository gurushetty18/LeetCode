class Solution {
    public int majorityElement(int[] nums) {
       Stack<Integer> st = new Stack<>();
       Map<Integer , Integer > mp = new HashMap<>();
       int majority = 0 ;
       for(int i = 0 ; i < nums.length ; i ++){
       mp.put(nums[i] , mp.getOrDefault(nums[i] , 0)+1) ;

       if(mp.get(nums[i]
       ) > nums.length / 2){
        return nums[i] ;
       }
       }
      return -1 ;
       }
   
}