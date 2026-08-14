class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0 ;
        int maxlength = 0 ;
        int left = 0 ;
        HashSet<Character> set = new HashSet<Character>();
        for(int right = 0 ; right < s.length() ; right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left ++;
            }
            
            set.add(s.charAt(right));
            int length = right - left + 1 ;
            if(length>maxlength){
                maxlength = length;
                start = left ;
            }
        }
        return maxlength;
    }
}