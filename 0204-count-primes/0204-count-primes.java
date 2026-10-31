class Solution {
    public int countPrimes(int n) {
        if( n <= 0 || n == 1) return 0 ;
int count = 0 ;
       
      boolean [] isPrime = new boolean[n] ;
      for(int i = 2 ; i < n ; i++){
        isPrime[i] = true ;
      }

      for(int j = 2 ; j * j < n ; j++){
        if(isPrime[j]){
            for(int k = j * j ; k < n ; k+=j){
                isPrime[k] = false ;
            }
        }
      }

      for(int i = 2 ; i < n ; i++){
        if(isPrime[i]) count++;
      }
      return count;
    }
}