class Solution {
    public int numOfSubarrays(int[] arr) {
        final int mod = 1_000_000_007;
        int sum = 0 ;
        int odd = 0 ; 
        int even = 1 ;
        long res = 0 ; 
        for(int n : arr){
            sum +=n ;
            if(sum % 2 != 0){
                res += even ;
                odd++;
            }
            else{
                res += odd ;
                even++;
            }
        }

        return (int) (res%mod) ;
    }
}