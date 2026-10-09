class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        String lastWord = "";
        for(String s1 : words){
            lastWord = s1 ;
        }
        return lastWord.length();
    }
}