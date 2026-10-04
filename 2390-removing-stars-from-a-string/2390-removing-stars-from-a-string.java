class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(char s1 : s.toCharArray()){
            if(s1 == '*'){
                st.pop();
            }
            else{
                st.push(s1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : st){
            sb.append(c);
        }
        return sb.toString();
    }
}