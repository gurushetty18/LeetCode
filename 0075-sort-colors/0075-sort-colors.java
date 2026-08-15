class Solution {
    public void sortColors(int[] nums) {
        int counter0 = 0 ;
        int counter1 = 0 ;
        int counter2 = 0 ;
        for(int num : nums){
            switch (num) {
                case 0 : 
                counter0++;
                break;
                 case 1 : 
                counter1++;
                break;
                 case 2 : 
                counter2++;
                break;
            }
        }
            int index = 0 ;
            while(counter0-- > 0) nums[index++] = 0 ;
            while(counter1-- > 0) nums[index++] = 1 ;
            while(counter2-- > 0) nums[index++] = 2 ;

            System.out.println(Arrays.toString(nums));
    }
}