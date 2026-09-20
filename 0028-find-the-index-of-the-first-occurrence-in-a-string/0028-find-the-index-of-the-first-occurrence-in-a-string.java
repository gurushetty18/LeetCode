class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        for(int i = 0 ; i <= haystack.length()-n; i++){
            String h = haystack.substring(i , n+i);
            if(h.equals(needle)){
                return i ;
            }
        }
        return -1 ;
        
    }
}