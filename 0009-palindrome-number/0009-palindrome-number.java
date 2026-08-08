class Solution {
    public boolean isPalindrome(int x) {
        int res = 0 ;
        int copy = x;
       while(x >= 1){
        res = res*10 + x%10;
        x=x/10;
       }
        if(copy == res){
        return true;
        }
    else
    return false;
    }
}