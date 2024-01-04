class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] ss = new char[256];
        char[] tt = new char[256];

        for(int i = 0; i < s.length(); i++){
            if(ss[s.charAt(i)] == 0 && tt[t.charAt(i)] == 0){
                ss[s.charAt(i)] = t.charAt(i);
                tt[t.charAt(i)] = s.charAt(i);
            } else if(ss[s.charAt(i)] != t.charAt(i))
                return false;
        }
        return true;
    }
}
