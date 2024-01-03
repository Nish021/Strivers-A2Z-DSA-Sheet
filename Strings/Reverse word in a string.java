class Solution {
    public String reverseWords(String s) {
      String t =s.replaceAll("\\s+", " ").trim();;
      String[] str = t.split(" "); 
      StringBuilder res = new StringBuilder();
      for(int i = str.length-1; i > 0; i--){
          res.append(str[i]+" ");
      }
      res.append(str[0]);
      return res.toString();
    }
}
