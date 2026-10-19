class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
     
        List<Integer> li = new ArrayList<>();
Arrays.sort(nums);
        for(int num = 0 ; num < nums.length ; num++){
            if(nums[num] == target)
            {
                li.add(num);
            }
           
        }
        if(li.isEmpty()){

         return new ArrayList<Integer>();

         }
        return li;
    }
}