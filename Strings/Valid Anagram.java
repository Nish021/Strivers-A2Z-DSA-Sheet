class Solution {
    public boolean isAnagram(String s, String t) {
        Integer[] letters = new Integer[26];
        Arrays.fill(letters,0);//to avoid null pointer exception beacuse we are using Integer

        // for(int i = 0; i < s.length() ; i++){
        //     Character ch = s.charAt(i);
        //     letters[ch - 'a']++;
        // }

        for(char ch : s.toCharArray()){
            letters[ch - 'a']++;
        }

        // for(int i = 0; i < t.length() ; i++){
        //     Character ch = t.charAt(i);
        //     letters[ch-'a']--;

        //     if(letters[ch-'a'] < 0)
        //     return false;
        // }

         for(char ch : t.toCharArray()){
            letters[ch-'a']--;

            if(letters[ch-'a'] < 0)
            return false;
        }

        // for(int i = 0; i < 26 ; i++){
        //     if(letters[i] != 0)
        //     return false;
        // }

        for(int i : letters){
            if(i != 0)
            return false;
        }

        return true;
    }
}
