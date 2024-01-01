class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int open = 0;

        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == '('){
                open++;
                if(open > 1){
                    // res = res + s.charAt(i);
                    res.append(s.charAt(i));
                }
            }else if(s.charAt(i) == ')'){
                open--;
                if(open != 0){
                    // res = res + s.charAt(i);
                    res.append(s.charAt(i));
                }
            }
        }
        return res.toString();
    }
}
